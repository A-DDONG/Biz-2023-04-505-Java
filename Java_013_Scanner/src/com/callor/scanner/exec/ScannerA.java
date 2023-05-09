package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerA {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;
		while (true) {
			System.out.println("정수를 입력하세요");
			System.out.print("정수 >> ");
			String strNum = scan.nextLine();
			try {
				num = Integer.valueOf(strNum);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수만 입력해주세요");
			}
		}
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				break;
			}
		}
		if (index >= num) {
			System.out.println(num + " 는 소수");
		}
		if (index < num) {
			System.out.println(num + " 는 소수 아님");
		}

	}
}
