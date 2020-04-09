package Day20;

		
		//다른 스레드에게 실행양보 yield - 3
public class YieldEx {
		public static void main(String[] args) {
			ThreadA threadA = new ThreadA();
			ThreadB threadB = new ThreadB();
			
			threadA.start();
			threadB.start();
			
			try {Thread.sleep(3000);} catch (InterruptedException e) {} 
			threadA.work = false; //a는 양보하게 되고 b는 계속 돌아감.
			
			try {Thread.sleep(3000);} catch (InterruptedException e) {}
			threadA.work = true; //a다시 돌아감.
			
			try {Thread.sleep(3000);} catch (InterruptedException e) {}
			threadA.work = true; //2개 다 정지.
			threadB.work = true;
			
			
			
		}

}
