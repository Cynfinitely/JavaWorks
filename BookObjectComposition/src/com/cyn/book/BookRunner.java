package com.cyn.book;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book(123, "object Oriented Programming with Java", "CYN");

		book.addReview(new Reviews(10, "Great book", 5));
		book.addReview(new Reviews(101, "Awesome", 5));

		System.out.println(book);

	}

}
