package com.yedam.classes;

import com.yedam.student.Student;

public class CalculatorExe {
	public static void main(String[] args) {
		Calculator cal1 = new Calculator();// 인스턴스 생성.
		int sum = cal1.sum(10, 20);// cal안에 값은 정수만 받을 수 있다
		// 정수 외 수를 넣고 싶을땐 메소드를 다시 입력해야 한다.
		System.out.println("합계: " + cal1.sum(10, 20));
		System.out.println("합계: " + cal1.sum(10.3, 20));
		System.out.println("합계: " + cal1.sum(10, 20.2));
		cal1.printStar(3);
		System.out.println();

		int[] intAry = { 3, 6, 9, 12 };
		sum = cal1.sumAry(intAry);// 리턴 타입은 int, 매개변수 정수배열
		System.out.println("intAry의 합계 " + sum);

		double result = cal1.averageAry(intAry);
		System.out.println("intAry의 평균 " + result);

		Student s1 = new Student("S001", "홍길동", 83, 78);
		Student s2 = new Student("S002", "홍길동", 77, 83);
		Student s3 = new Student("S003", "홍길동", 88, 91);
		
		Student[] stdAry = {s1, s2, s3};
		Student std = cal1.getMaxScore(stdAry);
		System.out.println("최고영어점수는 " + std.engScore + ", 이름은 " + std.stdName);
	}
}
