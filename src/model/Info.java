package model;

public class Info {
	private int id;
	private String text;
	private String datetime;

	public Info() {

	}

	public Info(int id, String text, String datetime) {
		this.id = id;
		this.text = text;
		this.datetime = datetime;
	}

	public int getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
}
