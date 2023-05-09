package com.callor.classes;

public class ClassB extends ClassA{
	
	/*
	 * Java 에서 클래스의 상속(extends)
	 * Java 에서 클래스의 상속은 부모 클래스의 장점을 그대로 물려 받으면서
	 * 필요에 따라 method 를 다시 재정의하여 사용할수 있는 기능이다
	 */

	@Override
	public void add(int num1, int num2) {
		
		System.out.printf("%d + %d = %d\n",num1, num2, num1 + num2);
	}
	
	/*
	 * Object 를 상속받는 모든 클래스는
	 * 기본적으로 toString() method 가 있다
	 * 기본 toString() method 클래스의 패키지명, 메모리 주소 등을
	 * 문자열로 return 한다
	 * 
	 * 기본 toString() method 코드는 실제로 별 효용이 없다
	 * 일반적으로 toString()은 각 class 에서 재정의하여 사용한다
	 */
	@Override
	public String toString() {
		return "나는 원래 toString() method 를 재정의 한 것이다";
	}

	
}
