package Day16;

public class Product<T, M> {
	
	private T kind;
	private M model;
	
	//source에서 게터 세터 생성.
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

	
	
}
