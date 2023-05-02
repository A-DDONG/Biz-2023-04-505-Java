package com.callor.classes;

import java.util.Scanner;

public class ClassH {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		String str1;
		String str2;

		while (true) {
			System.out.println("두 개의 정수를 입력하세요");
			System.out.println("exit를 입력하면 종료합니다");
			System.out.print("정수1 >> ");
			str1 = scan.nextLine();
			if(str1.equals("exit")) {
				break;
			}
			System.out.print("정수2 >> ");
			str2 = scan.nextLine();
			if(str2.equals("exit")) {
				break;
			}
			num1 = Integer.parseInt(str1);
			num2 = Integer.parseInt(str2);
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
			System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);
		}
		System.out.println("종료");
	}
}
