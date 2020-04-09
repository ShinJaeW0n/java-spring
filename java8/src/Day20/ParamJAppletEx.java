package Day20;

import javax.swing.JFrame;
		
				//애플릿 -2
public class ParamJAppletEx {

		public static void main(String[] args) {
			
			JFrame f = new JFrame("애플릿 첫 예제"); //Frame = 틀.
			ParamJApplet p = new ParamJApplet();
			p.init("자바자바");; //초기화하기 위해서.
		
			f.setSize(500, 500);
//			f.setTitle("애플릿 첫 예제");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <- 오른쪽 창 x표시.
			f.add(p);
			f.setVisible(true); //트루를 해야 실행된다.
			
			
		}
}
