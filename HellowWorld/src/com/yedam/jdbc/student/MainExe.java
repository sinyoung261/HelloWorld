package com.yedam.jdbc.student;

import java.util.ArrayList;
import java.util.Scanner;

import com.yedam.board.MemberExe;

public class MainExe {

	static Scanner scn = new Scanner(System.in);

	// db 처리기능.
	static StudentDAO dao = new StudentDAO();

	public static void main(String[] args) {
		boolean run = true;
		
		//로그인 기능.code here...
		while(true) {
			System.out.print("회원아이디 입력>> ");
			String id = scn.nextLine();
			System.out.print("회원비밀번호 입력>> ");
			String pass = scn.nextLine();
			String name = dao.login(id, pass);
			if(name != null) {
				System.out.println(name + "환영합니다.");
			}else {
				System.out.println("id와 pw를 확인하세요.");
			}
			break;
		}

		while (run) {
			System.out.println("1.목록 2.등록 3.점수등록 9.종료");
			System.out.println("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 목록.
				list();
				break;

			case 2: // 등록
				System.out.println("학생번호 입력>> ");
				String No = scn.nextLine();
				System.out.println("학생이름 입력>> ");
				String Name = scn.nextLine();
				System.out.println("연락처 입력>> ");
				String Phone = scn.nextLine();
				// 3개 항목을 매개값으로 받는 생성자 선언.
				Student std = new Student();

				if (dao.insertStudent(std)) {
					System.out.println("정상 등록.");
				} else {
					System.out.println("등록 실패.");
				}
				break;

			case 3: // 점수등록
				System.out.print("학생번호 입력>> ");
				No = scn.nextLine();
				System.out.print("영어점수 입력>> ");
				int escore = Integer.parseInt(scn.nextLine());
				System.out.print("수학점수 입력>> ");
				int mscore = Integer.parseInt(scn.nextLine());

				std = new Student();

			case 4:
				System.out.print("학생번호 입력>> ");
				No = scn.nextLine();

				std = dao.selectStudent(No);
				if (std == null) {
					System.out.println("조회된 결과가 없습니다.");
					break;
				}
				System.out.println(std.showDetail());
				break;

			case 9: // 종료
				run = false;
			}
		}
		System.out.println("end of prog.");
	}// end of main

	// 목록기능.
	public static void list() {
		Search search = new Search();//변수
		
		System.out.println("1.학생이름 2.연락처 3.영어");
		System.out.print("선택>> ");
		int menu = Integer.parseInt(scn.nextLine());
		
		switch (menu) {
		case 1:
			System.out.print("검색할 이름>> ");
			String name = scn.nextLine();
			search.setName(name);
			break;
		case 2:
			System.out.print("검색할 연락처>> ");
			String phone = scn.nextLine();
			search.setPhone(phone);
			break;

		case 3:
			System.out.print("검색할 영어점수>> ");
			int escore = Integer.parseInt(scn.nextLine());
			search.setEngScore(escore);
					
		}// end of switch.
		
		System.out.println("1.학생번호정렬 2.학생이름정렬");
		System.out.print("선택>> ");
		int orderBy = Integer.parseInt(scn.nextLine());
		//정렬조건 추가. orderBy => 값을 ? 지정.
		//완성...
		
		ArrayList<Student> list = dao.studentList(search);
		for (Student stud : list) {// 학생번호, 이름, 연락처
			System.out.println(stud.showInfo());
		}

	}//end of list().
}
