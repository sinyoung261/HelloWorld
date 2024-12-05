package com.yedam.methods;
/*
 * 학생의 성적관리 Prog.
 * 학생번호, 학생이름, 영어점수, 수학점수
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
	
}