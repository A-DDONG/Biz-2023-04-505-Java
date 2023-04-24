package com.callor.classes.module;

public class ServiceC {

	public void guguDan(int rndNum) {

		System.out.printf("========%d단 구구단========\n", rndNum);
		for (int i = 1; i < 10; i++) {
			System.out.printf("\t%d x %d = %d\n", rndNum, i, rndNum * i);
		}
		System.out.printf("========%d단 구구단========\n", rndNum);
	}
}
