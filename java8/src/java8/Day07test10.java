package java8;

public class Day07test10 {
	public static void main(String[] args) {
		//1부터 100까지 출력해서 3의 배수마다 ping이 붙도록 해라.
		//5의 배수에는 pong이 붙게해라.
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			
			//3과 5의 공배수에는 pingpong이 붙게하라.
			//이렇게 하면 pingpong 이 안나옴. 왜냐하면 if문은 데이터를 1개만 쓰기때문.
			//그럼 공배수를 제일 먼저 올려줘야한다.
			
			//if (i % 15 == 0 )
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "pingpong");
			}
			
			else if(i % 3 == 0) {
				System.out.println(i + "ping");
			}
			
			else if (i % 5 == 0) {
				System.out.println(i + "pong");
			}
			
			
			
			else {
				System.out.println(i);
			}
			
		}
		
		//이런 방법도 있음. 이렇게 하면 공배수에는 핑퐁이 붙어나옴.
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			
			if ( i % 3 == 0 ) {
				System.out.print("ping");
			}
			
			if ( i % 5 == 0) { 
				System.out.print("pong");
			}
			System.out.println();
		}
		
	}
	
	

}
