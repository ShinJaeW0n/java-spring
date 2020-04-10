package Day21;

		//쓰레드 실습예제 - 2 실행문, Bank 클래스 하나에 할려면 맨 위에 적어줘야함.
public class Contribution {
	public static void main(String[] args) {
		Bank acc = new Bank();
		
		Customer cust[] = new Customer[4];
		//생성자 호출 , 1개의 계좌를 4개가 같이 쓰고 있음.
		for(int i = 0; i < 4; i++) {
			cust[i] = new Customer(acc);
			cust[i].start();
		}
		
		for(int i = 0; i < 4; i++) {
			try {
				cust[i].join(); //4개의 스레드가 끝나고 나면
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		System.out.println("총액은: " + acc.getamt());
	
		//실행할때마가 몇 번 쓰레드가 인출했는지는 결과가 바뀐다.
		
	}
	
	
}
