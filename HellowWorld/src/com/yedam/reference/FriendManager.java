package com.yedam.reference;

import java.util.Scanner;

/*
 * 친구정보 저장 기능.
 * 1.추가 2.목록 3.조회(숙제) 9.종료
 * storage[1] = null;
 * storage[1].friendName ="홍길동"
 * storage[1].friendPhone ="010-1111-1111"
 * storage[1].friendBirth ="1999-01-01"
 * 
 * 
 * C(reate)R(ead)U(pdate)D(elete)
 */
public class FriendManager {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		Friend[] storage = new Friend[10];// 친구정보 저장할 수 있는 공간 10개 확보.
//		storage[0] = new Friend();
//		storage[0].friendName ="홍길동";
//		storage[0].friendPhone ="010-1111-1111";
//		storage[0].friendBirth ="1999-01-01";
		// 이렇게 사용 꼭 중요하다
		while (run) {
			System.out.println("1.추가 2.목록 3.조회(숙제) 4.수정(연락처) 9.종료");
			System.out.print("선택>> ");

			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // 추가
				System.out.print("친구 이름 입력>> ");
				String name = scn.nextLine();
				System.out.print("친구 연락처 입력>> ");
				String phone = scn.nextLine();
				System.out.print("친구 생일 입력>> ");
				String birth = scn.nextLine();

				for (int i = 0; i < storage.length; i++) {
					// System.out.println(storage[i]);
					if (storage[i] == null) {// 비어있는 위치에 저장.
						storage[i] = new Friend();
						storage[i].friendName = name;
						storage[i].friendPhone = phone;
						storage[i].friendBirth = birth;
						break;
					}

				}
				break;// switch 종료.
			case 2: // 목록
				System.out.println("이름     전화번호    ");
				System.out.println("------------------");
				for (int i = 0; i < storage.length; i++) {
					if (storage[i] != null) {
						System.out.printf("%4s %14s \n", storage[i].friendName, storage[i].friendPhone,
								storage[i].friendBirth);
					}
				}
				break;// switch 종료.
			case 3: // 조회
				boolean isExists = false;
				System.out.print("친구 이름 입력>> ");
				name = scn.nextLine();
				int idx = -1;
				for (int i = 0; i < storage.length; i++) {
//					if (storage[i]) {
//						
//					}
					if (isExists) {
						System.out.println("---------------------------------");
						System.out.printf("이름:%4s | 연락처: %14s | 생년월일: \n");
						System.out.println("--------------------------------");

					} else {
						System.out.print("조회되지 않는 이름입니다.");
						break;
					}
				}
			case 4: // 수정
				System.out.print("친구 이름 입력>> ");
				name = scn.nextLine();
				System.out.print("친구 연락처 입력>> ");
				phone = scn.nextLine();
				// 10개 중에서 6개 저장, 4개 null
				for (int i = 0; i < storage.length; i++) {
					if (storage[i] != null) {// null 값이 아닌 요소 대상.
						if (storage[i].friendName.equals(name)) {
							storage[i].friendPhone = phone;
							System.out.print("정보가 수정되었습니다.");
						}
					} else {
						System.out.print("정보가 수정되지 않았습니다.");
						break;
					}
				}
				break;// switch 종료.
			case 5: // 삭제. 배열 위치에 null 값 대입.
				System.out.print("삭제할 친구 이름 입력>> ");
				name = scn.nextLine();

				for (int i = 0; i < storage.length; i++) {
					if (storage[i] != null) {// null 값이 아닌 요소 대상.
						if (storage[i].friendName.equals(name)) {
							storage[i] = null;
							break;
						}
					}
				}
			case 9: // 종료
				run = false;
				break;// switch 종료.
			default:
				System.out.println("메뉴를 다시 선택하세요");
			}// end of switch.

		} // end of while.
		System.out.println("프로그램 끝");
	}// end of main()
}// end of class
