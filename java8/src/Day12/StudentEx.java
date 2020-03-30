package Day12;

public class StudentEx {
		Student student = new Student(); // <- 뒤쪽에 ()가 있는 것을 생성자라고 한다.
			//main과 같은 실행용 클래스는 1개만 있어야한다.
			//라이브러리 클래스는 필요한 만큼 생성해서 사용할 수 있다. StudentEx = 실행용.
		
		
				//변수 이름은 본인 자유. 클래스 첫 글자는 대문자!!!
		Student s1 = new Student();
		Person person = new Person();//person은 만든 적이 없어서 생성이 안된다. 
		//person 변수를 생성하려면 설계도면인 person 클래스를 새로 만들어야 작동을 한다.
}
