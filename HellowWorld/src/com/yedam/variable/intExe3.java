package com.yedam.variable;

public class intExe3 {
	public static void main(String[] args) {
		boolean b1 = true;
		b1 = 10 > 20;
		
//		char c1 = 0; //unicode 코드값을 매핑.
//		c1 = 65; // 'A'; 'Z' => 91
		
//		for(int i=1; i<=26; i++){
//				System.out.println(c1++);
//	}
		char c2 = '['; //"Hello" 비교--알아둬야함
		System.out.println((int)c2);
		
		//
		int n1 = 1;
		double n2 = 2;
		double result4 = n1 * 1.0 / n2; // 자동형변환(promotion). 0.5 => 0   n1=4바이트  1.0=8바이트
		//n1의 값과 n2의 타입이 다를 시  double 타입이 된다.
		//큰 값은 작은 값으로 변환가능하고, 작은 값은 큰 값으로 변형 불가능하다
		System.out.println("n1 / n2 의 결과 " + result4);
		//byte < short < int < long < float < double
}
}
