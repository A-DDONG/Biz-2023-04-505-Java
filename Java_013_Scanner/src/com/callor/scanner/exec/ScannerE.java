package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerE {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int rndNum = (int) (Math.random() * 10 + 1);
		int num = 0;

		while (true) {

			System.out.println("정수를 입력하세요( QUIT : 종료 )");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				break;
			}
			try {
				num = Integer.valueOf(strNum);
				if (num < 1 || num > 10) {
					System.out.println("1 ~ 10 의 값만 입력해주세요");
					continue;
				}
			} catch (Exception E) {
				System.out.println("1 ~ 10 의 값만 입력해주세요");
				continue;
			}
			if (num == rndNum) {
				System.out.println(num + " = " + rndNum + "잘했어요");
				System.out.println("새로운 게임 시작");
				rndNum = (int) (Math.random() * 10 + 1);
			} else if (num > rndNum) {
				System.out.println(num + " > " + rndNum + " 큰 수");
			} else if (num < rndNum ){
				System.out.println(num + " < " + rndNum + " 작은 수");
			}
		}
		System.out.println("GAME OVER");
	}
}
