package test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InfoDao;

@WebServlet("/DeleteInfo")
public class DeleteInfoServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String Stringid = request.getParameter("id");
			int id = Integer.parseInt(Stringid);
			InfoDao dao = new InfoDao();
			int flag = dao.deleteInfo(id);

			if (flag == 1) {
				response.sendRedirect("/pgtest/managerIndex.jsp?manager=lyq");
			} else {
				response.sendRedirect("/pgtest/login.jsp");
			}
		} catch (Exception e) {

		}
	}

}
