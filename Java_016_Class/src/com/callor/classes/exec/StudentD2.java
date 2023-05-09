package com.callor.classes.exec;

import com.callor.classes.models.StudentDto;
import com.callor.classes.service.impl.StudentServiceImplV1A;

public class StudentD2 {
	
	public static void main(String[] args) {
		StudentServiceImplV1A stService = new StudentServiceImplV1A();
		stService.loadStudent();
		stService.printStudent();
		StudentDto stDto = stService.getStudent("S0003");
		System.out.println(stDto.toString());
		
	}

}
