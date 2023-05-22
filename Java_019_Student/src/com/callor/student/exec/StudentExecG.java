package com.callor.student.exec;

import java.util.Scanner;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV2;
import com.callor.student.utils.Line;

public class StudentExecG {
	
	public static void main(String[] args) {
		
		StudentService stService = new StudentServiceImplV2();
		
		printHead();
		Scanner scan = new Scanner(System.in);
		String stSelect = scan.nextLine();
		int select = Integer.valueOf(stSelect);
		if(select == 1) {
//			stService.loadStudent();
			stService.printStudent();
		}
		
	}
	public static void printHead() {
		System.out.println(Line.dLine(100));
		System.out.println("대한고교 학사관리 2023");
		System.out.println(Line.dLine(100));
		System.out.println("실행할 업무를 선택하세요");
		System.out.println(Line.sLine(100));
		System.out.printf("1. 학생 리스트 확인\n2. 학생정보 추가/수정\n3. 학생정보 삭제\n4. 업무종료\n");
		System.out.println(Line.sLine(100));
		System.out.print("업무선택 >> ");
	}
}
