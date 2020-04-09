package Day20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
//애플릿 예제 -3
public class DrawLine extends JPanel {

		public void init() {
			setBackground(Color.ORANGE);//상수는 대문자!
		}
		
		public void paint(Graphics g) {
			g.setColor(Color.RED);
			g.drawLine(10, 20, 150, 150);
			g.setColor(Color.black);
			for(int y = 0; y < 150; y= y+20)  //y는 20씩 증가한다.
				g.drawLine(10+y, 20, 10+y, 150);
			
			
		}
}
