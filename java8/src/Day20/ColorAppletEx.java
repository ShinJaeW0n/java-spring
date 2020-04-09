package Day20;

import java.awt.Color;

import javax.swing.JFrame;

			//애플릿 예제-1 실행
public class ColorAppletEx {

		public static void main(String[] args) {
			
			JFrame f = new JFrame("색상변환 예제"); //Frame = 틀.
			ColorApplet p = new ColorApplet();
			p.init();
		
			f.setSize(500, 500);
			f.setBackground(Color.BLUE);
//			f.setTitle("애플릿 첫 예제");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <- 오른쪽 창 x표시.
			f.add(p);
			f.setVisible(true); //트루를 해야 실행된다.
		
	

		}
}
