package test;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import model.BorrowBook;

@WebServlet("/Search")
public class SearchBookServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String name = request.getParameter("name");
			BookDao dao = new BookDao();
			List<BorrowBook> borrow_books = dao.getBookByName(name);
			if (borrow_books != null) {
				request.setAttribute("borrowbooks", borrow_books);
			}
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/show_books.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
		}
	}
}
