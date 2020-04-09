package Day20;

	//notify -잠들어있는것을 깨워주는것. ( 쓰레드 간의 협업) -1

public class DataBox {
		
	/*   ***synchronized 에서만 wait 할 수 있다 */
		private String data;
		
		public synchronized String getData() {
			if(this.data == null) { // data 필드가 null이면 소비자 스레드를 일시정지 상태로 만듦.
				try { wait(); } catch (InterruptedException e) {}
			}
			
			//데이터가 null이 아니라면
			String returnValue = data; //null이 아니라면 리턴벨류 대입한후
			System.out.println("ConsumerThread가 읽은 데이터: " + returnValue);
			data = null; //데이터 필드를 null로 만들고 생산자 스레드를 실행 대기 상태로 만듦.
			notify(); //다른 쪽이 실행할 수 있도록 다른 스레드를 깨워줌.
			return returnValue;
			
			}
		
		public synchronized void setData (String data){
			if(this.data != null) { //data 필드가 null이 아니면 생산자 스레드를 일시정지 상태로 만듦. 
				try { wait();}catch(InterruptedException e) {};
					
			}
			this.data = data; //data 필트에 값을 저장하고 소비자 스레드를 실행대기 상태로 만듦.
			System.out.println("ProducerThread가 생성한 데이터: " + data);
			notify();
		
		}
			
		}
	

