package Day13;

public class Student1 { //DAO, java bean
		
		private String name;		//이름
		private String gender;		//성별
		private int age;			//나이
		private int sNo;			//학번
		
		
		public Student1(String name, String gender, int age, int sNo) {
			
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.sNo = sNo;
		}
		
		//기본생성자 하나 만들어주기.
		public Student1() {
			
		}

		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getsNo() {
			return sNo;
		}
		
		
		public void setsNo(int sNo) {
			if(gender.equals("여성")) {
				sNo +=2000;
			}else {
				sNo +=1000; //홍길동은 그냥 생성자이고 set이 안붙어서 해당x
			}
			this.sNo = sNo;
		}
		
		public void showInfo() {
			System.out.println("성명: " + name );
			System.out.println("성별: " + gender );
			System.out.println("나이: " + age );
			System.out.println("학번: " + sNo );
		}
		
		
		
		
}
