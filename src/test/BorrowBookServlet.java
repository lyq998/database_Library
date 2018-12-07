package test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BorrowDao;
import model.Borrow;

@WebServlet("/BorrowBook")
public class BorrowBookServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String callnumber = request.getParameter("callnumber");
			String username = request.getParameter("username");
			Borrow borrow = new Borrow();
			borrow.setCallnumber(callnumber);
			borrow.setUsername(username);

			BorrowDao dao = new BorrowDao();
			int flag = dao.borrowBook(borrow);

			if (flag == 1) {
				response.sendRedirect("/pgtest/managerIndex.jsp");
			} else {
				response.sendRedirect("/pgtest/borrow_book.jsp");
			}

		} catch (Exception e) {

		}
	}

}
