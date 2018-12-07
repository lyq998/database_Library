package test;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BorrowDao;
import model.BorrowBook;

@WebServlet("/ShowBorrowedBook")
public class ShowBorrowedBookServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String username = request.getParameter("username");
			BorrowDao dao = new BorrowDao();
			List<BorrowBook> borrow_books = dao.showBorrowedBook(username);
			if (borrow_books != null) {
				request.setAttribute("borrowbooks", borrow_books);
			}
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/show_borrowed_book.jsp");
			rd.forward(request, response);
		} catch (Exception e) {

		}
	}

}
