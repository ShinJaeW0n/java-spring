package java8;

public class Say07test04 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum += i;
			} 
			
			
			//이렇게 continue 문도 사용할 수 있다.
//			for (int i = 1; i <= 10; i++) {
//				if(i % 2 == 0) {
//					continue;
//				} 
//			
//				sum += i;
//			}
				
			
		}
		
		//for문 밖으로 프린프문을 빼야함. for문 안에서 프린트 하면 계속 반복됨.
		System.out.print("1부터 10까지 중 짝수의 합계: " + sum);
	
	}

}
