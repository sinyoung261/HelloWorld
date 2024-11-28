package com.yedam.variable;

public class intExe4 {
	public static void main(String[] args) {
		String msg = new String("Hello, World"); //msg 주소값에 문자객체의 주소.
		int age = 10; //age주소값에 10의 값.
		
		int myAge = age;
		System.out.println(myAge == age);
		
		myAge = 20;
		
		System.out.println("age=>" + age + ", myAge=>" + myAge);//ctrl+alt+화살표
		
		System.out.println(msg.equals("Hello, World"));//equals는 msg 값과 Hello, World값을 비교한다
		//equals 문자값 지정 시 사용
	//	System.out.println(msg == "Hello, World"));
	}

}
