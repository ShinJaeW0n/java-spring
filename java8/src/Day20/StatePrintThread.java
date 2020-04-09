package Day20;


public class StatePrintThread extends Thread {

		private Thread targetThread;
		
		public StatePrintThread (Thread targetThread) {
			this.targetThread = targetThread;
		}


		public void run() {
			while(true) { //스레드 상태를 0.5초에 한번씩 출력
				Thread.State state = targetThread.getState(); //타겟쓰레드의 현재상태 출력.
				System.out.println("타겟 스레드 상태: " + state);
				if(state == Thread.State.NEW) { //스테이트가 새로만든 상태라면 타켓쓰레드를 실행해라.
						targetThread.start();
				}
				if(state == Thread.State.TERMINATED) { //스테이트가 종료되었다면
						break;
				}
				try {
					Thread.sleep(500); //0.5초간 일시정지
				}catch(Exception e) {}
			}
		}
}

