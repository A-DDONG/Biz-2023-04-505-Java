package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.callor.classes.configue.Line;
import com.callor.classes.datas.DataSource;
import com.callor.classes.models.ScoreDto;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	public ScoreServiceImplV2() {
		// V1에서 protected 로 선언된 scList 를 사용할수 있도록 초기화하는 작업
		// 반드시 필요
		scList = new ArrayList<>();
	}

	@Override
	public void loadScore() {

		String scoreFile = "src/com/callor/classes/datas/score.csv";
		InputStream is = null;
		Scanner scan = null;
		try {
			is = new FileInputStream(scoreFile);
		} catch (FileNotFoundException e) {
			System.out.println(scoreFile + " 이 없습니다 확인해주세요");
			return;
		}
		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			ScoreDto dto = str2Dto(line);
			scList.add(dto);
		}
	}
	@Override
	public void printScore() {
		StudentService stService = new StudentServiceImplV4();
		stService.loadStudent();
		
		System.out.println(Line.dLine(100));
		System.out.println("학번\t이름\t학과\t\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		System.out.println(Line.sLine(100));
		
		int rows = 0;
		for(ScoreDto dto : scList) {
			StudentDto stDto = stService.getStudent(dto.getStNum());
			System.out.print(dto.getStNum() + "\t");
			if(stDto != null) {
				System.out.printf("%s\t",stDto.stName.substring(0, 3));
				System.out.print(stDto.stDept + "\t");
			} else {
				System.out.print("-\t");
				System.out.print("-\t");
			}
			System.out.print(dto.getScKor() + "\t");
			System.out.print(dto.getScEng() + "\t");
			System.out.print(dto.getScMath() + "\t");
			System.out.print(dto.getScMusic() + "\t");
			System.out.print(dto.getScArt() + "\t");
			int sum = dto.getScKor()+dto.getScEng()+dto.getScMath()+dto.getScMusic()+dto.getScArt();
			float avg = (float) sum / 5;
			System.out.print(sum + "\t");
			System.out.print(avg + "\n");
			if(++rows % 5 == 0 && rows < scList.size()) {
				System.out.println(Line.sLine(100));
			}
		}
		System.out.println(Line.dLine(100));
	}

}
