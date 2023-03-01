package com.cyn.library;

public class Book extends Library {
	private Integer id;
	private String name;
	private String author;
	private User user = null;

	// constructors
	public Book() {
	};

	public Book(Integer id, String name, String author, User user) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.user = user;

	}

	// Actions

	// Borrow a Book

	public void borrowBook(User user) {
		this.user = user;

	}

	// Return a Book

	public void returnBook() {
		this.user = null;

	}

	// CRUD

	// CREATE , UPDATE

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	};

	// READ

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	// DELETE

	public void deleteBook() {
		this.id = null;
		this.author = null;
		this.name = null;
		this.user = null;
	}

	@Override
	public String toString() {
		return "Book [id = " + id + ", name = " + name + ", author = " + author + ", BorrowedBy = " + user;
	}

}
