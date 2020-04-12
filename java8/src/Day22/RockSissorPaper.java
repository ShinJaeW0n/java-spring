package Day22;

import java.awt.Container;

import java.awt.List;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

public class RockSissorPaper extends JFrame implements ActionListener {
	// 필드

	static String user = "";
	static String com = "";
	static int number = 0;
	static List list;
	JButton rock, sissor, paper, start, end;


	public static void main(String[] args) {

		// 실행
		
		Computer();
		
		RockSissorPaper rsp = new RockSissorPaper();
		
		rsp.setSize(400, 400);
		
		rsp.setVisible(true);

	}


	public RockSissorPaper() {
		//생성
		super("가위 바위 보 게임");

		start();
	}

	public void start() {

		Container ct = getContentPane();

		ct.setLayout(null); // 레이아웃 매니저 삭제

		// 버튼추가

		sissor = new JButton("가위");

		rock = new JButton("바위");

		paper = new JButton("보");

		start = new JButton("시작");

		end = new JButton("종료");

		list = new List();

		sissor.setBounds(60, 200, 70, 30);

		rock.setBounds(160, 200, 70, 30);

		paper.setBounds(260, 200, 70, 30);

		start.setBounds(160, 250, 70, 30);

		list.setBounds(17, 20, 350, 150);

		end.setBounds(160, 290, 70, 30);

		ct.add(sissor);

		ct.add(rock);

		ct.add(paper);

		ct.add(end);

		ct.add(start);

		ct.add(list);

		rock.addActionListener(this);

		sissor.addActionListener(this);

		paper.addActionListener(this);

		start.addActionListener(this);

		end.addActionListener(this);

		list.addActionListener(this);

	}

	@Override

	public void actionPerformed(ActionEvent e) { // ActionListener

		if (e.getSource() == rock) {

			list.add("바위를 냈습니다.");

			Vs(com, "바위");

		} else if (e.getSource() == sissor) {

			list.add("가위를 냈습니다.");

			Vs(com, "가위");

		} else if (e.getSource() == paper) {

			list.add("보를 냈습니다.");

			Vs(com, "보");

		} else if (e.getSource() == start) {

			list.removeAll();

			Computer();

		} else if (e.getSource() == end) {

			System.exit(0);

		}

	}

	static void Computer() {

		number = (int) (Math.random() * 3);

		switch (number) {

		case 0:
			com = "가위";

			break;

		case 1:
			com = "바위";

			break;

		case 2:
			com = "보";

			break;

		}

	}

	void Vs(String com, String user) {

		if (com.equals("바위")) {

			if (user.equals("바위")) {

				list.add("컴퓨터는 바위를 냈습니다.");

				list.add("비겼습니다.");

			} else if (user.equals("보")) {

				list.add("컴퓨터는 바위를 냈습니다.");

				list.add("유저의 승리입니다.");

			} else {

				list.add("컴퓨터는 바위를 냈습니다.");

				list.add("컴퓨터의 승리입니다.");

			}

		}

		if (com.equals("가위")) {

			if (user.equals("가위")) {

				list.add("컴퓨터는 가위를 냈습니다.");

				list.add("비겼습니다.");

			} else if (user.equals("바위")) {

				list.add("컴퓨터는 가위를 냈습니다.");

				list.add("유저의 승리입니다.");

			} else {

				list.add("컴퓨터는 바위를 냈습니다.");

				list.add("컴퓨터의 승리입니다.");

			}

		}

		if (com.equals("보")) {

			if (user.equals("보")) {

				list.add("컴퓨터는 보를 냈습니다.");

				list.add("비겼습니다.");

			} else if (user.equals("가위")) {

				list.add("컴퓨터는 보를 냈습니다.");

				list.add("유저의 승리입니다.");

			} else {

				list.add("컴퓨터는 보를 냈습니다.");

				list.add("컴퓨터의 승리입니다.");

			}

		}

		Computer();

	}

}
