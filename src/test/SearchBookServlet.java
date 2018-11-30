package test;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import model.Book;

@WebServlet("/Search")
public class SearchBookServlet extends HttpServlet {
	public void doPost( HttpServletRequest request, HttpServletResponse response )
		{
			try
			{
				request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("text/html;charset=utf-8");
			    String name = request.getParameter( "name" );
			    BookDao dao = new BookDao();
//			    List <Book> books = dao.getBookByName(name.toLowerCase());
			    List <Book> books = dao.getBookByName(name);
			    if(books!=null){
			    	request.setAttribute("books", books);
			    }
			    RequestDispatcher rd = getServletContext().getRequestDispatcher( "/show_books.jsp" );
			    rd.forward(request, response);
			  }
			catch( Exception e ){
			}
		}
}
