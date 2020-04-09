package Day20;

		//쓰레드가 어떻게 돌아가나2
public class TargetThread extends Thread {
	public void run() {
		String sum = "";
		for(int i = 0; i < 30000; i++) {
			sum +=i;
		}
		try {
			//1.5초간 일시 정지
			Thread.sleep(1500);
		} catch (Exception e) {
			
		}
		sum = "";
		for(long i = 0; i < 30000; i++) {
			sum +=i;
		}
	}
	
		public static void main(String[] args) {
			StatePrintThread spt = new StatePrintThread(new TargetThread()); //타겟쓰레드를 새로 만들어서 스테이트프린트에 대입
			spt.start();
		}
	
}
