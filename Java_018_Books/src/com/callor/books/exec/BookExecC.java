package com.callor.books.exec;

import com.callor.books.service.BookService;
import com.callor.books.service.impl.BookServiceImplV1;

public class BookExecC {
	
	public static void main(String[] args) {
		
		BookService bService = new BookServiceImplV1();
		bService.loadBook();
		bService.printBookList();
	}

}
