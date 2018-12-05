package test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ManagerDao;
import model.Manager;

@WebServlet("/ManagerLogin")
public class ManagerLoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String managername = request.getParameter("managername");
			String password = request.getParameter("password");

			Manager manager = new Manager();
			manager.setManagername(managername);
			manager.setPassword(password);

			ManagerDao managerdao = new ManagerDao();
			boolean flag = managerdao.Login(manager);

			if (flag) {
				response.sendRedirect("/pgtest/managerIndex.jsp?manager=" + managername);
			} else {
				response.sendRedirect("/pgtest/managerLogin.jsp");
			}
		} catch (Exception e) {
			try {
				response.sendRedirect("/pgtest/managerLogin.jsp");
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		}
	}

}
