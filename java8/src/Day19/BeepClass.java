package Day19;

import java.awt.Toolkit;



public class BeepClass {
		
		public static void main(String[] args) {
			Toolkit tk = Toolkit.getDefaultToolkit();
			System.out.println("현재 쓰레드명: " + Thread.currentThread().getName()); // <-쓰레드 이름.
			
			//얘가 쓰레드1
			Thread t1 = new Thread(new Runnable() { //익명구현객체 러너블
				
				@Override
				public void run() {
					for(int i= 0; i <5; i++) {
				
						tk.beep(); //비프음 5번 실행.
						try {
						Thread.sleep(1000); //1초동안 정지.
						}catch( InterruptedException e ){
							
						}
					
						
					}
					
				}
			});
			
			
			    //쓰레드2 //쓰레드는 만드는 순서대로 번호를 입력받는다.
				t1 = new Thread(() -> { //람다식 러너블
				
				System.out.println("t1 쓰레드명: " + Thread.currentThread().getName());	
				for(int i= 0; i <5; i++) {
					tk.beep(); //비프음 5번 실행.
						try {
						Thread.sleep(1000); //1초동안 정지.
						}catch( InterruptedException e ){

				}

			}

		});
				t1.start(); //쓰레드 실행 메소드. 쓰레드는 반드시 start를 해줘야 실행된다.
				
				for(int i= 0; i <5; i++) {
					System.out.println("경고");
					try {
					Thread.sleep(1000); //1초동안 정지.
					}catch( InterruptedException e ){
						
					}
				}
	}
}
			
	

