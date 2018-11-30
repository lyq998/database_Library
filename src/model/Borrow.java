package model;

public class Borrow {
	private String callnumber;
	private String name;
	private String state;
	private String backtime;

	public Borrow() {
	}

	public Borrow(String callnumber, String name, String state, String backtime) {
		super();
		this.callnumber = callnumber;
		this.name = name;
		this.state = state;
		this.backtime = backtime;
	}

	public String getCallnumber() {
		return callnumber;
	}

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
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

	public void setState(String state) {
		this.state = state;
	}

	public void setBacktime(String backtime) {
		this.backtime = backtime;
	}
}
