package Day22;

import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

		//키 이벤트 예제 -1 , 생성,실행

public class KeyEventDraw {
	public static void main(String[] args) {
		JFrame f = new JFrame("키 이벤트");
		
		TextField tf = new TextField();
		tf.setEnabled(false); //펄스면 못 바꿈.
		
		f.add(tf);
		f.setSize(200, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f.addKeyListener(new KeyListener() {
			
			
			@Override
			public void keyTyped(KeyEvent e) { 
				int key = e.getKeyChar();
				tf.setText(String.valueOf((char)key)); //키가 인트값이어서 스트링으로 바꾸어줌
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				int key = e.getKeyCode();
				String temp = tf.getText();
				tf.setText(temp + " : " + KeyEvent.getKeyText(key)); //키 이름 출력
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
						
			}
		});
	
	}

		
}
