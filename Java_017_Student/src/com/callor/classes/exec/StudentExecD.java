package com.callor.classes.exec;

import com.callor.classes.service.impl.StudentServiceImplV2;

public class StudentExecD {
	
	public static void main(String[] args) {
		StudentServiceImplV2 stService = new StudentServiceImplV2();
		stService.loadStudent();
		stService.printStudent();
	}

}
