package com.callor.classes.exec;

import com.callor.classes.models.ScoreDto;

public class ScoreA {
	
	public static void main(String[] args) {
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.setStNum("0001");
		scoreDto.setScKor(85);
		scoreDto.setScMath(83);
		scoreDto.setScMusic(97);
		scoreDto.setScArt(100);
		
		System.out.println(scoreDto.toString());
	}

}
