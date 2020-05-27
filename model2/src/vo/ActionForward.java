package vo;

public class ActionForward {
	//얘네를 가지고 페이지 이동을 만들어줄 것이다.
	
	private String path;
	private boolean redirect;
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isRedirect() {
		return redirect;
	}

	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
}
