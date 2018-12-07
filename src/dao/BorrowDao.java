package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Borrow;
import model.BorrowBook;
import util.DbHelper;

public class BorrowDao {
	public int borrowBook(Borrow borrow) throws Exception {
		String sql = "Insert into borrow (callnumber,username) values('" + borrow.getCallnumber() + "','"
				+ borrow.getUsername() + "')";
		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		int flag = ps.executeUpdate();

		return flag;
	}

	public int returnBook(String callnumber) throws Exception {
		String sql = "Delete from borrow where callnumber='" + callnumber + "'";
		PreparedStatement ps = DbHelper.getConnection().prepareStatement(sql);
		int flag = ps.executeUpdate();

		return flag;
	}

	public List<BorrowBook> showBorrowedBook(String username) throws Exception {
		String sql = "select b.callnumber,isbn,name,author,publisher,price,backtime " + "from  book b,borrow bo "
				+ "where b.callnumber=bo.callnumber and bo.username in (select username from borrow where username='"
				+ username + "')";

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
			String backtime = rs.getString("backtime");
			borrow_book = new BorrowBook(callnumber, isbn, name, author, publisher, price, username, backtime);
			borrow_books.add(borrow_book);
		}
		return borrow_books;
	}

}
