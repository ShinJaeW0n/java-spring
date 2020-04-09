package Day20;

	//join 2 (다른 메소드가 종료 될 때까지 기다려 주는거)
		public class JoinEx {
			public static void main(String[] args) {
				SumThread t = new SumThread(); //생성자 생성
				t.start();
				
				try {
					Thread.sleep(10); //실행할때마다 결과가 다르다 왜?-sleep으로 100분의 1초 쉴때 중간까지 계산한 값을 가져오는 것이다.
					t.join(); //t가 완전히 종료(terminated)된 후에야 실행할 수 있다. //그러면 최종 합산값을 알 수 있다.
				} catch (InterruptedException e) {}
				
				System.out.println(t.getSum()); //썸에 저장된 값이 나오게 된다.
				
				
				
			}
			
			
		}	
