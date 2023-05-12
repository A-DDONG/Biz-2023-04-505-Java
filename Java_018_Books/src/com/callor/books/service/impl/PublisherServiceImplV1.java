package com.callor.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.data.config.DataIndex;
import com.callor.books.data.config.Utils;
import com.callor.books.models.PublisherDto;
import com.callor.books.service.PublisherService;

public class PublisherServiceImplV1 implements PublisherService {

	List<PublisherDto> pubList;

	public PublisherServiceImplV1() {
		pubList = new ArrayList<>();
	}

	@Override
	public void loadPublisher() {
		String publisherFile = "src/com/callor/books/data/출판사정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(publisherFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		scan = new Scanner(is);

		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] publisher = line.split(",");
			PublisherDto pubDto = new PublisherDto();
			pubDto.setPubCode(publisher[DataIndex.PUBLISHER.CODE]);
			pubDto.setPubName(publisher[DataIndex.PUBLISHER.NAME]);
			pubDto.setPubCeo(publisher[DataIndex.PUBLISHER.CEO]);
			pubDto.setPubTel(publisher[DataIndex.PUBLISHER.TEL]);
			pubDto.setPubAddress(publisher[DataIndex.PUBLISHER.ADDRESS]);
			pubList.add(pubDto);
		}
		scan.close();
	}

	@Override
	public void printPublisherList() {
		String printTitle[] = "출판사코드,출판사명,대표,전화번호,주소".split(",");
		System.out.println(Utils.dLine(100));
		System.out.printf("%s\t", printTitle[DataIndex.PUBLISHER.CODE]);
		System.out.printf("%s\t", printTitle[DataIndex.PUBLISHER.NAME]);
		System.out.printf("%s\t", printTitle[DataIndex.PUBLISHER.CEO]);
		System.out.printf("%s\t", printTitle[DataIndex.PUBLISHER.TEL]);
		System.out.printf("%s\n", printTitle[DataIndex.PUBLISHER.ADDRESS]);
		System.out.println(Utils.sLine(100));

		for (PublisherDto pubDto : pubList) {
			System.out.printf("%-15s\t", pubDto.getPubCode());
			System.out.printf("%s\t", pubDto.getPubName());
			System.out.printf("%s\t", pubDto.getPubCeo());
			System.out.printf("%s\t", pubDto.getPubTel());
			System.out.printf("%s\n", pubDto.getPubAddress());
		}
		System.out.println(Utils.dLine(100));
	}

	@Override
	public PublisherDto gerPublisher(String code) {
		if (pubList.isEmpty()) {
			this.loadPublisher();
		}
		for (PublisherDto pubDto : pubList) {
			if (pubDto.getPubCode().equals(code)) {
				return pubDto;
			}
		}
		return null;
	}

	@Override
	public List<PublisherDto> getPublisherList() {
		if (pubList.isEmpty()) {
			this.loadPublisher();
		}
		return pubList;
	}

	@Override
	public List<PublisherDto> getPublisherListByName(String name) {
		
		List<PublisherDto> filterPublist = new ArrayList<>();

		for (PublisherDto dto : pubList) {
			if (dto.getPubName().contains(name)) {
				filterPublist.add(dto);
			}
		}
		System.out.printf("\"%s\" 이(가) 포함된 리스트\n",name);
		return filterPublist;
	}

}
