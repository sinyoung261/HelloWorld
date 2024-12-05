package com.yedam.jdbc.student;

/*
 * tbl_student의 칼럼을 필드로 선언.
 * std_no => stdNo;
 */

public class Student {
	private String stdNo;
	private String stdName;
	private String stdPhone;
	private int engScore;
	private int mathScore;
	
	public Student() {  } //컴파일러가 기본 생성자를 만들어준다.

	//생성자 => 인스턴스를 생성하면서 필드의 값을 초기화해주는 기능.
	public Student(String stdNo) {
		this.stdNo = stdNo;
	}
	
	
	public Student(String stdNo, String stdName, int engScore, int mathScore) {
//		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	//getter, setter. 메소드
	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public String showInfo() {
		return "학번: " + stdNo + "" + stdName + " " + stdPhone;
	}
	
	//상세화면 출력
	public String showDetail() {
//		-------------------------
//		학생번호: 24-001 이름: 홍길동
//		연락처: 010-1111-2222
//		영어점수: 80     수학점수: 70
//		-------------------------
		String result ="-----------------------------------------\n";
		result += "학생번호: " + stdNo + "   이름: " + stdName +  "\n";
		result += "연락처: " + stdPhone + "\n";
		result += "영어점수: " + engScore + "        수학점수: " + mathScore + "\n";
		result += "---------------------------\n";
		return result;
	}
	
}