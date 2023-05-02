package com.callor.classes;

import java.util.Scanner;

public class ClassB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요 : ");
		String strName = scan.nextLine();
		System.out.println("입력한 이름은 : " + strName);
;	}
}
