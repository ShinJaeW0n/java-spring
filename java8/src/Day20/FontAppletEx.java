package Day20;

import javax.swing.JFrame;

				//애플릿 예제 -2 실행
public class FontAppletEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("폰트 설정 예제"); //Frame = 틀.
		FontApplet p = new FontApplet();
		p.init();; //초기화하기 위해서.
	
		f.setSize(600, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <- 오른쪽 창 x표시.
		f.add(p);
		f.setResizable(false); //사이즈를 변경할 수 없다.
		f.setVisible(true); //트루를 해야 실행된다.
	}
	
}
