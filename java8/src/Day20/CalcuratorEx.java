package Day20;

		//쓰레드 동기화 4
	
public class CalcuratorEx {
		public static void main(String[] args) {
			Calculator calc = new Calculator();
			User1 user1 = new User1();
			User2 user2 = new User2();
			
			user1.setCalculator(calc);
			user2.setCalculator(calc);
			
			user1.start(); //유저1이 100을 저장하고 2초 쉬는 중간에 유저2 50이 들어와버림. 그러자 유저1이 깨어나서
			user2.start(); //유저1 값이 50이 되어버림.
			
		}
}

//[출력]
//User2: 50
//User1: 50