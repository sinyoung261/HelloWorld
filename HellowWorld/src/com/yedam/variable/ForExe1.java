package com.yedam.variable;

public class ForExe1 {
	public static void main(String[] args) {
		// break: 반복 종료.
		// continue: 아래부분 실행X 다음순번 이동.
		for (int i = 1; i <= 10; i++) {

			if (i == 7) {
				break;//break는 반복문을 종료시킨다.
			}
			if (i % 2 == 0) {
				continue;//continue 아래의 코드는 실행하지 않고 다음 증강식으로 넘어간다.
			}
			System.out.println(i);
		}
		System.out.println("end of prog.");
	}
}