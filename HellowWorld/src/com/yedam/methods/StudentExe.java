package com.yedam.methods;

public class StudentExe {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		//	s1.engScore = 1000;
		s1.setStdNo("S001");
		s1.setStdName("홍길동");
		s1.setEngScore(70);
		s1.setMathScore(75);
		
		System.out.println(s1.showInfo());
	}
}
