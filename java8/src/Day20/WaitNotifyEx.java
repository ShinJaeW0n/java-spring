package Day20;

//notify -잠들어있는것을 깨워주는것. 4 실행구문.
public class WaitNotifyEx {
			
		public static void main(String[] args) {
			DataBox dataBox = new DataBox();
			
			ProducerThread produceThread = new ProducerThread(dataBox);
			ConsumerThread consumerThread = new ConsumerThread(dataBox);
			
			produceThread.start();
			consumerThread.start();
		}
			
	
}
