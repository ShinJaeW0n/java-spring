package Day16;

public class ProductEx {

	public static void main(String[] args) {
		Product<TV, String> p1 = new Product<TV, String>();
		p1.setKind(new TV()); //객체라서 출력안되고
		p1.setModel("삼성 파브");
		System.out.println(p1.getModel());
		
					//int는 기본형태라서 사용안됨.
		Product<Car, Integer> p2 = new Product<Car, Integer>();
		p2.setKind(new Car());
		p2.setModel(30); // new Integer(30) 으로 해줘도 되지만 자동으로 박싱되서 30 넣으면됨.
		System.out.println(p2.getModel());
		
		
		
		
	}
}
