package Day21;


		//쓰레드 실습예제 - 1
	public class ThreadClassEx extends Thread{
		int delay;
	
			public ThreadClassEx(String name, int delay) {
				super(name);
				this.delay = delay;
				}

			@Override
			public void run() {
				
				try {
					
				for(int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName()); //현재 자신의 이름을 가져옴.
					Thread.sleep(delay);
					}
				}
					catch (Exception e) {
				
					System.out.println("error"); 
					return;
				}
				 
				}
					
			
				
			
			
			public static void main(String[] args) {
				ThreadClassEx t1 = new ThreadClassEx("쓰레드1", 300);
				ThreadClassEx t2 = new ThreadClassEx("쓰레드2", 800);
				ThreadClassEx t3 = new ThreadClassEx("쓰레드3", 400); 
				
				//동시에 진행되서 1,2,3 순서가 바뀔 수 도 있다.
				
				t1.start();
				t2.start();
				t3.start();
				
				
			}
			
			
	
}
