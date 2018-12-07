package test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BorrowDao;

@WebServlet("/ReturnBook")
public class ReturnBookServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String callnumber = request.getParameter("callnumber");
			BorrowDao dao = new BorrowDao();
			int flag = dao.returnBook(callnumber);

			if (flag == 1) {
				response.sendRedirect("/pgtest/managerIndex.jsp");
			} else {
				response.sendRedirect("/pgtest/return_book.jsp");
			}
		} catch (Exception e) {

		}
	}

}
