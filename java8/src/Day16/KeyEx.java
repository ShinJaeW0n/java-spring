package Day16;

public class KeyEx {

			public static void main(String[] args) {
				Key k1 = new Key(1);
				Key k2 = new Key(1);
				
				System.out.println(k1 == k2);
				System.out.println(k1.equals(k2)); //equals를 재정의 하면 원래의 주소비교가 아니라 원하는 값의 비교로 만들어 줄 수 있다.
				//equals는 객체와 객체를 비교할 땐 주소비교인데 재정의하면 값이나 필드로 비교할 수 있다.
				
				
				//주소가 다르니 해시코드가 다르게 나온다.
				System.out.println(k1.hashCode()); //해시코드도 재정의해서 사용할 수 있다.
				System.out.println(k2.hashCode());
				System.out.println(k1); //출력할때는 문자열로 변환해야하기 때문에 자동으로 toString으로 된다.
				//toString을 재정의하면 원하는 대로 출력가능하다.
				
			}
				
	
}
