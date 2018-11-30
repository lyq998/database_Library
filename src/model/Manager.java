package model;

public class Manager {
	private String managername;
	private String password;

	public Manager() {

	}

	public Manager(String managername, String password) {
		this.managername = managername;
		this.password = password;
	}

	public String getManagername() {
		return managername;
	}

	public String getPassword() {
		return password;
	}

	public void setManagername(String managername) {
		this.managername = managername;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
