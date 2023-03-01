package com.cyn.library;

public class Admin extends User {
	private boolean is_Admin;

	public Admin(Integer id, String first_name, String last_name, String e_mail, boolean is_Admin) {
		super(id, first_name, last_name, e_mail);
		this.is_Admin = is_Admin;
	}

	public boolean is_Admin() {
		return is_Admin;
	}

	public void set_Admin(boolean is_Admin) {
		this.is_Admin = is_Admin;
	}

	public void banUser(User user) {
		System.out.println("User: " + user.getFirst_name() + " Removed");
		super.deleteUser(user);
	}

	@Override
	public String toString() {
		return "Admin name:" + super.getFirst_name() + " " + super.getLast_name();
	}

}
