package Day19;


import java.util.function.IntBinaryOperator;
			//람다식 메소드 참조.
public class MethodReferenceEx {

		public static void main(String[] args) {
			IntBinaryOperator operator;
			
			operator = new IntBinaryOperator() { //익명구현객체
				
				@Override //재정의 //익명구현객체
				public int applyAsInt(int left, int right) {
					
					return Calculator.staticMethod(left, right);
				}
			};
			
			int result = operator.applyAsInt(10, 20);
			System.out.println(result);
			
			
			
			
			//람다식
			operator = (int left, int right) -> {
				return Calculator.staticMethod(left, right);
			};
			
			
			//한줄이면 중괄호와 리턴 생략/
			operator = ( x,  y) ->  Calculator.staticMethod(x, y);
			result = operator.applyAsInt(10, 20);
			System.out.println(result);
			
			
			//이렇게 생략가능. 이것이 메소드 참조. 
			operator = Calculator::staticMethod; //정적 메소드 참조
			result = operator.applyAsInt(10, 20); //정적메소드일 경우에는 클래스명으로 호출.
			System.out.println(result);
			
			
			//인스턴스 메소드 참조
			//객체 생성.
			Calculator calc = new Calculator();
			
			operator = calc::instanceMethod;
//			operator = Calculator::instanceMethod; //인스턴스 메소드는 클래스명으로 호출 불가능,객체를 생성해서 참조해야함.
			result = operator.applyAsInt(10, 20);
			System.out.println(result);
			
			
		}
		
}
