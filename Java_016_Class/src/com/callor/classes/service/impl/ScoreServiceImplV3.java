package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.ScoreDto;
import com.callor.classes.models.scData;
import com.callor.classes.service.ScoreService;

/*
 * interface(class)를 implements 한 클래스는
 * interface에 선언된 모든 method 를 의무적으로 구현해야 한다
 * interface에 선언된 method 를 한개라도 생략하면
 * 클래스 코드는 문법오류가 발생하고 실행 불가 상태가 된다
 */
public class ScoreServiceImplV3 implements ScoreService {

	StudentServiceImplV1A stdService = new StudentServiceImplV1A();
	
	private List<ScoreDto> scList;

	public ScoreServiceImplV3() {
		scList = new ArrayList<>();
	}

	// ScData.SCORE 배열을 loading 하여 scList 데이터로 변환하기
	public void makeScore() {
		for (String str1 : scData.SCORE) {
			String[] score = str1.split(",");
			ScoreDto scDto = new ScoreDto(score[scData.ST_NUM],
					Integer.valueOf(score[scData.SC_KOR]),
					Integer.valueOf(score[scData.SC_ENG]),
					Integer.valueOf(score[scData.SC_MATH]),
					Integer.valueOf(score[scData.SC_MUSIC]),
					Integer.valueOf(score[scData.SC_ART]),
					Integer.valueOf(score[scData.SC_SOFTWARE]),
					Integer.valueOf(score[scData.SC_DATABASE])
					);
			scList.add(scDto);
		}

	}

	@Override
	public void makeScore(List<ScoreDto> scList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		
		for(ScoreDto dto : scList) {
			System.out.print(dto.getStNum() + "\t");
			System.out.print(dto.getScKor() + "\t");
			System.out.print(dto.getScEng() + "\t");
			System.out.print(dto.getScMath() + "\t");
			System.out.print(dto.getScMusic() + "\t");
			System.out.print(dto.getScArt() + "\n");
		}
	}

	@Override
	public void printScore(List<ScoreDto> scList) {
		// TODO Auto-generated method stub

	}

}
