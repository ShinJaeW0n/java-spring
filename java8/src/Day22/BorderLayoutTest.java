package Day22;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;

//보더 레이아웃 -1 생성, 실행문

public class BorderLayoutTest extends JFrame{

		public BorderLayoutTest() {
			
			super("보더 레이아웃");
			//JFrame과 기본 레이아웃 매니저는 BorderLayout이기 때문에, BorderLayout매니저를 생성하지 않아도됨.
			add("North", new Button("North"));
			add(BorderLayout.EAST, new Button("East"));
			add(new Button("Center"), BorderLayout.CENTER);
			add(new Button("South"), BorderLayout.SOUTH);
			add(new Button("West"), BorderLayout.WEST);
			setSize(300,300);
			setVisible(true);
			
		}
	
		public static void main(String[] args) {
			BorderLayoutTest bt = new BorderLayoutTest();
			bt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
}
