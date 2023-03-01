package com.cyn.library;

import java.util.ArrayList;

public class Library {
	public ArrayList<Book> bookList = new ArrayList<>();
	public ArrayList<User> userList = new ArrayList<>();

	public Library() {
		super();
	}

	public Library(ArrayList<Book> bookList, ArrayList<User> userList) {
		super();
		this.bookList = bookList;
		this.userList = userList;
	}

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void addBook(Book book) {
		this.bookList.add(book);
	}

	public void addUser(User user) {
		this.userList.add(user);
	}

	public ArrayList<User> getUserList() {
		return userList;
	}

	public void deleteUser(User user) {
		this.userList.remove(user);
		System.out.println("DELETED");
	}

}
