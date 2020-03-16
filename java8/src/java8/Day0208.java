package java8;

public class Day0208 {
	public static void main(String[] args) {
	
		int dice = 0;  // int dice; 라고 해도됨. 선언과 동시에 초기화를 하면 차후에
		//오류를 줄일 수 있습니다. 그래서 0으로 해주는겁니다.
		
		
		//dice = Math.random(); -메서드임~!
				//Math.radon 메서드는 0보다 크거나 같고 1보다 작은 실수를 생성. 0.99XX까지
				//실수 중에서도 double을 생성한다. dice가 정수이기 때문에 큰것은 작은거에 넣을 수 없다.
				//양쪽이 같아야 대입이 되기 때문인데, 오른쪽이 더 크므로 강제 형변환 해줘야한다.]
				//정수<실수
		
		//dice = (int) Math.random() * 6; -메서드임~!
		//정수로 형변환을 하게 되서 소수점을 버리기 때문에 0밖에 안나온다. 즉 아무리 6곱해도 0나옴.
				//강제형변환한 상태. 형변환은 사칙연산보다 우선한다.
		
		
		dice = (int) (Math.random() * 6) + 1; 
		//이렇게 바꿔줘야함.
		//dice 0~5 -> 1~6 바꿔줄려면 1을 더해줘야한다.
		
		
		
		
		System.out.println(dice);

		
		
	
		
		
}
}
