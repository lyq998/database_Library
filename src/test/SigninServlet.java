package test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/Signin")
public class SigninServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String username = request.getParameter("username");
			String password = request.getParameter("password");

			User user = new User();
			user.setUsername(username);
			user.setPassword(password);

			UserDao userdao = new UserDao();
			int flag = userdao.insertUser(user);

			if (flag == 1) {
				response.sendRedirect("/pgtest/login.jsp");
			} else {
				response.sendRedirect("/pgtest/signin.jsp");
			}
		} catch (Exception e) {
			try {
				response.sendRedirect("/pgtest/signin.jsp");
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		}
	}
}
