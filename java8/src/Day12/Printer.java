package Day12;

public class Printer {

		// 매개변수를 다르게 해서 중복 정의 할 수 있는지
		// Printer 객체를 만들지 않고 하려면 앞에 static을 붙이면 됨. 
		
		void Println(int arg){
			System.out.println(arg);
		}
		
		void Println(boolean arg){
			System.out.println(arg);
		}
		
		void Println(double arg){
			System.out.println(arg);
		}
		
		void Println(String arg){
			System.out.println(arg);
		}
		
		
}
