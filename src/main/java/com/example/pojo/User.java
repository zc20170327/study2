package com.example.pojo;

public class User {

	private int  id;
	private String  name;
	private String passsword;
	public User(int id, String name, String passsword) {
		super();
		this.id = id;
		this.name = name;
		this.passsword = passsword;
	}
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
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	

}
