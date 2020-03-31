package Day12;

			//객체를 외부에서 생성하지 않고 나 하나만 가지는 것. singleton 스프링에서 보통쓰고 자바에선 안씀.
public class Singleton {
		private static Singleton singgleton = new Singleton();
		
		private Singleton() {
			
		}

		static Singleton getInstance() {
			return singgleton;
		}

}
