package test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;

@WebServlet("/DeleteBook")
public class DeleteBookServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String callnumber = request.getParameter("callnumber");
			BookDao dao = new BookDao();
			int flag = dao.deleteBook(callnumber);

			if (flag == 1) {
				response.sendRedirect("/pgtest/managerIndex.jsp");
			} else {
				response.sendRedirect("/pgtest/show_update_book.jsp");
			}

		} catch (Exception e) {

		}
	}

}
