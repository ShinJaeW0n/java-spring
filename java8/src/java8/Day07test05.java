package java8;

public class Day07test05 {

	public static void main(String[] args) {
		
		//1부터 50까지의 수 중 3의 배수의 합계를 구하라.
		int sum = 0;
		
		for (int i = 1; i<=50; i++ ) {
			
			if(i % 3 == 0) {
				sum += i;
			}
		}
		
		System.out.print("1부터 50까기 중3 의 배수의 합계:" + sum);
	}
	
}
