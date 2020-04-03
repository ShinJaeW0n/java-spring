package Day16;

public class MemberThin implements Cloneable { //복제하려면 Cloneable 인터페이스를 구현해야한다.

	//객체의 얕은 복사, 깊은 복사
		
		public String id;
		public String name;
		public String password;
		public int age;
		public boolean adult;
		
		public MemberThin (String id, String name, String password, int age, boolean adult) {
			this.id = id;
			this.name = name;
			this.password = password;
			this.age = age;
			this.adult = adult;
		}
		
		//자기 자신을 리턴한다.
		public MemberThin getMember() {
							//변수 생성
				MemberThin cloned = null;
				try {
					//자기 자신을 복사해서 멤버씬 형태로 형변환해준다. 안해주면 오브젝트형으로 되서.
					cloned = (MemberThin) clone(); //clone() 메소드의 리턴타입은 Object라서 캐스팅함.
				}
				catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
				return cloned; //그대로 복제한 것을 리턴.
		}
	
	
}
