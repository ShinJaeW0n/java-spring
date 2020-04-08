package Day19;

import java.util.function.Consumer;

import Day18.ConsumerEx;
		//리턴값없고 컨슈머는 특정값을 소비한다.
public class CunsumerAndthenEx {
	
		public static void main(String[] args) {
			
			Consumer<Member> consumerA = m -> 
				System.out.println("consumerA: " + m.getName());
			
			
			Consumer<Member> consumerB = m -> 
				System.out.println("consumerB: " + m.getId());
			
				//앞에서 나온 결과물을 뒤쪽에서 사용하는 것. 컨슈머는 결과값이 없기 때문에 입력값을 그대로 넘겨준다.
			Consumer<Member> consumerAB = consumerA.andThen(consumerB);  
				consumerAB.accept(new Member("홍길동", "hong" , null));
			
			
		}
}
