package test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import model.Book;

@WebServlet("/UpdateBook")
public class UpdateBook extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String callnumber = request.getParameter("callnumber");
			System.out.println(callnumber);
			String isbn = request.getParameter("isbn");
			String name = request.getParameter("name");
			String author = request.getParameter("author");
			String publisher = request.getParameter("publisher");
			String price = request.getParameter("price");
			float floatprice = Float.parseFloat(price);
			Book book = new Book(callnumber, isbn, name, author, publisher, floatprice);
			BookDao dao = new BookDao();
			int flag = dao.updateBook(book);

			if (flag == 1) {
				response.sendRedirect("/pgtest/managerIndex.jsp");
			} else {
				response.sendRedirect("/pgtest/update_book.jsp");
			}
		} catch (Exception e) {

		}
	}

}
