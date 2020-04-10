package Day21;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


//스윙 예제 -6 상단 메뉴바 만들기.
public class JMenuTest extends JFrame {
	JPanel jp;
	
	public JMenuTest(String title) {
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
		
		//메뉴만들기
		JMenuBar jmb = new JMenuBar();
		setJMenuBar(jmb);
		JMenu jm1 = new JMenu("파일");
		JMenu jm2 = new JMenu("편집", false);
		JMenu jm3 = new JMenu("보기", true);
		JMenuItem item1 = new JMenuItem("새로 만들기");
		JMenuItem item2 = new JMenuItem("열기");
		JMenuItem item3 = new JMenuItem("프로그램 종료");
		jm1.add(item1);
		jm1.add(item2);
		jm1.add(item3);
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		item3.addActionListener(e -> {
			System.exit(0);
		});
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

		public static void main(String[] args) {
			JMenuTest f = new JMenuTest("스크롤 예제");
			
	}
	
}

