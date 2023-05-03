package com.callor.system.exec;

import com.callor.scanner.service.StudentServiceV2;

public class StudentD {

	public static void main(String[] args) {
		
		StudentServiceV2 scService = new StudentServiceV2();
		scService.inputStudents();
		scService.printStudents();
	}
}
