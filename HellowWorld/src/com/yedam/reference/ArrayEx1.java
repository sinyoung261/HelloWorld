package com.yedam.reference;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		// 위치 => 인덱스(0부터 시작)
		intAry[0] = 10; // intAry = 10
		intAry[1] = 20;

		// 크기(length)
		System.out.println(intAry.length);
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("i의 값: " + i + ", 변수값:" + intAry[i]);
		}

		// 배열의 크기를 초과해서 값을 지정.
		intAry[4] = 10;

		double[] dblAry = { 2.5, 1.2, 4, 5.6, 8 };// 초기값을 지정하여 배열 선언이 가능하다.
		dblAry[1] = 9.9;

		dblAry = new double[] { 2.3, 6.7 };// 변수를 선언한 다음 초기값을 줄 경우에는 new double을 적어줘야 한다.
		for (int i = 0; i < dblAry.length; i++) {
			System.out.println("i의 값: " + i + ", 변수값: " + dblAry[i]);
		}
		// 문자열 배열.
		String[] strAry = { "홍길동", "김민섭", "박창규" };
		// enhanced for.
		for (String str : strAry) {
			System.out.println(str);
		}

	}
}
