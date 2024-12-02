package com.yedam.reference;

import java.util.Scanner;

public class FriendExe {
	public static void main(String[] args) {
		String name = new String("홍길동"); //"홍길동";
		int age = 20;
		
		Friend f1 = new Friend();//Friend 커서 갔다대고 ctrl + 클릭
		f1.friendName = "홍길동";
		f1.friendPhone = "010-1111-1111";
		f1.friendBirth = "1999-04-05";
		
		Friend f2 = new Friend();
		f2.friendName = "김민수";
		f2.friendPhone = "010-2222-2222";
		f2.friendBirth = "1999-08-08";
				
		Friend f3 = new Friend();
		f3.friendName = "최두식";
		f3.friendPhone = "010-3333-3333";
		f3.friendBirth = "1999-09-09";
		
		Friend[] myfriends = { f1, f2, f3 };
		
//		System.out.println(myFriends[0].friendName); //홍길동.
//		System.out.println(myFriends[0].friendPhone);//010-1111-1111
//		System.out.println(myFriends[0].friendBirth);//1999-04-05
		
		// 이름 => 이름, 연락처, 생년월일 출력.
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		String searchName ="";
		
		while (run) {
			//1. 사용자의 입력값을 searchName에 저장.
			searchName = scn.nextLine();
			if(searchName.equals("quit")) {
				break;
			}
			//2. searchName의 값을 names 배열에서 검색.
			boolean isExists = false;
			int idx = 1;
			for (int i = 0; i < myfriends.length; i++) {
				isExists = myfriends[i].equals(searchName);

			searchName = scn.nextLine();
			//3. 찾는 이름이 있으면 이름, 연락처, 생년월일 출력.
			if(isExists) {
				idx = i;
				break;
			}
		}
			//4. 없으면 "찾는 이름 없음" 출력.
			if(isExists) {
				System.out.println(myfriends[0].friendName);
			}else {
				System.out.println("찾는 이름 없음");
			}
			//5. 입력값이 quit이면 while 반복문 종료.
			
		}
		System.out.println("프로그램 종료");
	}
}