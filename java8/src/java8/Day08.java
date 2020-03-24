package java8;

public class Day08 {
	
	public static void main(String[] args) {
		/*1부터 100까지 출력*/
		
		
		
		for(int i =1; i <=100; i++) {
			System.out.println(i);
			
			}
		
		//1부터 100중에 3과 5의 공배수의 합은?
		int sum = 0;
		for(int i =1; i <=100; i++) {
			if(i%3==0 && i%5==0) {
				sum+=i; }
			}
		
		System.out.println("3과 5의 공배수의합: "+ sum); //포문이 끝나고 난 후
	
	
		//1부터 100중에 짝수는 더하고 홀수는 뺀 결과를 출력하세요.
		//내가 한것.
//		int sum1 = 0;
//		int sum2 = 0;
//		for(int i = 0; i<=100; i++) {
//			if(i%2==0) {
//				sum1+=i;
//				
//			}else if (i%2 !=0)
//				{sum2-=i;
//				
//		}
//		
//	}	
//
//	System.out.println("짝수를 더한값:"+sum1);
//	System.out.println("홀수를 뺀 값:"+sum2);

		//쌤이 한 것.
	int sum1 = 0;
	int sum2 = 0;
	for(int i = 0; i<=100; i++) {
		if( i%2==0) {
			sum1+=i;
		}else {
			sum2+=i;
		}
	}
	
	System.out.println("짝수는 더하고 홀수는 뺀 결과" + (sum1 - sum2));
	
	sum=0;
	
	for(int i = 1; i<=100; i++) {
		if( i%2==0) {
			sum +=i;
		}else {
			sum -=i;
		}
	
	
	}System.out.println(sum); //포문 바깥으로 빼주기.

	
	
	}
}
