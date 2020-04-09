package Day20;

		//다른 스레드에게 실행양보 yield - 1
public class ThreadA extends Thread {

		public boolean stop = false;
		public boolean work = true;
		
		public void run() {
			while(!stop) {
				if(work) {
					System.out.println("ThreadA 작업 내용");
				} else {
					Thread.yield(); //자기자신 쓰레드A가 양보하게된다.
				}
			}System.out.println("ThreadA 종료");
		}
}
