package com.callor.scanner.service;

import java.util.Scanner;

import com.callor.scanner.models.StudentDto;

public class StudentServiceV2 {

	// 학생 리스트를 담을 배열 선언
	private StudentDto[] stList;

	public void inputStudents() {

		Scanner scan = new Scanner(System.in);

		// 요소가 5개인 배열을 선언
		// 배열의 요소는 초기화가 안 된 상태, 사용이 불가한 상태
		stList = new StudentDto[5];

		// 학생수 만큼 반복
		while (true) {
			System.out.println("학생정보를 입력하세요");
			int intNum = 0;
			while (true) {
				System.out.print("학번( 1 ~ 5 ) >> ");
				String stNum = scan.nextLine();
				try {
					intNum = Integer.valueOf(stNum);
				} catch (Exception e) {
					System.out.println("학번은 정수로 입력하세요");
					continue;
				}
				// 학번에서 -1 을 입력하면 더이상 입력받지 않기
				if (intNum < 0) {
					// method 를 종료하라
					return;
				}
				if (intNum < 1 || intNum > stList.length + 1) {
					System.out.println("학번은 1 ~ 5까지 입력하세요");
					continue;
				}
				break;
			}

			System.out.print("이름 >> ");
			String stName = scan.nextLine();

			System.out.print("학과 >> ");
			String stDept = scan.nextLine();

			int intGrade = 0;
			while (true) {
				System.out.print("학년 >> ");
				String stGrade = scan.nextLine();
				try {
					intGrade = Integer.valueOf(stGrade);
				} catch (Exception e) {
					System.out.println("학년은 정수로만 입력하세요");
					continue;
				}
				if (intGrade < 1 || intGrade > 4) {
					System.out.println("학년은 1 ~ 4 범위에서 입력하세요");
					continue;
				}
				break;
			}
			System.out.print("전화번호 >> ");
			String stTel = scan.nextLine();

			// StudentDto type 객체 생성
			StudentDto student = new StudentDto();
			// stList[0] : 1번 학생의 정보
			// stList[4] : 5번 학생의 정보
			student.setStNum(String.format("%04d", intNum));
			student.setStName(stName);
			student.setStDept(stDept);
			student.setStGrade(intGrade);
			student.setStTel(stTel);

			/*
			 * 현재 stList 배열의 요소는 초기화가 되지 않은 상태이다 이때 StudenDto type student 객체를 생성하였고 student
			 * 객체의 속성값을 setting 한 후 student 객체를 배열의 요소에 저장
			 * 
			 * stList[intNum - 1] 요소를 다시 초기화 하지 않아도 student 객체를 저장함으로써 자동으로 초기화가 된다
			 */
			stList[intNum - 1] = student;

//		System.out.println(stList[intNum - 1]);
		}
	}

	public void printStudents() {
		for (int i = 0; i < stList.length; i++)
			System.out.println(stList[i].getStNum() + "\t");
		    System.out.println(stList[i].getStName() + "\t");
		    System.out.println(stList[i].getStDept() + "\t");
		    System.out.println(stList[i].getStGrade() + "\t");
		    System.out.println(stList[i].getStTel()) + "\t");
		    

	}

}
