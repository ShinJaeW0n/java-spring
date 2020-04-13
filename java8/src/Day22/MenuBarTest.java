package Day22;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

		//메뉴바 실습1  생성, 실행

public class MenuBarTest extends JFrame{

		public static void main(String[] args) {
			
			JFrame f = new JFrame();
			JMenuBar menubar = new JMenuBar();
			JMenu menu1 = new JMenu("파일");
			JMenu menu2 = new JMenu("편집");
			JMenu menu3 = new JMenu("보기");
			JMenuItem item1 = new JMenuItem("새로 만들기");
			JMenuItem item2 = new JMenuItem("열기");
			JMenuItem item3 = new JMenuItem("저장");
			menu1.add(item1);
			menu1.add(item2);
			menu1.add(item3);
			JMenuItem item4 = new JMenuItem("잘라내기");
			JMenuItem item5 = new JMenuItem("복사");
			JMenuItem item6 = new JMenuItem("붙여넣기");
			menu2.add(item4);
			menu2.add(item5);
			menu2.add(item6);
			JMenuItem item7 = new JMenuItem("도구모음");
			JMenuItem item8 = new JMenuItem("상태표시줄");
			menu3.add(item7);
			menu3.add(item8);
			
			menubar.add(menu1);
			menubar.add(menu2);
			menubar.add(menu3);
			
			//여기서 부터 이해 더 하기.
			TextField tf = new TextField();
			tf.setEnabled(false);
//			tf.setEditable(false);
			
			//밑으로 위치 내려주고.
			f.add(tf, BorderLayout.SOUTH);
			//메뉴바 세팅.
			f.setJMenuBar(menubar);
			f.setVisible(true);
			f.setSize(300, 300);
			
			//람다식으로, 람다식으로 안할거면 익명구현객체로 해줘야함. 얘 많이 씀**
			ActionListener ac = e -> tf.setText(e.getActionCommand()); //String이 아니라면 toString을 가져와서 스트링으로 바꿔줄 수 있다.
			item1.addActionListener(ac);
			item2.addActionListener(ac);
			item3.addActionListener(ac);
			item4.addActionListener(ac);
			item5.addActionListener(ac);
			item6.addActionListener(ac);
			item7.addActionListener(ac);
			item8.addActionListener(ac);
			
			
		}
		
	

		
}
