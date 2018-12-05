package model;

public class User {
	private String username;
	private String password;
	private String realname;
	private String sex;
	private String telnumber;
	// 后期可以增加ID

	public User() {
	}

	public User(String username, String password, String realname, String sex, String telnumber) {
		super();
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.sex = sex;
		this.telnumber = telnumber;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getRealname() {
		return realname;
	}

	public String getSex() {
		return sex;
	}

	public String getTelnumber() {
		return telnumber;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}

}
