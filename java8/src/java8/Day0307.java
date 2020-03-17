package java8;

public class Day0307 {
	public static void main(String[] args) {
	
		int a = 10;
		int b = 3;
		a += b; // a = a+b
		System.out.println(a);
		a -= b; // a = a-b;  13-3
		System.out.println(a);
		a *= b;
		System.out.println(a);
	
		a = 10; // 다시 값 초기화.
		System.out.println(a);
		
		a *= 3+10; //대입연산자는 오른쪽부터 그리고 맨 마지막에 해야하는것.** a = a * 3+10
		System.out.println(a);
		
		a += 1; //131이 나옴.
		System.out.println(a);
		
	}
}
