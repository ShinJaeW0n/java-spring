package Day16;

public class UtilEx {
	
		public static void main(String[] args) {
			Box2<String> box =  Util.<String>boxing("홍길동");
			String name = box.get(); //String이 저장되어 있음.
			System.out.println(name);
			
									//boxing은 integer를 쓰는 박싱이다.
			Box2<Integer> box2 = Util.boxing(100); //메소드 호출 시 제네릭이 유추된다면 생략할 수 있습니다.
			int number = box2.get();
			System.out.println(number);
			
			
			
		}

}
