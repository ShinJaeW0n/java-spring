package Day20;


		//쓰레드 동기화2
public class User1 extends Thread{

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}

	public void run() {
		calculator.setMemory(100);
	}
}
