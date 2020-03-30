package Day12;

public class CalcStaticEx {

	//static을 사용하면 클래스의 객체를 생성하지 않아도 된다.
	public static void main(String[] args) {
		
		CalcStatic sc = new CalcStatic();//굳이 적지 않아도됨.
		
		double result1 = 10*10*CalcStatic.pi;
		int result2 = CalcStatic.plus(10, 5);
		int result3 = CalcStatic.minus(10, 5);
		
		CalcStatic calcs = new CalcStatic();
		
		System.out.println("result1: " + result1 );
		System.out.println("result2: " + result2 );
		System.out.println("result3: " + result3 );
		System.out.println("result4: " + calcs.pi);
		
		System.out.println(CalcStatic.number);
		
		CalcStatic.number = 100;
		
		System.out.println(CalcStatic.number);
		
		System.out.println(sc.number);
		//인스턴스가 아니라 클래스에 귀속되기 때문에 
		//100을 넣어주지 않았는데도 10이 아닌 100으로 출력이 된다.
		
		
		
		
	}
}
