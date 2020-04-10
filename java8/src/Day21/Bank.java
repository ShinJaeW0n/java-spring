package Day21;

			//쓰레드 실습예제 - 2 // 클래스를 생성할때 찐 클래스 이름은 퍼블릭이어야한다.
		class Bank {
		
		private int bk =  1_000_000;
		
		int amt = 9800;
		
		//이 메소드가 끝날때까진 다른 메소드 접근 못함
		synchronized void withDraw (int amt) {
			if(bk - amt < 0) {
				Thread.currentThread().interrupt();
			}else {
				bk -=amt;
				System.out.println(amt + "원을" + Thread.currentThread().getName() + "가 인출, 남은 잔액 : " + getamt());
				
			}
			
		}
			//남은 총액
		int getamt() {
			return bk;
		}
	
	}

		
	class Customer extends Thread{
		private Bank acc1;
		
		public Customer(Bank acc) {
		this.acc1 = acc;		
			
			}
		@Override
		public void run() {
			
			while(true) {
					acc1.withDraw(9800);
					
					if(interrupted()) { //interrupted - 쓰레드가 인터럽트 되어있는지 확인할때 씀.
						break;
						
					}
				}
		
		}
	}

	
		