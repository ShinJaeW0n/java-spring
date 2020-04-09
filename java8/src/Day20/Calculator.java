package Day20;

	//쓰레드 동기화1 // 멀티 쓰레드가 같은 객체를 공유할때 생기는 문제.
	//같은 객체를 공유한 쓰레드 1, 2. // 1이 지정한 값을 2가 들어오면서 변경한 값으로 바뀌어버린다.
public class Calculator {
		
		private int memory;
		
		public int getMemory() {
			return memory;
		}
				//synchronized 동기화. 해놓으면 1값이 나온 후 2값 출력됨. 유저1이 끝날때까지 메모리필드를 잠궈놓는다.
		public synchronized void setMemory(int memory) {
//			synchronized (this) { 블럭 동기화
				
			
			this.memory = memory;
			try {
				Thread.sleep(2000); //2초동안 정지.
			}
			catch(InterruptedException e) {}
//			}	
			//2초동안 정지했다가 이것을 출력해라.
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		
		}
}
		
		
	

