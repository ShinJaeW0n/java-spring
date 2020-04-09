package Day20;

public class CalcThread extends Thread{
	
			//쓰레드1
	
		public CalcThread (String name) {
			setName(name); //이름을 결정해주도록 함.
		}


		public void run() {
			for(int i = 0; i<2_000_000_000; i++) {
				//20억번 반복한다.
			}
			System.out.println(getName()); //쓰레드의 이름을 출력하라.
		}
}
