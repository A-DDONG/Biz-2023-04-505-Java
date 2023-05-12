package com.callor.books.exec;

import com.callor.books.service.BookService;
import com.callor.books.service.impl.BookServiceImplV2;

public class BookExecD {
	
	public static void main(String[] args) {
		BookService bookService = new BookServiceImplV2();
		bookService.loadBook();
		bookService.printBookList();
	}

}
