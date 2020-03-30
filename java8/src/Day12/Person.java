package Day12;

public class Person {
	
	//얘네가 메소드.
	void sound() {
		System.out.println("말하다.");
	}

	void run() {
		System.out.println("달리다.");
	}
	
	void eat() {
		System.out.println("음식을 먹다.");
	}

	void oneDay() {
		//이렇게 복잡하게 적을 필요없다.
//		Person person = new Person();
//		person.sound();
	
		//나 자신의 것을 사용하니 객체를 만들 필요 x
		//내부 메소드 안에선 이렇게 바로 호출가능.
		this.sound();
		eat(); //앞에this가 생략되어있음.
		run();
	}

}