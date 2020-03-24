package java8;

public class Day0309 {
	public static void main(String[] args) {
		int daegu = 2_000_000; // 긴 숫자를 구분해주기 위해서 _적은것. 자바에서는 _를 아무것도 아니라고 인식한다.
		int global = 100_0000;
		
		String str = ((daegu >= global)? "대구광역시" : "대구시"); // <- 삼항연산자
		//대구광역시가 문자열이기 때문에 string을 적어도된다.
			
		System.out.println(str);
		
		//System.out.println(daegu >= global?"대구광역시":"대구시"); //질문? 참:거짓
		
		
		
		
	}
}
