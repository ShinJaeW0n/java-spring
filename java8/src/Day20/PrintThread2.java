package Day20;

		//interrupt -1

public class PrintThread2 extends Thread{
		public void run() {
			
			//how1
			/*try {
				while(true) {
					System.out.println("���� ��");
					Thread.sleep(1);
				}
			}catch (InterruptedException e) {
			}*/
			
			//how2
			while(true) {
				System.out.println("���� ��");
				if(Thread.interrupted()) {
					break;
				}
			}
			
			System.out.println("�ڿ� ����");
			System.out.println("���� ����");
		}
			
}