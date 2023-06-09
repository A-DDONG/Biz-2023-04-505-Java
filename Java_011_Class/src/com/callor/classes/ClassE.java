package com.callor.classes;

import java.util.Scanner;

public class ClassE {

	public static void main(String[] args) {
		/*
		 * leak(누수)
		 */
		Scanner scan = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("두 정수의 사칙연산");
			System.out.print("정수1 >> ");
			num1 = scan.nextInt();
			System.out.print("정수2 >> ");
			num2 = scan.nextInt();
			System.out.printf("덧셈 %d + %d = %d\n", num1, num2, num1 + num2);
			System.out.printf("뺄셈 %d - %d = %d\n", num1, num2, num1 - num2);
			System.out.printf("곱셈 %d x %d = %d\n", num1, num2, num1 * num2);
			System.out.printf("나눗셈 %d ÷ %d = %d, 나머지 %d", num1, num2, num1 / num2, num1 % num2);
		}
		/*
		 * scan 객체는 하드웨어인 키보드와 연결된 상태의
		 * 여러 정보를 가지고 있는 상태다
		 * 하드웨어인 키보드는 운영체제나 여러곳에서 다양한 정보를 필요로
		 * 하고 그 정보를 기억장소 어딘가에 보관하고 있는 상태이다
		 * 이 상태로 프로젝트가 종료되면 기억장소에 저장된 정보가 소멸되는데
		 * 상당한 시간이 소요될 것이다
		 * 그래서 사용이 끝난 키보드는 메모리에서 제거하는 절차를
		 * 강제로 실행한다
		 * 
		 * 이것은 자원의 누수(leak)를 방지하는 목적이 있다
		 */
		scan.close();
		

	}
}
