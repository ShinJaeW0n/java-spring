package Day21;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

//스윙 예제 -5 그리드. 계산기 표 만들기.
public class JScrollPaneTest extends JFrame{
		JPanel jp;
		
		public JScrollPaneTest(String title) {
			super(title);
			setLayout(new BorderLayout());
			jp = new JPanel();
			jp.setLayout(new GridLayout(10,5)); //10줄 5칸
			int cnt = 1;
			for(int i=1; i<=10; i++) {
				for(int j = 1; j <=5; j++) {
					jp.add(new JButton("버튼" + cnt));
					cnt++;		
			
				}
			}
		
			//수직, 수평 스크롤바를 설정하기 위한 상수를 얻음.
			int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;	//스크롤바가 항상 보이도록
			int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
			JScrollPane js = new JScrollPane(jp, v, h);
			add(js, BorderLayout.CENTER);
			
			setSize(300,300);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
			public static void main(String[] args) {
				JScrollPaneTest f = new JScrollPaneTest("스크롤 예제");
				
		}
		
}
