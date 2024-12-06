package com.yedam.jdbc;

import java.awt.SystemTray;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExe2 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setLastName("Park");
		emp.setHireDate("2000-01-01");
		insert(emp);
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
	public static void delete(int empId) {
		Connection conn = getConn();
		
	}
	
	//수정기능
	public static void update(Employee emp) {
		Connection conn = getConn();
		String query = "update employees"
				+ "           set first_name = ? "
				+ "               ,phone_number = ? "
				+ "               ,salary = ?"
				+ "     where employee_id = ?";
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
	public static void insert(Employee emp) {
		Connection conn = getConn();
		String query = "insert into employees (employee_id"
				+ "                           , last_name "
				+ "							  , email"
				+ "                           ,hire_date"
				+ "							  ,job_id)"
				+ "values(employees_seq.nextval" //empId
				+ "       , ? " //last_name
				+ "       , ? " //email
				+ "       , ? " //hire_date
				+ "       , ? )";
		//?(파라메타)는 값이 지정되지 않았다는 걸 뜻한다.
		try {
			PreparedStatement stmt = conn.prepareStatement(query);
			
			stmt.setString(1, emp.getLastName());
			stmt.setString(2, emp.getEmail());
			stmt.setString(3, emp.getHireDate());
			stmt.setString(4, emp.getJobId());
//			stmt.setInt(5, emp.getSalary());
			
			int r = stmt.executeUpdate();
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
		System.out.println(rs.getString("LAST_NAME") + ", " 
				+ rs.getString("FIRST_NANE") + ", "
				+ rs.getString("EMAIL") + ", "
				+ rs.getString("JOB_ID") + ", "
				+ rs.getString("PHONE_NUMBER") + ", "
				+ rs.getString("SALARY"));
	}
	conn.close();// 연결해제
	}catch(SQLException e){
		e.printStackTrace();
	}
		System.out.println("==end of data==");
	}

}
