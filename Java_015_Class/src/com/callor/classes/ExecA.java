package com.callor.classes;

/*
 * ClassB 에서 ClassA 의 기능을 상속(inherit)
 * 
 * ClassB 에는 아무런 method 도 정의되지 않았음에도
 * ClassA 를 상속받아서 마치 ClassA 의 method( 2개 add ) 들이
 * 정의되어 있는것처럼 사용이 가능하다
 * 
 * 객체지향(OOP) 프로그래밍에서 클래스를 상속받기
 * 기존에 잘 만들어진 클래스 코드가 있으면 내가 만든 클래스에서 사용하고 싶을 때
 * ClassA 는 매우 잘 만들어진 클래스라고 하자
 * ClassB 는 ClassA 의 method 들을 그대로 물려받아 사용할수 있다
 * 만약 원래 ClassA 개발자가 코드를 Upgrade 하면
 * ClassB 도 같이 Upgrade 되는 효과를 낼 수 있다 
 * 
 */
public class ExecA {
	
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.add(30, 40);
		System.out.println(classA.toString());
		
		ClassB classB = new ClassB();
		classB.add(100, 200);
		System.out.println(classB.toString());
	}

}
