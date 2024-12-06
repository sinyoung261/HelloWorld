package com.yedam.jdbc.student;

import java.util.ArrayList;

public class TestExe {
	public static void main(String[] args) {
		//검색조건.
		Search search = new Search();
		search.setName("길동");
		search.setPhone("34");
		search.setEngScore(60);
		search.setOrderBy("std_no"); //학생번호정렬.
		
		StudentDAO sdao = new StudentDAO();
		ArrayList<Student> list = sdao.studentList(search);
		for(Student std : list) {
			System.out.println(std.showInfo());
		};
	}
}
