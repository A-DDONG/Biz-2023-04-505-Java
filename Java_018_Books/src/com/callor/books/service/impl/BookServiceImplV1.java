package com.callor.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.models.BookDto;
import com.callor.books.service.BookService;

public class BookServiceImplV1 implements BookService {

	public List<BookDto> bookList;

	public BookServiceImplV1() {
		bookList = new ArrayList<>();
	}

	@Override
	public void loadBook() {
		String bookFile = "src/com/callor/books/data/도서정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;
		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			System.out.println(bookFile + " 이 없습니다 확인해주세요");
			return;
		}
		scan = new Scanner(is);
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] book = line.split(",");
			BookDto bookDto = new BookDto();
			bookDto.setbIsbn(book[0]);
			bookDto.setbTitle(book[1]);
			bookDto.setbPublisher(book[2]);
			bookDto.setbAuthor(book[3]);
			bookDto.setbPublishDate(book[4]);
			bookDto.setbPages(Integer.valueOf(book[5]));
			bookDto.setbPrice(Integer.valueOf(book[6]));
			bookList.add(bookDto);
		}
		scan.close();

	}

	@Override
	public void printBookList() {
		System.out.println("=".repeat(100));
		System.out.println("ISBN\t\t도서명\t\t\t출판사\t저자\t발행일\t페이지\t가격");
		System.out.println("=".repeat(100));
		for(BookDto dto : bookList) {
			System.out.print(dto.getbIsbn() + "\t");
			System.out.print(dto.getbTitle() + "\t");
			System.out.print(dto.getbPublisher() + "\t");
			System.out.print(dto.getbAuthor() + "\t");
			System.out.print(dto.getbPublishDate() + "\t");
			System.out.print(dto.getbPages() + "\t");
			System.out.print(dto.getbPrice() + "\n");
		}
	}
	@Override
	public BookDto getBook(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> getBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDto bookDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub

	}

}
