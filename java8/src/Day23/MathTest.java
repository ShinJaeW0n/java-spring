package Day22;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MathTest extends JFrame implements KeyListener {
		
		int cnt = (int)(Math.random()*24+1);
		static int index;
		
		
	public MathTest(String s) {
			
			super(s);
			index = cnt;
			
			
		}
		
		public static void Puzzle() {
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(5,5,1,1));
			panel.add(new JButton(""+index));
			
			}
		
		
		public static void main(String[] args) {
			JFrame f = new JFrame("숫자 퍼즐 맞추기 게임");
			Puzzle();
			f.setSize(500, 500);
			f.setVisible(true);
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			int key = e.getKeyCode();
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	
	 
	
	 
}
