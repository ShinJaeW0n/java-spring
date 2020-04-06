package Day17;

public class FinalizeEx {

			public static void main(String[] args) {
				Counter counter = null;
				for(int i=1; i<=50; i++) {
					counter = new Counter(i);
					counter = null; //counter 객체를 쓰레기로 만듦
					System.gc(); //쓰레기 수집기 실행 요청
				}//순서가 랜덤으로 실행되고 50개 전체가 아닌 일부만 실행함.
	}
}
