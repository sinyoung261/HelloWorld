package com.yedam.variable;

import java.util.Scanner;

public class TodoExe4 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("몇단까지 출력하겠습니까?>> ");
		int dan = scn.nextInt();// Int 사용자 입력값을 정수로 반환한다.

		for (int j = 1; j <= 9; j++) {
			// System.out.printf("%d 단입니다. \n", j);
			for (int i = 2; i <= dan; i++) {
				System.out.printf("%d * %d = %3d  ", i, j, j * i);
			}
			System.out.println();// 줄바꿈....
		}

		// 별찍기.
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; i <= j; j--) {

				System.out.printf("*");

			}
			System.out.println();
		}

		System.out.println("end of prog.");

	}
}