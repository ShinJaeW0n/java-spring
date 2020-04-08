package Day19;

public class StackEx {
	public static void main(String[] args) {
		Stack<String> ss = new Stack<String>(); //String타입의 Stack생성
		ss.push("Apple");
		ss.push("Banana");
		ss.push("Orange");
		
		System.out.println(ss.pop());
		System.out.println(ss.pop());
		System.out.println(ss.pop());
		
		Stack<Integer> is = new Stack<Integer>(); //Integer 타입의 Stack생성
		is.push(3);
		is.push(7);
		is.push(9);
		System.out.println(is.pop());
		System.out.println(is.pop());
		System.out.println(is.pop());
		
	}
}

		public class Stack<T>{
			int position;
			Object[] stck;
			public Stack() {
				position = 0;
				stck = new Object[20];
			}
			//스택에 요소저장
			public void push(T item) {
				if (position == 20)
					return;
				stck[position] = item;
				position++;
			}
			
			//스택에 요소 꺼내옴
			public T pop() {
				if(position == 0)
					return null;
				position--;
				return (T)stck[position];
			}
		}

