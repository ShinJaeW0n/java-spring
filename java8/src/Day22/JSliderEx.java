package Day22;


import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JSlider;

			//슬라이더 예제 -1 생성,실행
public class JSliderEx extends WindowAdapter{
			
		@Override
		public void windowClosed(WindowEvent e) {
			Window w = e.getWindow();
			int width = w.getWidth();
			int height = w.getHeight();
			System.out.println("창의 크기: " + width + " ," + height);
			
		}
		
		public static void main(String[] args) {
			JFrame f = new JFrame();
			f.setTitle("슬라이더 예제");
			
			JSlider s = new JSlider(0, 100, 50); //벨류는 현재값
			s.setMajorTickSpacing(10);
			s.setMinorTickSpacing(1);
			s.setPaintTicks(true); //화면에 표시
			s.setPaintLabels(true);
			
							//익명구현객체말고 람다로 해봄.
			s.addChangeListener(e -> {
				JSlider js = (JSlider) e.getSource();
				int value = js.getValue();
				System.out.println("현재값" + value);
				});
			
			
			
			f.add(s);
			f.pack();
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}
}
