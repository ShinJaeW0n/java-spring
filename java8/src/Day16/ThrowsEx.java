package Day16;

public class ThrowsEx {

		public static void calc1()  throws ArithmeticException{
			calc2();
		}
		
		public static void calc2()  throws ArithmeticException{
			int num = 5/0;
			
		}
		
		public static void main(String[] args) {
			System.out.println("메소드에서 던지는 예외 알리기");
		try {
			calc1();
			
				//상위에서 이셉션을 아무렇게나 해도 밑에 catch 옆에 이셉션 구문으로 처리된다.
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()); //<-잘못된 줄 하나만.
			e.printStackTrace(); // <-전체적으로 어디가 잘못됬는지
			
		}finally {
			System.out.println("메소드에서 던지는 예외알리기 프로그램 종료");
		}
		
	}
						//이렇게 하면 예외처리를 안해도된다. try touch를 작성안해도 된다면 밑에 throws를 사용해준다.
		public static void calc3() throws InterruptedException {
			Thread.sleep(1000);
			
		}



}
