package java8;

public class Day0604 {

	public static void main(String[] args) {
		
		
		//for문 변수들이 같으면 *이 5개만 출력이 된다. 그래서 중첩했을 경우는 변수를 다른 것을 사용해줘야한다.
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		//이미 위에서 닫힌 for문은 간섭하지 않기에 같은 변수를 사용해도 상관없다.
		//중첩했을땐 다른 변수를 사용해야하지만 동위선상에 있을땐 같은 변수를 사용해도된다.
		for(int i = 0; i < 3; i++) {
			System.out.println("안녕하세요");
		}
		
	}
}
