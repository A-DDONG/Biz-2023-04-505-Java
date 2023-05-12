package com.callor.books.exec;

import com.callor.books.service.PublisherService;
import com.callor.books.service.impl.PublisherServiceImplV1;

public class PublisherExecA {
	
	public static void main(String[] args) {
		
		PublisherService pubService = new PublisherServiceImplV1();
		pubService.loadPublisher();
		pubService.printPublisherList();
//		System.out.println(pubService.gerPublisher("C0002"));
//		System.out.println(pubService.getPublisherList());
		System.out.println(pubService.getPublisherListByName("북"));
		
	}

}
