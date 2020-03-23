package java8;

public class Day07test08 {
	
	
	//1에서 10까지 출력하는 구문입니다.
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " "); //가로로 한칸씩 띄우려고.
		}
	System.out.println();
	
	
	//10부터 1까지 출력하는 구문
	
	
	for(int i = 10; i >= 1; i--) {
		System.out.print(i + " ");
		
		
	}
	
	System.out.println(); //한칸씩 띄어줄려고
	
	//또는 이런 구문도 가능.
	for(int i = 0; i <= 10; i++) {
		System.out.print(10 - i + " " );
		
		
	}
	
	System.out.println();
	
	//숫자 대신 문자#으로 출력
	for(int i = 1; i <= 10; i++) {
		for(int j = 0; j < i; j++) {
			System.out.print("#");
		}
		System.out.println(); //내부에서 포문 끝나고 엔터를 쳐주는 것
	
	}
	
	//10개에서 1개까지 #을 출력.
//	뒤에 숫자만큼 반복한다.
//	뒤에 숫자보다 작을때까지 반복한다.
//	외부 for부터 내부 for 로 간다.
//	#을 10개 치고 빠져나온다.
//	
	for(int i = 10; i >= 1; i--) {
		for(int j = 0; j < i; j++) {
			System.out.print("#");
		}
	System.out.println();
	}
	
	}
}
