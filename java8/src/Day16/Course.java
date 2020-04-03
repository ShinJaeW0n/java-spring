package Day16;

public class Course<T> {
			private String name;
			private T[] students;
			
			public Course(String name, int capacity) {
				this.name = name;
				students = (T[])(new Object[capacity]); //object 타입으로 배열을 만들어서 t타입으로 캐스팅(형변환) 해주겠다.
				
			} //타입 파라미터로 배열을 생성하려면 new T[n] 형태로 배열을 생성할 수 없고
			//(T[])(new object[n])으로 생성해야 한다.
			

			public String getName() { return name;}
			public T[] getStudents() { return students; }
			
			public void add(T t) { //배열에 비어있는 부분을 찾아서 수강생을 추가하는 메소드
				for(int i = 0; i < students.length; i++) {
					if(students[i] == null) { //i번째가 null이라면 
						students[i] = t;	//i번째에 t를 저장해줄거다.
						break;
					}
				}
				
			}
			
}
