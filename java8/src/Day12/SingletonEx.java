package Day12;

public class SingletonEx {

			public static void main(String[] args) {
								//private이기 때문에 외부에서 생성 안된다.
				Singleton s1;
			//	s1 = new Singleton(); //생성자 호출은 불가능합니다.
				s1 = Singleton.getInstance(); //기존에 생성된 개체를 호출합니다.
				
				Singleton s2 = Singleton.getInstance();
				
					//객체에서 ==은 주소비교.
				if(s1 == s2) {
					System.out.println("동일객체");
				}else {
					System.out.println("다른객체");
				}
				
				//m1과 m2는 주소가 다르기 때문에 다른객체가 나온다.
				//m2를 새로 만들었기 때문에.
				Member m1 = new Member("홍길동", "hong");
				Member m2 = new Member("홍길동", "hong");
				
				if(m1 == m2) {
					System.out.println("동일객체");
				}else {
					System.out.println("다른객체");
				}
				
			}
}
