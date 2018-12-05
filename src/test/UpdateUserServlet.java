package test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/Update_user")
public class UpdateUserServlet extends HttpServlet {
	String username0;

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String username = request.getParameter("user");
			String password = request.getParameter("password");
			String realname = request.getParameter("realname");
			String sex = request.getParameter("sex");
			String telnumber = request.getParameter("telnumber");
			username0 = username;
//			System.out.println(username);

			User user = new User(username, password, realname, sex, telnumber);
			UserDao dao = new UserDao();
			int flag = dao.updateUser(user);

			if (flag == 1) {
				response.sendRedirect("/pgtest/index.jsp?user=" + username);
			} else {
				response.sendRedirect("/pgtest/update_user.jsp?user=" + username);
			}

		} catch (Exception e) {
			try {
				response.sendRedirect("/pgtest/update_user.jsp?user=" + username0);
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		}
	}
}
