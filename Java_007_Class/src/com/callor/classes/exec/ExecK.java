package com.callor.classes.exec;

import com.callor.classes.module.ServiceB;

public class ExecK {

	public static void main(String[] args) {

		ServiceB serviceB = new ServiceB();

		String 이름 = "홍길동";
		int 국어 = (int) (Math.random() * 50) + 51;
		int 영어 = (int) (Math.random() * 50) + 51;
		int 수학 = (int) (Math.random() * 50) + 51;
		serviceB.score(이름, 국어, 영어, 수학);

	}
}
