package Day20;


//쓰레드 실습문제 -2
public class Account {
	private int tot = 0;
	synchronized void deposit(int amt) {
		tot += amt;
	}
	public int getTot() {
		return tot;
	}

	class Customer extends Thread {
		Account accl;
		Customer(Account acc){
			this.accl =acc;
		}
		@Override
		public void run() {
			
			try {
				for(int i =0; i<300; i++) {
					System.out.println("쓰레드" + getName() + " : " + i + "번째");
					accl.deposit(1000);
					sleep(50);
					if(accl.getTot() >= 1000000) 
						break;
				}
			} catch (Exception e) {
					System.out.println(e);
			}
			
		}
		
		
	}
			public class ContributionCount{
				public static void main(String[] args) {
					Account acc = new Account();
					Customer cust[] = new Customer[10];
					for(int i = 0; i<10; i++) {
						cust[i] = new Costomer(acc);
						cust[i].start();
					}
					
					for(int i =0; i<10; i++) {
						try {
							cust[i].join();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					System.out.println("총액은: " + acc.getTot());
				}
			}
	
	
}
