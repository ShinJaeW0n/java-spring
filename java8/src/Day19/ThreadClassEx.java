package Day19;

public class ThreadClassEx {
	public static void main(String[] args) {
		 Thread t1 = new ThreadClass("쓰레드1");
		 Thread t2 = new ThreadClass("쓰레드2");
		 
		 t1.start();
		 t2.start();
	}
}
