package Day16;

public class MemberThinEx {

			/*깊은 복사*/ //각각의 저장소가 달라지는 것.
			public static void main(String[] args) {
				//원본객체생성
				MemberThin original = new MemberThin("블루", "홍길동", "12345", 25 , true);
				
				//깊은복사 ,복제 개체를 얻은 후에 패스워드 변경 , 레퍼런스 참조형일때는 깊은 복제를 해야 문제가 안생김.
				MemberThin cloned = original.getMember(); //객체를 새로 생성해서 리턴. 오리지널을 클론해서 리턴.
				
				//얕은 복사
		//		MemberThin cloned = original; //이렇게 하면 해시코드가 같게 나옴.
				//복제한 곳의 비밀번호 변경이 원본 비밀번호까지 변경해버린다. 인트 , 롱형 같은 기본형은 얕은 복제 ㄱㅊ
				
				cloned.password = "67890"; //복제 객체에서 패스워드 변경
				
				System.out.println(original.hashCode());
				System.out.println(cloned.hashCode());
				//2개의 해시코드가 다른 것을 알 수 있다.
				
				
				
				System.out.println("[복제 개체의 필드값]");
				System.out.println("id" + cloned.id);
				System.out.println("name" + cloned.name);
				System.out.println("password" + cloned.password);
				System.out.println("age" + cloned.age);
				System.out.println("adult " + cloned.adult);
				System.out.println();
				System.out.println("[원본 개체의 필드값]");
				System.out.println("id" + original.id);
				System.out.println("name" + original.name);
				System.out.println("password" + original.password);
				System.out.println("age" + original.age);
				System.out.println("adult " + original.adult);
				
			}
	
}
