package com.yedam.student;

import java.util.Scanner;

/*
 * CRUD 처리.
 * 1.추가 2.목록 3.수정(영어, 수학) 4.삭제 5.상세조회(합계,평균) 6. 합계점수기준 정렬 9.종료
 */
//student =>stu,
public class StudentManager {
	public static void main(String[] args) {
 
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		Student[] storage = new Student[10];
		

		while (run) {
			System.out.println("1. 추가 2. 목록 3. 수정 4. 삭제 9. 종료");
			System.out.print("선택>> ");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 추가
				System.out.print("학생 번호 입력>> ");
				String sno = scn.nextLine();
				System.out.print("학생 이름 입력>> ");
				String sname = scn.nextLine();
				System.out.print("영어 점수 입력>> ");
				int escore = Integer.parseInt(scn.nextLine());
				System.out.print("수학 점수 입력>> ");
				int mscore = Integer.parseInt(scn.nextLine());

				for (int i = 0; i < storage.length; i++) {
					if (storage[i] == null) {
						storage[i] = new Student(sno, sname, escore, mscore);//인스턴스 생성.
//						storage[i].stdNo = sno;
//						storage[i].stdName = sname;
//						storage[i].engScore = escore;
//						storage[i].mathScore = mscore;
						break;
					}
				}
				break;
			case 2:
				System.out.println("나는 case 2");
				System.out.printf("%5s %3s %2s %2s \n", "학생번호", "학생이름", "영어", "수학");
				System.out.println("-----------------------------");
				for (int i = 0; i < storage.length; i++) {
					if (storage[i] != null) {//storage 학생 정보
						System.out.printf("%s %s %d %d \n", storage[i].stdNo, storage[i].stdName,
								storage[i].engScore, storage[i].mathScore);
						//storage[i].introduce();
					}
				}
				break;
			case 3:
				System.out.print("수정할 학생 번호 입력>> ");
				sno = scn.nextLine();
				System.out.print("영어 점수>> ");
				escore = Integer.parseInt(scn.nextLine());
				System.out.print("수학 점수>> ");
				mscore = Integer.parseInt(scn.nextLine());

				for (int i = 0; i < storage.length; i++) {
					if (storage[i] != null) {
						if (storage[i].stdNo.equals(sno)) {
							storage[i].engScore = escore;
							storage[i].mathScore = mscore;
						}
					}
				}
				break;
			case 4:
				System.out.print("삭제할 학생의 정보 입력>> ");
				sno = scn.nextLine();

				for (int i = 0; i < storage.length; i++) {
					if (storage[i] != null) {
						if(storage[i].stdNo.equals(sno)) {
							storage[i] = null;
					}
					}
				}
				break;
			case 9:
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
//public static void init() {
//	storage[0] = new student();
//	storage[0].stdNo = "S-001";
//	storage[0].stdName = "홍길동";
//	storage[0].engScore = "90";
//	storage[0].mathScore = "80";
//	
//	storage[1] = new student();
//	storage[1].stdNo = "S-002";
//	storage[1].stdName = "박문식";
//	storage[1].engScore = "70";
//	storage[1].mathScore = "78";
}