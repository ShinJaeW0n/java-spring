package java8;

public class Day0905 {
	//형변환이 필요하다.
	public static void main(String[] args) {
		
		
//		char ch = 'a'; //형변환
//
//		for (int i = 1; i <= 26; i++) {
//
//			System.out.print(ch++ + " "); // ?
//
//			
//
//		}System.out.println();
//
//		
//		
//		char ch1 = 'A';
//
//		for (int i = 1; i <= 26; i++) {
//
//			System.out.print(ch1++ + " "); 
//
//			
//
//		}System.out.println();
		
		
		
		//포문에서 1씩 증가시켜서 하나씩 출력해볼 수 있음.
		//쌤이 한거 	97		   122를 넣어도 똑같이 나옴.
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print((char)i + " ");//형변환
		}
		
		System.out.println();
		
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println();
		
	}
	
}
