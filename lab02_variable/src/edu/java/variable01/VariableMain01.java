package edu.java.variable01;

public class VariableMain01 {

	public static void main(String[] args) {
		// 변수(variable): 프로그램에서 필요한 데이터를 저장하는 메모리 공간.
		// 변수 선어니 변수의 데이터 타입과 변수의 이름을 선언. 

		// int age;
		// 변수 초기화: 변수에 값을 할당(저장).		
		int age = 16;
		
		System.out.println(age); // 변수 age가 저장한 값을 출력.
		
		age = 17;
		
		System.out.println(age);
		
		int salary = 100; // 선언, 초기화 동시 작성
		
		System.out.println(salary);
		System.out.println("-------------------------------");
		
		/*
		 * 자바의 기본 데이터 타입
		 * 정수 타입 : byte, short, int, long, char
		 * 실수 타입: float, double
		 * 논리 타입: boolean
		 */
		
		/*
		 * long salary = 10000000000L;
		 * System.out.println(salary);
		 */
		
		// 정수 2개의 사칙연산 결과를 출력 
		
		int a = 16;
		int b = 7;
		int result1 = a + b;
		int result2 = a * b;
		double result3 = a % b;
		System.out.println(result1);
		
		System.out.println("a + b = " + result1);
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + result2);
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + result3);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
