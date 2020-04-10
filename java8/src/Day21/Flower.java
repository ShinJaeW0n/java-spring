package Day21;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

//애플릿 실습문제 실행문 -2
			public class Flower extends JPanel {
				
				
				public void paint(Graphics g) {
					
					g.setColor(Color.GREEN);
					g.fillRect(120, 350, 15, 40);
					
					g.setColor(Color.RED);
					g.fillOval(50, 200, 150, 150);
					
					g.setColor(Color.ORANGE);
					g.fillOval(83, 235, 85, 85);
					
					
					
					g.setColor(Color.GREEN);
					g.fillArc(96, 370, 20, 20, 150, 180);
					g.fillArc(138, 370, 20, 20, 210, 180);
					
					
					g.setColor(Color.GREEN);
					g.fillRect(420, 250, 15, 40);
					
					g.setColor(Color.PINK);
					g.fillOval(350, 100, 150, 150);
					
					g.setColor(Color.magenta);
					g.fillOval(383, 135, 85, 85);
					
					
					
					g.setColor(Color.GREEN);
					g.fillArc(396, 270, 20, 20, 150, 180);
					g.fillArc(438, 270, 20, 20, 210, 180);
					
					
					
					}
				}
