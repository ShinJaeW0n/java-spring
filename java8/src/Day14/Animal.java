package Day14;

public class Animal {

		void speak() {
			System.out.println("울음소리를 내다.");
		}
		
		
		void run() {
			System.out.println("뛰어갑니다.");
		}
		
		//dog와 cat 둘다 대입 가능하다.
		void howl(Animal animal) {
			animal.speak();
			
		}

		


}
