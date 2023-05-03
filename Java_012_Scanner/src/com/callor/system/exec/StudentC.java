package com.callor.system.exec;

import com.callor.scanner.service.StudentServiceV1;

public class StudentC {
	
	public static void main(String[] args) {
		
		StudentServiceV1 stService = new StudentServiceV1();
		stService.inputStudent();
	}

}
