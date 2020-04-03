package Day16;

public class Util1 {
					//제네릭타입. Number까지 확장한다. Number까지만 사용한다. Number의 하위는 T
					//extends - 최상위 클래스를 설정.  //t1, t2는 Number의 하위만 사용할 수 있다.
	public static <T extends Number> int compare (T t1, T t2) {
		Double d1; //마우스 올리고 ctrl+t 계층을 보여줌. 계층을 보면 Number보다 아래인지 알 수 있다.
		Integer i1;
		Long l1;
		
		double v1 = t1.doubleValue();
		//System.out.println(t1.getClass().getName());
		
		double v2 = t2.doubleValue();
		//System.out.println(t2.getClass().getName());
			
					//비교출력.
		return Double.compare(v1, v2); //+ - 0 출력.
	}
}
