package com.cyn.book;

import java.util.ArrayList;

public class Book {
	private Integer id;
	private String name;
	private String author;
	private ArrayList<Reviews> reviews = new ArrayList<>();

	public Book(Integer id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", reviews=" + reviews + "]";
	}

	public void addReview(Reviews review) {
		// TODO Auto-generated method stub
		this.reviews.add(review);

	}

}
