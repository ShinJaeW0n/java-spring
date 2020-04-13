package Day22;

import javax.swing.JFrame;
		//마우스이벤트 예제-1 실행

public class MouseEventDrawEx {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		MouseEventDraw med = new MouseEventDraw();
		
		f.add(med);
		f.setSize(250, 250);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


