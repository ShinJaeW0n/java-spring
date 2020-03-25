package java8;

public class Day0903 {

	public static void main(String[] args) {
		
		
	/*1부터 25까지 5칸 5줄로 출력하세요*/
		
		// system.out.printf 는 형식(format)에 맞게 출력하는 메소드
		// system.out.printf 는 c언어에서 출력으로 사용하는 메소드인데 자바에서도 사용할 수 있습니다.
		// 첫번째 인수(입력값)은 출력 형식을 입력하고 두번째부터는 출력 형식에 대입할 변수를 입력합니다.
		// 
		// 형식의 시작은 %로 시작합니다. (형식에 맞춰 출력하고 싶다)
		// d : decimal => 10진수
		// f : float => 실수
		// lf : long float => double 실수  //c언어용. 자바 언어 없음.
		// o : octa => 8진수
		// x : hexa => 16진수
		// b : binary 2진수 (?)
		// s: String 문자열
		// c : char 문자1개
		
		// 조합 할 수 있는것
		// 앞쪽에 숫자를 입력하면 자리수를 뜻함
		// %2d => 십진수로 2자리 출력, %10d => 십진수로 10 자리 출력.
		// 숫자앞에 0을 붙이면 빈 공간을 0으로 채웁니다.
		// 다른 문자는 사용할 수 없음.
		// 제일 앞쪽에 - 를 붙이면 좌측 정렬합니다. ex) %-03d
	
	for(int i = 1; i <=25; i++) {
		System.out.print(i + "\t");
		if(i%5==0) {
			System.out.println();
		}
	}
	
	
	System.out.println();
	
	int cnt = 1;
	for(int i =1; i <=5; i++) {
		for(int j=1; j <= 5; j++) {
			System.out.printf("%02d ", cnt );
			cnt++;			//2자리로 출력됨. -> %02d //"%02d %f %s ", cnt , 3.14, "문자열"
		
		}System.out.println();
	}
	
	
	System.out.println();
	/* 01 02 03 04 05
	 * 10 09 08 07 06
	 * 11 12 13 14 15
	 * 20 19 18 17 16
	 * 21 22 23 24 25
	 * 
	 * */
	
	
	//배열문제임.
	
	for(int i = 0; i < 5; i++) {
		for(int j=0; j < 5; j++) {
			if(i % 2 == 0) {
				System.out.print((i*5)+j+1+ "\t");
			}else {
				System.out.print((i+1)*5-j+ "\t");
			}
			
		
		}System.out.println();
	}
	
	System.out.println();
	
	

	/*
	 * @ 1의 1열
	 *  @ 2의 2열
	 *   @ 3의 3열
	 *    @
	 *     @
	 * 
	 * */
	
	for(int i = 0; i < 5; i++) {
		for(int j = 0; j < 5; j++) {
		if(i == j) {
			System.out.print("@");
		}else {
			System.out.print(" ");
		}
		
		}System.out.println();
		
		
	}
	
	
	
	
	
	
//	for(int i = 1; i <= 25; i++ ) {
//		System.out.printf("%02d " , i );
//		if(i%5==0) {
//			System.out.println();
//		}else if (i%10==0) {
//			
//		}
//			
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	}	
	
}
