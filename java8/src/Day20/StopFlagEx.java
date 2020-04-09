package Day20;
//stop -2
public class StopFlagEx {

			public static void main(String[] args) {
				PrintThread1 printThread1 = new PrintThread1();
				printThread.start();
				
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {}
				
			}
			
				PrintThread.setStop(true);
}
