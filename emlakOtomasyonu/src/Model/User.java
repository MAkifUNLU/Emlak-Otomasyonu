package Model;

public class User {

	private int id;
	String name;
	String sureName;
	String email;
	String password;

	public User(int id, String name, String sureName, String email, String password) {
		this.id = id;
		this.name = name;
		this.sureName = sureName;
		this.email = email;
		this.password = password;
	}
	
	public User () {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSureName() {
		return sureName;
	}

	public void setSureName(String sureName) {
		this.sureName = sureName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
