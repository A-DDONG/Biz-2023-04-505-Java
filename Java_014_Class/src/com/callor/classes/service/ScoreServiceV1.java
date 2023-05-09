package com.callor.classes.service;

import java.util.List;

import com.callor.classes.models.ScoreDto;

public class ScoreServiceV1 {

	// 학생수를 10으로 설정하기 위한 변수선언
	private int classSize = 10;

	/*
	 * 매개변수로 일반 변수가 아닌 참조형 객체 변수를 사용했다 참조형 객체변수는 실제 저장된 값이 전달되는 것이 아니고 기억장소의 주소가
	 * 전달된다
	 * 
	 * main() method 에서 보낼때 scoreList 의 주소가 전달되고 makeScore() 에서 값을 변경시키면 main()
	 * method 의 scoreList 가 같이 변경되는 성질을 갖게된다
	 */
	public void makeScore(List<ScoreDto> scoreList) {

		for (int i = 0; i < classSize; i++) {

			// 001, 002 형식으로 학번 문자열 만들기
			String stNum = String.format("%03d", i + 1);
			int scKor = (int) (Math.random() * 50) + 51;
			int scMath = (int) (Math.random() * 50) + 51;
			int scMusic = (int) (Math.random() * 50) + 51;
			int scArt = (int) (Math.random() * 50) + 51;

			/*
			 * 배열에서는 먼저 배열선언, 배열초기화, 각 요소에 데이터 저장
			 * 
			 * List type 의 데이터 1. 먼저 비어있는(blank) List type 을 생성 2. Dto 객체변수를 생성 3. Dto 각 변수에
			 * 값을 setting(setter) 4. List 에 Dto 를 add
			 * 
			 */
			ScoreDto scoreDto = new ScoreDto();
			scoreDto.setStNum(stNum);
			scoreDto.setScKor(scKor);
			scoreDto.setScMath(scMath);
			scoreDto.setScMusic(scMusic);
			scoreDto.setScArt(scArt);
			scoreList.add(scoreDto);

		}
	} // makeScore() end

	public void printScore(List<ScoreDto> scoreList) {
		System.out.println("=".repeat(70));
		System.out.println("학번\t국어\t수학\t음악\t미술\t총점");
		System.out.println("-".repeat(70));
		for(int i = 0 ; i < scoreList.size() ; i++) {
			System.out.print(scoreList.get(i).getStNum() + "\t");
			System.out.print(scoreList.get(i).getScKor() + "\t");
			System.out.print(scoreList.get(i).getScMath() + "\t");
			System.out.print(scoreList.get(i).getScMusic() + "\t");
			System.out.print(scoreList.get(i).getScArt() + "\t");
			System.out.print(scoreList.get(i).getTotal() + "\n");
			
		}
//		for (ScoreDto scoreDto : scoreList) {
//			System.out.printf("%3s\t%3d\t%3d\t%3d\t%3d\n", scoreDto.getStNum(), scoreDto.getScKor(),
//					scoreDto.getScMath(), scoreDto.getScMusic(), scoreDto.getScArt());
//		}
		System.out.println("=".repeat(70));
	}
	
	// scoreList 데이터를 총점 기준으로 오름차순 정렬하기
	// scoreList 의 객체 데이터에서 getTotal() 값을 기준으로 비교하고
	// scList 의 객체 요소를 교환하기
	public void sortScore(List<ScoreDto> scoreList) {
		
		for (int i = 0 ; i < scoreList.size() ; i++) {
			for(int j = i + 1 ; j < scoreList.size() ; j++) {
				if(scoreList.get(i).getTotal() > scoreList.get(j).getTotal()) {
					ScoreDto temp = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, temp);
				}
			}
		}
	}

	public void add(int num1, int num2) {
		num1 = 1000;
		num2 = 2000;
	}
}
