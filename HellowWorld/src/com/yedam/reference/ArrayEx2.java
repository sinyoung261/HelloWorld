package com.yedam.reference;

import java.util.Scanner;

/*
 * 은행 프로그램 v 1.0
 * 작성자: 이창호
 * 작성일시: 2024.11.29
 */

public class ArrayEx2 {
	public static void main(String[] args) {
		// 변수 초기화. 10만원 초과불가. 잔고불가: 90000원 + 20000원(10만원을 넘어서는 금액은 받지 않는다)
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료   ");
			System.out.println("-----------------");
			System.out.print("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());// 1, 2
			int maxBalance = 100000;

			switch (menu) {
			case 1:
				System.out.print("예금액> ");
				// 현재잔고 + 예금액 <= 100000 인 경우 정상예금 처리.
				int inBalance = Integer.parseInt(scn.nextLine());
				if (balance + inBalance <= maxBalance) {
					balance += inBalance;
					System.out.println("정상처리 되었습니다.");
				} else {
					System.out.println("금액초과입니다.");
				}
				break;
			case 2:
				System.out.print("출금액> ");
				// 현재잔고 + 출금액 <= 0 인 경우 정상출금처리.
				inBalance = Integer.parseInt(scn.nextLine());
				if (balance - inBalance > 0) {
					balance -= inBalance;
					System.out.println("정상처리 되었습니다.");
				} else {
					System.out.println("마이너스 잔고로 출금할 수 없음");
				}
			case 3:
				System.out.print("잔고> " + balance + "원 입니다.");

			case 4:
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
