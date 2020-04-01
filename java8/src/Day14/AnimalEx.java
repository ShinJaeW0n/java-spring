package Day14;
	//다형성
public class AnimalEx {
			
			public static void main(String[] args) {
		
			Animal a1 = new Animal();
			
			a1.speak();
			a1.run();
			
			//어떤 객체를 대입했느냐에 따라서 출력값이 달라진다. 이를 다형성이라고 한다.
			a1 = new Dog();
			a1.speak();
			a1.run();
				
			a1 = new Cat();
			a1.speak();
			a1.run();
			
			System.out.println();
			
			Animal a2 = new Animal();
			
			Cat cat = new Cat();
			Dog dog = new Dog();
			
			//Animal에서 animal을 매개변수로 넣었기 때문에
			//Animal을 상속중인 자식 dog cat 둘다 넣을 수 있다. 
			a2.howl(cat);
			a2.howl(dog);
				
	}

}
