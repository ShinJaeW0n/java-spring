package java8;

public class Day07test03 {
		public static void main(String[] args) {
			
			//1부터 10까지의 수 합계 구하기
			
			int sum = 0;		//합계 선언해놓기.
			
			for (int i = 1; i <= 10; i++) {
				sum += i;
			}
			
			System.out.print("1에서 10까지의 수 합계 :" +  sum);
		}
}
