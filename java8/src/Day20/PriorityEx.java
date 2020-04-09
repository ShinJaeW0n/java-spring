package Day20;


			//쓰레드2
public class PriorityEx {

		public static void main(String[] args) {
			
			for(int i = 0; i<=10; i++) {
				Thread thread  = new CalcThread("thread" + i);
				if(i != 10) { //포문을 이용했기에 10개가 동시에 실행됨.
					thread.setPriority(Thread.MIN_PRIORITY);
				}else {
					thread.setPriority(Thread.MAX_PRIORITY);
				}
				thread.start();
			
				//우선 순위가 가장 높기에 10이 제일 빨리 끝날거고
				//밑에 애들이 무작위인 이유 : 동일한 우선순위이기 때문에 컴퓨터가 알아서 실행하는 순번을 지정하기 때문에, 랜덤하게 뽑음.
				//실행할때마다 먼저 끝나는게 달라진다.
			}
			
		}
}
