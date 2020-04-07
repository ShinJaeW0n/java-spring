package Day18;

public class UsingEx {
		public static void main(String[] args) {
			MyFuncEx using = new MyFuncEx();
			MyFuncEx.Inner inner = using.new Inner(); //생성자 사용.
			inner.method();
			
			
		}

}
