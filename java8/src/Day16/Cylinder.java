package Day16;

public class Cylinder extends Circle {
	
			int height;
			
			Cylinder (int r , int h){
				super(r);
				this.height = h;
			}
			
			
			double volume(int r) {
				
				double area = area(r);
				
				return area(r)*height;
			}
				
	
			String showCylinder(){
				return showCircle() + ", Height: " + height;
				
			}
			
}


