package Day20;

//notify -잠들어있는것을 깨워주는것. 3
public class ProducerThread extends Thread {

		private DataBox dataBox;
		
		public ProducerThread (DataBox dataBox) {
			this.dataBox = dataBox;
		}

		@Override
		public void run() {
			
			for(int i = 0; i <= 3; i++) {
				String data = "Data- " + i;
				dataBox.getData(); //여기 구문 잘 못 적음 인터넷 찾아보기.
			}
		}

	}

