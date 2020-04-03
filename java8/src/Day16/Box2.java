package Day16;

	//제네릭
public class Box2<T> { //제네릭은 타입 매개변수. 이 클래스에서 쓸 수있는 타입.
	//T = String , String넣어서 String받았으니 타입변환없음.
	//**지정한 타입만 쓸 수있음.
	
	private T object;
	
	void set(T object) {
		this.object = object;
	}

	T get() {
			return object;
	}
	
	
}
