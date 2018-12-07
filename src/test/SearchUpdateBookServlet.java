package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import model.Book;

@WebServlet("/SearchUpdateBook")
public class SearchUpdateBookServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("text/html;charset=utf-8");
			String callnumber = request.getParameter("callnumber");
			BookDao dao = new BookDao();
			Book book = dao.getBookByCallnumber(callnumber);
			if (book != null) {
				request.setAttribute("book", book);
				request.setAttribute("callnumber", callnumber);
			}
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/show_update_book.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			try {
				response.sendRedirect("/pgtest/update_book.jsp");
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		}
	}

}
