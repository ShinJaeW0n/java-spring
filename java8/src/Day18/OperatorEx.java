package Day18;

import java.util.function.IntBinaryOperator;

public class OperatorEx {
			
				//IntBinaryOperator - 여러가지 숫자를 입력받아 1개로 출력. ex) a + b 입력  c 출력
				//값들을 연산해서 동일한 값으로 출력.
			private static int[]scores = { 92,95,86 };
			
			public static int maxOrMin(IntBinaryOperator operator) {
				int result = scores[0];
				for(int score : scores) { //순서대로 하나하나씩 scores에 들어감.포문이라서.
					result = operator.applyAsInt(result, score);
				}
				return result;
			}
	
			
			public static void main(String[] args) {
				//최대값 얻기
				int max = maxOrMin(
						(a,b) -> {
							if (a >= b) return a; 
							else return b;
						}
						
						
						);
				
				System.out.println("최대값: " + max);
			
			
			//최소값 얻기
			int min = maxOrMin(
					
					(a,b) -> {
						if(a <= b) return a;
						else return b;
					}
					
					);
			System.out.println("최소값: " + min);
			}
					
}			
					
					
	

