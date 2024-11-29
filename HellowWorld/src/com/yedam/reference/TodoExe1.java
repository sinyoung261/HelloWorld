package com.yedam.reference;

public class TodoExe1 {
	public static void main(String[] args) {
		// 정수를 담는 배열 크기 5개로 선언.
		int[] intAry = new int[5];
		// Math.random() 활용 => 50 ~ 100 사이의 점수를 저장.
		for (int i = 0; i < intAry.length ;) {
			int temp = (int) (Math.random() * 5) + 50;
			//2번째 -> 1번째, 3번째 -> 2번째, 4번째 -> 3번까지 비교.
			//뭐뭐 사이의 정수를 나타내고 싶을 때 (int) (Math.random()을 사용해 값을 구한다.
			boolean exists = false;//초기값
			for (int j = 0; j <=i -1; j++) {
				if(intAry[j] == temp) {
					exists =true; //같은 값이 존재하면
					
				}
			}
			//같은 값이 존재하면..i값을 증가X
			if(exists) {
				continue;
			}
			intAry[i] = temp;
			i++;
		}
		
		//출력.
		for(int num : intAry) {
			System.out.println(num);
		}
		System.out.println("end of prog.");
	}
}
