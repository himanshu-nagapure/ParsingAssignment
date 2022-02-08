package io.sevenx.bookstore.ui;

import java.util.List;

import io.sevenx.bookstore.data.Book;

public class BookDisplay {
    public static void display(List<Book> books) {
		for(Book book : books) {
            book.getInfo();
        }
	}
}
