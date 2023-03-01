package com.cyn.library;

import java.util.ArrayList;

public class User extends Library {
	private Integer id;
	private String first_name;
	private String last_name;
	private String e_mail;

	// constructor
	public User(Integer id, String first_name, String last_name, String e_mail) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.e_mail = e_mail;
	}

	// actions
	@Override
	public ArrayList<User> getUserList() {
		return userList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	// toString

	@Override
	public String toString() {
		return "User [" + first_name + " " + last_name + "]";
	}

}
