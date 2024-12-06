package com.yedam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcExe {
	public static void main(String[] args) {
//		insert("Hong","KHONG", "0204-01-02", "IT_PROG");
//		update("minseo" , "011.3433.7655", 4500, 212);
//		delete();
		select();
		System.out.println("end of prog.");
	}


	// 연결
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// 드라이버 로드
			//Connection 객체
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		}catch (Exception e) {
			System.out.println("연결 중 에러");
			e.printStackTrace();
		}
		return conn;//connection 객체 변환.
	}
	
	//삭제기능.
	public static void delete(int employee_id) {
		Connection conn = getConn();
		String query = "delete from employees"
				+ "where employee_id = " + employee_id;
		try {
			Statement stmt = conn.createStatement();
			int r = stmt.executeUpdate(query);
			System.out.println(r + "건 처리됨.");
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//수정기능
	public static void update(int empId, String fname, String pno, int sal) {
		Connection conn = getConn();
		String query = "update employees"
				+ "           set first_name = '" + fname + "' "
				+ "               ,phone_number = '" + pno + "' "
				+ "               ,salary = " + sal + " "
				+ "     where employee_id = " + empId + " ";
		try {
			Statement stmt = conn.createStatement();
			int r = stmt.executeUpdate(query);
			System.out.println(r + "건 처리됨.");
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	// 입력기능.
	public static void insert(String lastName, String hdate, String job, String email) {
		Connection conn = getConn();
		String query = "insert into employees (employee_id, last_name, email, hire_date, job_id)"
				+ "values(employees_seq.nextval" //empId
				+ "       , '" + lastName + "'" //last_name
				+ "       , '" + email + "'" //email
				+ "       , '" + hdate + "'" //hire_date
				+ "       , '" + job + "')";
		try {
			Statement stmt = conn.createStatement();
			int r = stmt.executeUpdate(query);
			System.out.println(r + "건 처리됨.");//employees_seq.nextval DB 내부적으로 쿼리해수는 것
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}

	// 조회기능.
	public static void select() {
	Connection conn = getConn();

	// sql작성. Statement 객체.
	try{
	Statement stmt = conn.createStatement();
	//조회
	ResultSet rs = stmt.executeQuery("select * from employees where employee_id > 200 order by employee_id desc");
	//결과출력
	while(rs.next()){
		System.out.println(rs.getInt("employee_id") + ", " 
				+ rs.getString("first_name") + ", "
				+ rs.getString("salary") + ", "
				+ rs.getString("email"));
	}
	conn.close();// 연결해제
	}catch(SQLException e){
		e.printStackTrace();
	}
		System.out.println("==end of data==");
	}

}
