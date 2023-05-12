package com.callor.books.exec;

import com.callor.books.service.AuthorService;
import com.callor.books.service.impl.AuthorServiceImplV1;

public class AuthorExecA {
	
	public static void main(String[] args) {
		
		AuthorService autoService = new AuthorServiceImplV1();
		autoService.loadAuthor();
		autoService.printAuthorList();
		System.out.println(autoService.getAuthor("A0001"));
		System.out.println(autoService.getAuthorList());
	}

}
