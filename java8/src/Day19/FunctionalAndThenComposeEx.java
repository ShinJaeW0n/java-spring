package Day19;

import java.util.function.Function;

/* *** 다시 찾아보기. */

public class FunctionalAndThenComposeEx {
	
		public static void main(String[] args) {
			Function<Member, Address> functionA;
			Function<Address, String> functionB;
			Function<Member, String> functionAB;
			String city;
			
			functionA = m -> m.getAddress(); //멤버출력받아서 어드레스 출력.
			functionB = a -> a.getCity(); //어드레스 받아서 스트링 출력.
			
					//펑션에이를 실행한 결과를 펑션비로 넘겨서 그 결과를 에이비로 리턴.
					//앞의 결과물을 뒤쪽으로 넘겨줄때.
			functionAB = functionA.andThen(functionB);					//어드레스 객체 생성.
			city = functionAB.apply(new Member("홍길동", "hong" , new Address("한국" , "서울")));
			System.out.println("거주 도시: " + city);
						
								//매개변수가 한 개일때만 사용할 수 있다.
			functionAB = functionB.compose(functionA);//뒤에거를 앞으로 넘겨줌.
			city = functionAB.apply(new Member("홍길동", "hong" , new Address("한국" , "서울")));
			System.out.println("거주 도시: " + city);
			
		}
}
