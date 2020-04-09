package Day20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

			//애플릿 예제-1
public class ColorApplet extends JPanel {

		public void init() {
			
			setBackground(Color.blue);
		/*방법 1: 패널사용
		 * Panel p1 = new Panel();
		 * p1.setBackground(Color.blue);
		 * this.add(p1)*/
			
		
		}
		

		public void pain(Graphics g) {
			/*방법2 : paint 메소드에서 fillRect 사용
			 * g.setColor(Color.blue)
			 * g.fillRect(0,0, getWidth(), getHeight());*/
			
			Color myColor = new Color(255,0,0);
			g.setColor(myColor);
			g.drawString("검정색 글씨를 그린다" , 40, 100);
		}


}
