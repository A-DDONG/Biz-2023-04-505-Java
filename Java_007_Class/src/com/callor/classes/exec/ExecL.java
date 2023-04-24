package com.callor.classes.exec;

import com.callor.classes.module.ServiceC;

public class ExecL {

	public static void main(String[] args) {

		ServiceC serviceC = new ServiceC();

		int rndNum = (int) (Math.random() * 10);
		if (rndNum >= 2 && rndNum <= 9) {
			// rndNum 변수에 저장된 값을 전달하면서
			// 구구단을 출력해줘 라는 요청
			// guguDan() method 호출
			serviceC.guguDan(rndNum);
		}
	}
}
