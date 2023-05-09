package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class StudentServiceImplV1 implements StudentService{
	
	List<StudentDto> stdList = new ArrayList<>();
	@Override
	public void loadStudent() {
		for(int i = 0 ; i < StdData.STUDENT.length ; i++) {
			String[] student = StdData.STUDENT[i].split(",");
			StudentDto stdDto = new StudentDto();
			stdDto.stNum = student[StdData.ST_NUM];
			stdDto.stName = student[StdData.ST_NAME];
			stdDto.stDept = student[StdData.ST_DEPT];
			stdDto.stGrade = Integer.valueOf(student[StdData.ST_GRADE]);
			stdDto.stProf = student[StdData.ST_PROF];
			stdDto.stTel = student[StdData.ST_TEL];
			stdDto.stAddress = student[StdData.ST_ADDRESS];
			stdList.add(stdDto);
		}
	}
	@Override
	public void printStudent() {
		System.out.println("=".repeat(110));
		System.out.println("학번\t이름\t학과\t\t\t학년\t전화번호\t주소");
		System.out.println("-".repeat(110));
		for(int i =0 ; i < stdList.size() ; i++) {
			System.out.printf("%s\t%s\t%s\t\t%d\t%s\t%s\n",
					stdList.get(i).stNum,stdList.get(i).stName,stdList.get(i).stDept,stdList.get(i).stGrade,
					stdList.get(i).stTel,stdList.get(i).stAddress);
		}
		System.out.println("=".repeat(110));
	}
	@Override
	public StudentDto getStudent(String stNum) {
		
		
		return null;
	}
}
