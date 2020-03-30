package Day12;

public class CalculatorEx {
		public static void main(String[] args) {
			Calcuator calc = new Calcuator();
			calc.powerOn();
			int res1 = calc.plus(10, 20);
			System.out.println(res1);
			
			byte num1 = 10; //byte는 int로 자동형변환됨.
			byte num2 = 3;
			double res2 = calc.divide(num1, num2);
			System.out.println(res2);
			
			//메서드도 중복 정의 가능. 자료 형태나 개수가 달라야함.
			long num3 = 100; //long은 int로 강제형변환을 해야함. 자동으로 int로 바뀌지 않음.
			long num4 = 30;
			double res3 = calc.plus(num3, num4);
			System.out.println(res3);
			
			
			calc.powerOff();
			
			
		}

}
