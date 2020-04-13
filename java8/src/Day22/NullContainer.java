package Day22;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

	//카드 레이아웃 -1 생성, 실행

	class NullContainer extends JFrame implements ActionListener{

	JPanel panel;
	Card cards;
	public NullContainer() {
		setTitle("카드 레이아웃");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0,5,10,0)); //컨트롤+GridLayput 누르면 이게 뭔지 생성자가 뜸.
		addButton("<<", panel);
		addButton("<" , panel);
		addButton(">" , panel);
		addButton(">>", panel);
		addButton("종료", panel);
		add(panel,"North");
		
		cards = new Card();
		add(cards, "Center");
		setVisible(true);
		
	}
		
		void addButton(String str, Container target) {
			JButton button = new JButton(str);
			button.addActionListener(this);//액션 리스너를 구현했기 때문에 자기 자신이 액션리스너라서 this를 넣어준거임.
			target.add(button);
		}
		
		private class Card extends JPanel {
			CardLayout layout; //카드 레이아웃
			
			public Card() {
				layout = new CardLayout();
				setLayout(layout);
				for(int i = 1; i <= 10; i++) 
					add(new JButton("현재 카드번호 : " + i),"Center");
			}
		}
		
		
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("종료"))
				System.exit(0);
			
			if (e.getActionCommand().equals("<<"))
				cards.layout.first(cards);
			
			if (e.getActionCommand().equals("<"))
				cards.layout.previous(cards);
			
			if (e.getActionCommand().equals(">"))
				cards.layout.next(cards);
			
			if (e.getActionCommand().equals(">>"))
				cards.layout.last(cards);
		}
		
		public static void main(String[] args) {
			NullContainer nu = new NullContainer();
		}
	
	}
