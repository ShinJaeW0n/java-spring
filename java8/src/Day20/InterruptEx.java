package Day20;

//interrupt -2
public class InterruptEx {
	
		public static void main(String[] args) {
			Thread thread = new PrintThread2();
			thread.start();
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {}
			
			thread.interrupt(); //타겟 쓰레드를 인터럽트. 대문자 쓰면 자기자신을 인터럽트하게 되서.
		} 	

}
