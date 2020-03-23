package java8;

public class Day07test06 {
	public static void main(String[] args) {
		//1부터 10까지의 수를 곱하시오.
		
		int sum = 1; //합이 아니라 곱이기 때문에 1로 초기화 해줘야함.
		
		for (int i=1; i<=10; i++) {
			sum *= i; 
		}
	System.out.println("1부터 10까지의 수의 곱:" + sum );
	
	}
}
