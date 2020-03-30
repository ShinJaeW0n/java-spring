package Day12;

public class PersonEx {
	public static void main(String[] args) {
		Person person = new Person();
		
		//이렇게 외부에서 사용할땐 이렇게 객체.필드 로 호출해야함.
		
		
		person.sound();
		person.eat();
		person.run();
		System.out.println();
		person.oneDay();
		
		
	}
}
