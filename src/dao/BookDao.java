package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.BorrowBook;
import util.DbHelper;

public class BookDao {
	public List<BorrowBook> getBookByName(String bookname) throws Exception {
		String sql = "select b.callnumber,isbn,name,author,publisher,price,username,backtime "
				+ "from  book b,borrow bo " + "where b.callnumber=bo.callnumber and b.callnumber in"
				+ "(select callnumber from book " + "where lower(name) like '%" + bookname + "%') union "
				+ "select b1.callnumber,isbn,name,author,publisher,price,'' username,'' backtime "
				+ "from book b1,borrow bo1 " + "where b1.callnumber in"
				+ "(select callnumber from book where lower(name) like '%" + bookname
				+ "%') and b1.callnumber not in (select callnumber from borrow)";

		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		List<BorrowBook> borrow_books = new ArrayList<BorrowBook>();
		BorrowBook borrow_book = null;

		while (rs.next()) {
			String callnumber = rs.getString("callnumber");
			String isbn = rs.getString("isbn");
			String name = rs.getString("name");
			String author = rs.getString("author");
			String publisher = rs.getString("publisher");
			Float price = rs.getFloat("price");
			String username = rs.getString("username");
			String backtime = rs.getString("backtime");
			if (username.isEmpty())
				username = "在馆";
			if (backtime.isEmpty())
				backtime = "在馆";
			borrow_book = new BorrowBook(callnumber, isbn, name, author, publisher, price, username, backtime);
			borrow_books.add(borrow_book);
		}
		return borrow_books;
	}

	public int addBook(Book book) throws Exception {
		int flag = 0;
		String sql0 = "Select * From book Where callnumber ='" + book.getCallnumber() + "'";

		PreparedStatement ps0 = DbHelper.getConnection().prepareStatement(sql0);
		ResultSet rs0 = ps0.executeQuery();

		if (rs0.next()) // callnumber已存在
		{
			flag = 0;
		} else {
			String sql = "Insert into book (callnumber,isbn,name,author,publisher,price) values('"
					+ book.getCallnumber() + "','" + book.getIsbn() + "','" + book.getName() + "','" + book.getAuthor()
					+ "','" + book.getPublisher() + "'," + book.getPrice() + ")";

			PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
			flag = ps.executeUpdate();
		}

		return flag;
	}

	public Book getBookByCallnumber(String thatcallnumber) throws SQLException {
		String sql = "select * from book where callnumber='" + thatcallnumber + "'";

		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		Book book = new Book();
		if (rs.next()) {
			String callnumber = rs.getString("callnumber");
			String isbn = rs.getString("isbn");
			String name = rs.getString("name");
			String author = rs.getString("author");
			String publisher = rs.getString("publisher");
			Float price = rs.getFloat("price");
			book = new Book(callnumber, isbn, name, author, publisher, price);
		}
		return book;
	}

	public int updateBook(Book book) throws Exception {
		String sql = "UPDATE book SET isbn='" + book.getIsbn() + "',name='" + book.getName() + "',author='"
				+ book.getAuthor() + "',publisher='" + book.getPublisher() + "',price=" + book.getPrice()
				+ " WHERE callnumber='" + book.getCallnumber() + "'";

		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		int flag = ps.executeUpdate();

		return flag;
	}

	public int deleteBook(String callnumber) throws Exception {
		String sql = "Delete from book where callnumber='" + callnumber + "'";

		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		int flag = ps.executeUpdate();

		return flag;
	}
}
