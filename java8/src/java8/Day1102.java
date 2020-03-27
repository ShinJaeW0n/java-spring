package java8;

public class Day1102 {
	
	//0부터 9까지 출력 후 0으로 다시 초기화하라.
	public static void main(String[] args) {
		int [] a = new int[10];
		
		for(int i =0; i<a.length; i++) {
			a[i] = i;
			
		}
		
		for(int number : a) {
			System.out.println(number);
		}

//		for(int i = 0; i<a.length; i++) {  <= 각각의 요소를 0으로 대입
//			a[i] = 0; //모두 0으로 초기화해라.
//		}
	
		for(int number : a) {
			System.out.println(number);
		}
		
		//0으로 초기화하는 또 다른 방법.
		a = new int[10]; //새로운 객체를 대입, 초기화식.
		
		for(int number : a) {
			System.out.println(number);
		}
		

// 내가 한 것ㅎ.		
//		int [] a1 = new int [9];
//		
//		for(int i =0; i<a.length; i++) {
//			System.out.println(a1[i]);
//		}
		
	}
}
