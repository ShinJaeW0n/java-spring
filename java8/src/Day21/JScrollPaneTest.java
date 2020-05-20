package Day21;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

//���� ���� -5 �׸���. ���� ǥ �����.
public class JScrollPaneTest extends JFrame{
		JPanel jp;
		
		public JScrollPaneTest(String title) {
			super(title);
			setLayout(new BorderLayout());
			jp = new JPanel();
			jp.setLayout(new GridLayout(10,5)); //10�� 5ĭ
			int cnt = 1;
			for(int i=1; i<=10; i++) {
				for(int j = 1; j <=5; j++) {
					jp.add(new JButton("��ư" + cnt));
					cnt++;		
			
				}
			}
		
			//����, ���� ��ũ�ѹٸ� �����ϱ� ���� ����� ����.
			int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;	//��ũ�ѹٰ� �׻� ���̵���
			int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
			JScrollPane js = new JScrollPane(jp, v, h);
			add(js, BorderLayout.CENTER);
			
			setSize(300,300);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
			public static void main(String[] args) {
				JScrollPaneTest f = new JScrollPaneTest("��ũ�� ����");
				
		}
		
}