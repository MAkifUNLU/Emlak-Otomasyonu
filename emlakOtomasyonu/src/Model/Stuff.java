package Model;

public class Stuff extends User {

	int salary;
	String position;

	public Stuff(int id, String name, String sureName, String email, String password) {
		super(id, name, sureName, email, password);
	}
	
	public Stuff() {}
}
