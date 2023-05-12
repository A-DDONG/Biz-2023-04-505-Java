package com.callor.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.data.config.DataIndex;
import com.callor.books.data.config.Utils;
import com.callor.books.models.AuthorDto;
import com.callor.books.service.AuthorService;

public class AuthorServiceImplV1 implements AuthorService{
	
	private List<AuthorDto> autoList;
	public AuthorServiceImplV1() {
		autoList = new ArrayList<>();
	}
	@Override
	public void loadAuthor() {
		String authorFile = "src/com/callor/books/data/저자정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;
		try {
			is = new FileInputStream(authorFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] author = line.split(",");
			AuthorDto auDto = new AuthorDto();
			auDto.setAuCode(author[DataIndex.AUTHOR.CODE]);
			auDto.setAuName(author[DataIndex.AUTHOR.NAME]);
			auDto.setAuTel(author[DataIndex.AUTHOR.TEL]);
			auDto.setAuAddress(author[DataIndex.AUTHOR.ADDRESS]);
			autoList.add(auDto);
		}
		scan.close();
	}

	@Override
	public void printAuthorList() {
		String[] printTitle = "저자코드,저자명,전화번호,주소".split(",");
		
		System.out.println(Utils.dLine(100));
		System.out.printf("%s\t",printTitle[DataIndex.AUTHOR.CODE]);
		System.out.printf("%s\t\t",printTitle[DataIndex.AUTHOR.NAME]);
		System.out.printf("%s\t",printTitle[DataIndex.AUTHOR.TEL]);
		System.out.printf("%s\n",printTitle[DataIndex.AUTHOR.ADDRESS]);
		System.out.println(Utils.sLine(100));
		
		for(AuthorDto auDto : autoList) {
			System.out.printf("%s\t\t",auDto.getAuCode());
			System.out.printf("%s\t\t",auDto.getAuName().substring(0, 3));
			System.out.printf("%s\t",auDto.getAuTel());
			System.out.printf("%s\n",auDto.getAuAddress());
		}
		System.out.println(Utils.dLine(100));
	}
	@Override
	public AuthorDto getAuthor(String code) {
		if(autoList.isEmpty()) {
			this.loadAuthor();
		}

		for(AuthorDto auDto : autoList) {
			if(auDto.getAuCode().equals(code)) {
				return auDto;
			}
		}
		return null;
	}

	@Override
	public List<AuthorDto> getAuthorList() {
		if(autoList.isEmpty()) {
			this.loadAuthor();
		}
		return autoList;
	}

}
