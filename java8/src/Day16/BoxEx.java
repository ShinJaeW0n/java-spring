package Day16;


public class BoxEx {

	public static void main(String[] args) {
		
		String name = "홍길동";
		
		//생성자
		Box bx = new Box();
		bx.set(name); //String이 (부모)object로 자동 형변환.
		
		String name2 = (String)bx.get(); //얘를 다시 받으면 스트링으로 못간다.
		//Object -> String 강제 형변환
		
		System.out.println(name2);
		
		
		Apple apple = new Apple();
		System.out.println(apple.hashcode);
		bx.set(apple); // apple에서 object로 자동 형변환
		Apple apple2 = (Apple)bx.get();	//object -> Apple 강제형변환
		System.out.println(apple2.hashcode);
		
	
							//1.8버전부터 뒤 <>안에 생략가능. 앞<>를 비워도 됨.
		Box2<String> box = new Box2<>();
		box.set(name);
		name2 = box.get();
		System.out.println(name2);
		
//		box.set(apple); // <- box는 제네릭으로 String만 사용하도록 설정하였습니다.
		
		Box2<Apple> box3 = new box2<>();
		box3.set(apple);
		apple2 = box3.get();
//		box3.set(name); // <- 불가능. box3는 apple만 사용가능합니다. String은 사용불가능합니다.
		
		
		
	}
}
