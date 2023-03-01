package com.cyn.library;

public class LibraryRunner {

	public static void main(String[] args) {
		Library oxford = new Library();
		User user1 = new User(1, "Celal", "NARI", "celalyasinnari@gmail.com");
		oxford.addUser(user1);
		User user2 = new User(2, "test", "test", "test@gmail.com");
		oxford.addUser(user2);
		Book book1 = new Book(1, "Alice in Wonderland", "Lewis Carroll", null);
		oxford.addBook(book1);
		Admin admin1 = new Admin(1, "big", "BOSS", "bigboss@gmail.com", true);

		System.out.println(book1);
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(admin1);
		System.out.println("here is the user list" + oxford.getUserList());
		admin1.banUser(user2);

		System.out.println("here is the book list" + oxford.getBookList());
		System.out.println("here is the second user list" + oxford.getUserList());

		book1.borrowBook(user1);
		System.out.println(book1);

		book1.returnBook();
		System.out.println(book1);

	}

}
