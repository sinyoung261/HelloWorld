package com.yedam.api;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //인스턴스 생성.
		cal.set(2024, 1, 1);//0부터 시작
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"요일");//요일
		//get에 지정된 함수가 너무 많아서 이름을 적어줘야 나중에 구분하기 쉬워진다.
		System.out.println(cal.getActualMaximum(Calendar.DATE) +"막날");
		//getActualMaximum은 그 달의 마지막 날을 가져온다
		
//		createCalendar(2024, 11);
		
	}
	
	//1일의 요일?, 막날 ? => 달력.
//	static void createCalendar(int positionOfDay, int lastDate) {
	static void createCalendar(int year, int month) {
		int positionOfDay = 0; //계산
		int lastDate = 0; //계산
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		// 요일출력.
		for(String day : days) {
			System.out.printf("%4s", day);// 첫날이 일요일이 아닐때 공란 그려줌
		}
		System.out.println();
		//1일의 위치지정.
		for(int i = 1; i < positionOfDay; i++) {
			System.out.printf("%4s", " ");
		}
		// 날짜출력.
		for(int d = 1; d <= lastDate; d++) {
			System.out.printf("%4d", d);
			if((d+positionOfDay - 1) % 7 == 0) {
				System.out.println(); // 줄바꿈.
			}
		}
	}
}
