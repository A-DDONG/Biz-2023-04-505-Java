package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerF {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 1 ~ 45 랜덤수 생성
		int rndNum = (int) (Math.random() * 45 + 1);
		int num = 0;
		int[] nums = new int[6];

		while (true) {

			System.out.println("1 ~ 45 범위의 정수를 입력하세요( QUIT : 종료 )");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				break;
			}
			try {
				num = Integer.valueOf(strNum);
				if (num < 1 || num > 45) {
					System.out.println("1 ~ 45 밤위의 정수만 입력해주세요");
					continue;
				}
			} catch (Exception E) {
				System.out.println("1 ~ 45 범위의 정수만 입력해주세요");
				continue;
			}
			if (num == rndNum) {
				System.out.println(num + " = " + rndNum + "잘했어요");
				System.out.println("새로운 게임 시작");
				rndNum = (int) (Math.random() * 45 + 1);
			} else if (num > rndNum) {
				System.out.println(num + " > " + rndNum + " 큰 수");
			} else if (num < rndNum ){
				System.out.println(num + " < " + rndNum + " 작은 수");
			}
		}
		System.out.println("GAME OVER");
	}
}
