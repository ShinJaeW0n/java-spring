package Day20;

import java.awt.Color;

import javax.swing.JFrame;
//애플릿 예제 -3 실행
public class DrawLineEx {
		
	public static void main(String[] args) {
		JFrame f = new JFrame("라인 그리기");
		DrawLine p = new DrawLine();
		p.init();
		
		f.add(p);
		f.setSize(500,500);
		f.setBackground(Color.orange);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
