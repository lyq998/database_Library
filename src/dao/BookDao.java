package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Book;
import util.DbHelper;

public class BookDao {
	private static DbHelper helper = new DbHelper();

	public List<Book> getBookByName(String bookname) throws Exception {
		String sql = "SELECT * FROM book WHERE lower(name) like '%" + bookname + "%' ";

		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<Book> books = new ArrayList<Book>();
		Book book = null;
		while (rs.next()) {
			String callnumber = rs.getString("callnumber");
			String isbn = rs.getString("isbn");
			String name = rs.getString("name");
			String author = rs.getString("author");
			String publisher = rs.getString("publisher");
			Float price = rs.getFloat("price");
			book = new Book(callnumber, isbn, name, author, publisher, price);
			books.add(book);
		}
		return books;
	}

	public int addBook(Book book) throws Exception {
		String sql = "Insert into book (callnumber,isbn,name,author,publisher,price) values('" + book.getCallnumber()
				+ "','" + book.getIsbn() + "','" + book.getName() + "','" + book.getAuthor() + "','"
				+ book.getPublisher() + "'," + book.getPrice() + ")";

		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		int flag = ps.executeUpdate();

		return flag;
	}
}
