package Day22;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
		
		//마우스이벤트 예제-1 생성

public class MouseEventDraw extends JPanel implements MouseListener{
		int noval = 0;
		int [] x,y;
	
		//초기화코드
		public MouseEventDraw() {
			x = new int[50];
			y = new int[50];
			addMouseListener(this); //클릭, 눌렀다 뗏다 이런애들 모아놓은것.
		}

		public void paint(Graphics g) {
			
			g.setColor(Color.blue);
			g.drawString("마우스를 클릭하면 사각형을 그림", 10, 10);
			g.setColor(Color.red);
			for(int i = 0; i<noval; i++) {
				g.drawRect(x[i]-20, y[i]-20, 50, 50);
				}
			}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			if(noval < 50) {
				x[noval] = e.getX();
				y[noval] = e.getY();
				noval++;
			}
			repaint();			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}
		
	}

		
