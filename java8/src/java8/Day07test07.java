package java8;

public class Day07test07 {

	//1부터 50까지의 숫자 중 3의 배수의 개수를 구하라.
	public static void main(String[] args) {
	//갯수는 count를 쓴다.
		
		int cnt = 0;
		
		for(int i = 1; i <= 50; i++) {
			if(i % 3 == 0) {
				cnt++;
			}
		}
		System.out.println("1부터 50까지 중 3의 배수의 개수는? : " + cnt);
		

	//이건 내가 한거임. 다 틀린것.
//		int sum = 0;
//		
//		for(int i = 0; i <=50; i++) {
//			if(i%3!=0) {
//				continue;
//			}
//		}
//		
//		System.out.println("3의 배수의 개수는?: ");
	}
	
}
