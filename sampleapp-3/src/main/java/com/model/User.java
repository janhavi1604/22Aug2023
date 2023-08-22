package com.model;

public class User {
	
	private int Id;
	private String username;
	@Override
	public String toString() {
		return "User [Id=" + Id + ", username=" + username + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String username) {
		super();
		Id = id;
		this.username = username;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
