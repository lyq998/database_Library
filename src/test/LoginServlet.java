package test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			UserDao user = new UserDao();
			boolean flag = user.Login(username, password);

			if (flag) {
				response.sendRedirect("/pgtest/index.jsp?user=" + username);
			} else {
				response.sendRedirect("/pgtest/login.jsp");
			}
		} catch (Exception e) {
			try {
				response.sendRedirect("/pgtest/login.jsp");
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		}
	}
}
