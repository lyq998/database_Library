package test;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import model.Book;

@WebServlet("/Addbook")
public class AddBookServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			Book book = new Book();
			book.setCallnumber(request.getParameter("callnumber"));
			book.setIsbn(request.getParameter("isbn"));
			book.setName(request.getParameter("name"));
			book.setAuthor(request.getParameter("author"));
			book.setPublisher(request.getParameter("publisher"));
			book.setPrice(Float.valueOf(request.getParameter("price")));

			BookDao dao = new BookDao();
			int flag = dao.addBook(book);

			if (flag == 1) {
				response.sendRedirect("/pgtest/managerIndex.jsp");
			} else {
				PrintWriter out = response.getWriter();
				out.print("<script>alert('The callnumber already exists');window.location='add_books.jsp' </script>");
				out.flush();
				out.close();
			}
		} catch (Exception e) {
		}
	}
}
