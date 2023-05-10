package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.configue.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class StudentServiceImplV2 implements StudentService {

	private List<StudentDto> stdList;

	public StudentServiceImplV2() {
		stdList = new ArrayList<>();
	}

	@Override
	public void loadStudent() {

		String studentFile = "src/com/callor/classes/datas/student.csv";
		String saveFile = "src/com/callor/classes/datas/student-save.csv";

		Scanner fileScan = null;
		InputStream is = null;
		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileScan = new Scanner(is);
		while (fileScan.hasNext()) {
			String[] student = fileScan.nextLine().split(",");
			StudentDto stDto = new StudentDto();
			stDto.stNum = student[DataIndex.STUDENT.ST_NUM];
			stDto.stName = student[DataIndex.STUDENT.ST_NAME];
			stDto.stDept = student[DataIndex.STUDENT.ST_DEPT];
			stDto.stGrade = Integer.valueOf(student[DataIndex.STUDENT.ST_GRADE]);
			stDto.stTel = student[DataIndex.STUDENT.ST_TEL];
			stDto.stAddress = student[DataIndex.STUDENT.ST_ADDRESS];
			stdList.add(stDto);
		}
		fileScan.close();
	}

	@Override
	public void printStudent() {

		int count = 1;
		System.out.println(Line.dLine(120));
		System.out.println("학번\t  이름\t\t학과\t\t학년\t전화번호\t주소");
		System.out.println(Line.sLine(120));
		for (StudentDto dto : stdList) {
			System.out.print(dto.stNum + "\t");
			System.out.printf("%5s\t", dto.stName);
			System.out.print(dto.stDept + "\t");
			System.out.print(dto.stGrade + "\t");
			System.out.print(dto.stTel + "\t");
			System.out.print(dto.stAddress + "\n");
			if (count % 5 == 0) {
				System.out.println(Line.sLine(120));
			}
			count++;
		}
		System.out.println(Line.dLine(120));

	}

	@Override
	public StudentDto getStudent(String stNum) {
		return null;
	}

}
