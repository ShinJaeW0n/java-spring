package java8;
//실수에 대하여
public class Day0210 {
	public static void main(String[] args) {
		double apple = 1.0;
		double unit = 0.1;
		System.out.println("사과 1개를 10조각으로 나눠서");
		System.out.println("7조각을 먹었습니다.");
		System.out.println("남은 조각은 몇 조각일까요?");
		double result = apple - unit * 7; //사칙연산에 따라 * 부터 함.
				
		System.out.println(result); 
		//실수는 정확한 연산이 되지 않는다. 부동소수점으로 계산하기 때문입니다.
		//그래서 연산을 할때는 정수연산을 하고 마지막에 실수로 표현해야 합니다.
		
		//실수는 계산이 제대로 안됩니다. 
		double result2 = 1000000000000000000000000000000000.0 + 1.0;
		System.out.println(result2);
		
		
		//정수로 바꿔서 다시 계산해봅시다
		int apple2 = 1;
		double unit2 = 1;
		double result3 = (apple2 * 10 - unit2 * 7) / 10;
		System.out.println("사과 10조각에서 3조각을 뺀 후 10으로 나누면?");
		System.out.println(result3);./,
		
		
	}

}
