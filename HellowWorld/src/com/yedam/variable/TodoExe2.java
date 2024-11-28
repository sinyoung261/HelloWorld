package com.yedam.variable;

import java.util.Scanner;//java->util안에있는 클래스다

public class TodoExe2 {
	public static void main(String[] args) {
		String name = "김길동";
		
		Scanner scn = new Scanner(System.in);//ctrl+shift+o
		System.out.println("이름을 입력.");
		String inputValue = scn.nextLine();// 사용자의 입력값을 반환.
		
		if(name.equals(inputValue)) {//사용자가 입력한 값이 같은 이름으면 같은 이름입니다. 아니면 다른이름입니다.
			System.out.println("같은 이름입니다.");
		}else {
			
			System.out.println("다른 이름입니다.");
		}
		
		System.out.println("end of prog.");
	}

}
