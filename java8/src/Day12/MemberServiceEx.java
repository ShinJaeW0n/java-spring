package Day12;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberService me = new MemberService();
		Member hong = new Member("홍길동" , "Hong");
		hong.password = "12345";
		hong.age = 30;
		
		if(me.login(hong.Id, hong.password)) {
			System.out.println("로그인 하였습니다.");
			me.logout(hong.Id);
		}else {
			System.out.println("정보를 잘 못 입력하셨습니다.");
		}
		
		
		//홍 일 경우만 로그인 되게 해놓아서 얘는 정보를 잘 못 입력했다고 뜸.
		Member lee = new Member("이연희" , "Lee");
		hong.password = "12345";
		hong.age = 20;
		
		if(me.login(lee.Id, lee.password)) {
			System.out.println("로그인 하였습니다.");
			me.logout(lee.Id);
		}else {
			System.out.println("정보를 잘 못 입력하셨습니다.");
		}
		
	}
}
