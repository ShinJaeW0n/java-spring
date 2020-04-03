package Day16;

public class Circle {
			//원의 넓이 출력		
	
		static final double PI = 3.14;	//상수 선언
		int r;
		
		public Circle(int r) {
			this.r = r;
		}
		
			double area(int r){
				this.r = r;
				return PI*r*r; 
				
			}
	
	
			String showCircle(){
				return "Radious : " + area(r);
				
			}
}
