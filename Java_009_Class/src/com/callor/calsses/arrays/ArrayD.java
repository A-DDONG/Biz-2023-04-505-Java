package com.callor.calsses.arrays;

import com.callor.calsses.model.ScoreDto;
import com.callor.calsses.service.ScoreServiceA;

public class ArrayD {

	public static void main(String[] args) {
		/*
		 * class type 의 객체(변수) 배열
		 * ClassName[] object = new ClassName[10]
		 * class type 의 배열은 일반 변수 배열과 달리
		 * 즉시 사용할 수 없다. 동시에 초기화되지 않는다
		 * 별도로 배열 요소를 초기화 시키는 코드가 필요하다
		 */
		
		// class type 의 배열 요소 전체를 객체 요소로 생성하기
		ScoreDto[] scores = new ScoreDto[10];
		for(int index = 0 ; index < scores.length ; index++) {
			scores[index] = new ScoreDto();
		}
		
		ScoreServiceA scoreService = new ScoreServiceA();
		scores[0].stNum = "0001";
		scores[0].stName = "홍길동";
		scores[0].scKor = scoreService.getScore();
		scores[0].scEng = scoreService.getScore();
		scores[0].scMath = scoreService.getScore();
		
		System.out.println("=".repeat(70));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(70));
		
		scoreService.scorePrint(scores[0]);
	}
}
