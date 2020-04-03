package Day16;

public class BoundTypeParameterEx {

	public static void main(String[] args) {
		
		//String str;//Object의 하위다.
		//String srt = Util1.compare("a", "b"); <- String은 Number의 하위가 아니다. 그래서 String은 쓸 수 없다.
		
								//compare -> //앞에꺼가 작으면 -1 리턴
		int result1 = Util1.<Integer>compare(10,20); //t1과 t2가 int 이므로 Integer로 유추가 가능하다. integer 생략가능.
		System.out.println(result1);
									//앞에꺼가 크면 1 리턴
		int result2 = Util1.<Number>compare(4.5, 3); //t1은 double, t2는 int이니 2개 모두 수용할 수 있는 Number가 들어간다.
		System.out.println(result2);
								//int, int가 사용되어서 <Integer>가 사용될거다.				
		int result3 = Util1.compare(100, 100);//같은 경우일 경우 0 리턴.
		System.out.println(result3);
	
	}
	
}
