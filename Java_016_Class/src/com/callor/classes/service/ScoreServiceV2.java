package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.ScoreDto;

public class ScoreServiceV2 {
	
	public void makeScore(List<ScoreDto> scList) {
		for( int i = 0 ; i < 10 ; i ++) {
			
			// 0001 ~ 0010 까지 학번만들기
			String stName = String.format("%04d", i + 1);
			// 3과목의 점수 생성하기
			int scKor = (int) (Math.random() * 50) + 51;
			int scEng = (int) (Math.random() * 50) + 51;
			int scMath = (int) (Math.random() * 50) + 51;
			
			// 학번과 점수를 ScoreDto 객체변수를 만들어 저장하기
			ScoreDto scDto = new ScoreDto();
			scDto.setStNum(stName);
			scDto.setScKor(scKor);
			scDto.setScEng(scEng);
			scDto.setScMath(scMath);
			// ScoreDto 객체변수를 List 에 추가하기
			scList.add(scDto);
		}
	}
	
	// scList 변수를 ScoreServiceV2 클래스의
	// 다른 method 에서 사용하기 위하여
	// 클래스 영역으로 scope 를 이동한다
	// 클래스 영역으로 scope 가 이동된 객체변수는 선언만 수행한다
	// 선언만 수행된 객체변수는 사용하려고 하면 NullPointException 이 발생할 수 있다
	// makeScore() method 가 시작되는 곳에서 scoreList 를 초기화(생성) 해주어야 한다
	private List<ScoreDto> scList ; // 객체변수 선언
	public void makeScore() {
		
		// scList 변수에 scope 가 makeScore() { } 블럭이다
		// 만약 다른 method(ex) sprintScore() ) 에서
		// scList 변수값을 사용하려면 scope 영역을 변경해 주어야 한다
		scList = new ArrayList<>(); // 객체변수 초기화
		this.makeScore(scList);
		
		/*
		for( int i = 0 ; i < 10 ; i ++) {
			
			// 0001 ~ 0010 까지 학번만들기
			String stName = String.format("%04d", i + 1);
			// 3과목의 점수 생성하기
			int scKor = (int) (Math.random() * 50) + 51;
			int scEng = (int) (Math.random() * 50) + 51;
			int scMath = (int) (Math.random() * 50) + 51;
			
			// 학번과 점수를 ScoreDto 객체변수를 만들어 저장하기
			ScoreDto scDto = new ScoreDto();
			scDto.setStName(stName);
			scDto.setScKor(scKor);
			scDto.setScEng(scEng);
			scDto.setScMath(scMath);
			// ScoreDto 객체변수를 List 에 추가하기
			scList.add(scDto);
		}
		*/
		System.out.println(scList.toString());
	}
}
