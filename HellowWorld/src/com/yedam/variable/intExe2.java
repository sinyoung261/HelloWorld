package com.yedam.variable;

public class intExe2 {
	public static void main (String[] args) {
		//정수형 => byte(1바이트), short(2바이트), int(4바이트),
		//long(8바이트), char(2바이트)
		//1비트 *8 => 1바이트.
		byte b1 = 100;
		byte b2 = 100;
		int result = (int) b1 + (int) b2; //형변환(casting)
		
		byte result2 = (byte) (b1 + b2);
		System.out.println(result2);
		
		for(int i=0; i<100; i++) {
			System.out.println("b1의 값: " + ++b1);//(출력 된 후 1씩 증가 b1++),(1씩 증가시킨 후 출력 ++b1)
			//2진수로 나온 숫자1과 그 반대 숫자2를 구해 숫자1 값에서 숫자2 값을 빼면 값을 구할 수 있다
		}
		System.out.println(2147483647);//이 정수 값보다 더 큰 값을 넣게 되면 오류가 뜨게 된다
		long l1 = 10000000000L;//long(L,l) 0타입을 넣어주면 값이 정수보다 크더라고 오류가 발생하지 않는다.
		
		//float(4바이트), double(8바이트)
		//0~1 사이의 모든 값 정확한 값을 가져오지 않고 근사치의 값을 가져온다.
		double d1 = 0.1;
		double d2 = 0.2;
		double result3 = d1 + d2;
		result3 = 0.345678;
		
		System.out.println("result3의 값:" + Math.floor(result3*1000)/1000);
		double[] doubleAry = {10, 23.4, 11.7, 34.5};
		//doubleAry의 합은 78.4 입니다.
		
//		for (int i=0; i<5 i++) {	
//			double[]= 
//			System.out.println("doubleAry의 합은" + sum +"입니다.");
//		}
	}
}
