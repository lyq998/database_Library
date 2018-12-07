package model;

public class Borrow {
	private String callnumber;
	private String username;
	private String backtime;

	public Borrow() {

	}

	public Borrow(String callnumber, String username, String backtime) {
		this.callnumber = callnumber;
		this.username = username;
		this.backtime = backtime;
	}

	public String getCallnumber() {
		return callnumber;
	}

	public String getBacktime() {
		return backtime;
	}

	public String getUsername() {
		return username;
	}

	public void setCallnumber(String callnumber) {
		this.callnumber = callnumber;
	}

	public void setBacktime(String backtime) {
		this.backtime = backtime;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
