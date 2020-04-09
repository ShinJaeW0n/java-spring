package Day20;

			//join 1 (다른 메소드가 종료 될 때까지 기다려 주는거)
			
public class SumThread extends Thread {

		private long sum;

		public long getSum() {
			return sum;
		}

		public void setSum(long sum) {
			this.sum = sum;
		}
		
		public void run() {
			for( int i = 0; i<=1_000_000_000; i++) { //5050 1부터 10억까지 더해주는 구문.
				sum+=i;
			}
		}
		
}
