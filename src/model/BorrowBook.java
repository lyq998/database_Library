package model;

//不是对应真实的borrow表结构，是一个book,borrow表的连接查询结果
public class BorrowBook {
	private String callnumber;
	private String isbn;
	private String name;
	private String author;
	private String backtime;
	private String publisher;
	private String username;
	private float price;

	public BorrowBook() {
	}

	public BorrowBook(String callnumber, String isbn, String name, String author, String publisher, float price,
			String username, String backtime) {
		super();
		this.callnumber = callnumber;
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.username = username;
		this.backtime = backtime;
	}

	public String getCallnumber() {
		return callnumber;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAuthor() {
		return author;
	}

	public String getName() {
		return name;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getUsername() {
		return username;
	}

	public float getPrice() {
		return price;
	}

	public String getBacktime() {
		return backtime;
	}

	public void setCallnumber(String callnumber) {
		this.callnumber = callnumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBacktime(String backtime) {
		this.backtime = backtime;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
