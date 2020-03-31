package Day13;

public class StudentEx {

		public static void main(String[] args) {
									//얘는 그냥 생성자로 생성해서 1000이 더해지지 않음.
			Student1 s1 = new Student1("홍길동" , "남성" , 30, 20200001);
			Student1 s2 = new Student1();
			s2.setName("김을동"); //private이기 때문에 setName 사용.
			s2.setGender("여성");
			s2.setAge(40);
			s2.setsNo(20200002);
			s1.showInfo();
			s2.showInfo();
			
		}


}

