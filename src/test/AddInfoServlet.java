package test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InfoDao;

@WebServlet("/AddInfo")
public class AddInfoServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String text = request.getParameter("text");
			String manager = request.getParameter("manager");
			InfoDao infodao = new InfoDao();
			int flag = infodao.AddInfo(text);

			if (flag == 1) {
				response.sendRedirect("/pgtest/managerIndex.jsp?manager=" + manager);
			}

		} catch (Exception e) {

		}
	}
}
