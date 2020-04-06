package Day17;

import java.util.Stack;

public class StackEx {

	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		int num;
		try {
			num = stack.peek();
			System.out.println(num);
		}catch(Exception e) {
			System.out.println("데이터가 없습니다.");
		}
		
		stack.push(10);
		stack.push(20);
		num = stack.peek();
		System.out.println(num);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		
		System.out.println("============");
		while(!stack.isEmpty()) {
			num = stack.pop(); //stack이 비지 않았다면 pop 해라.50을 먼저 빼서 출력, 그 다음 40 ~ 10
			System.out.println(num);
		}
		
		System.out.println(stack.isEmpty()); //stack - 마지막 부터 다 빼는 것. 비엇음.
		//peek - 중간에 데이터 확인하는 것.
		//stack -> push로 데이터 넣고 pop으로 뺀다.
		
		
		
		
		
		
	}
}
