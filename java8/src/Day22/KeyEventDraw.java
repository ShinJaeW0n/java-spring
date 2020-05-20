package Day22;

import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

		//Ű �̺�Ʈ ���� -1 , ����,����

public class KeyEventDraw {
	public static void main(String[] args) {
		JFrame f = new JFrame("Ű �̺�Ʈ");
		
		TextField tf = new TextField();
		tf.setEnabled(false); //�޽��� �� �ٲ�.
		
		f.add(tf);
		f.setSize(200, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f.addKeyListener(new KeyListener() {
			
			
			@Override
			public void keyTyped(KeyEvent e) { 
				int key = e.getKeyChar();
				tf.setText(String.valueOf((char)key)); //Ű�� ��Ʈ���̾ ��Ʈ������ �ٲپ���
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				int key = e.getKeyCode();
				String temp = tf.getText();
				tf.setText(temp + " : " + KeyEvent.getKeyText(key)); //Ű �̸� ���
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
						
			}
		});
	
	}

		
}