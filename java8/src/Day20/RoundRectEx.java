package Day20;

import javax.swing.JFrame;
	//애플릿 예제 -4  실행
public class RoundRectEx {

		public static void main(String[] args) {
			
			JFrame f = new JFrame("사각형 만들기 예제"); //Frame = 틀.
			RoundRect p = new RoundRect();
			
		
			f.setSize(500, 500);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <- 오른쪽 창 x표시.
			f.add(p);
			f.setResizable(false); //사이즈를 변경할 수 없다.
			f.setVisible(true); //트루를 해야 실행된다.
		}
}
