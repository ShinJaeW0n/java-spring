package Day23;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//스윙-숫자퍼즐게임
public class Puzzle extends JPanel {
	JLabel[] labels;
	Point[] points;
	Block[] blocks;
	int x;

	public static void main(String[] args) {
		JFrame f = new JFrame("숫자퍼즐게임");
		Puzzle p = new Puzzle(); // 생성자
		p.setLayout(null); // null값은 위치를 잡아서 설정한다.
		p.makeGame(); // 게임 호출

		// 키보드로 해야해서 키
		f.addKeyListener(p.getKeyListener());
		f.add(p);
		f.setSize(266, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.shuffleGame();

	}

	void makeGame() {
		labels = new JLabel[25]; // 초기화
		points = new Point[25];
		blocks = new Block[25];

		for (int i = 0; i < blocks.length; i++) {
			// 1부터 시작하게 하려고, String이기 떄문에 ""를 넣어줌.
			labels[i] = new JLabel(i + 1 + "", JLabel.CENTER);
			labels[i].setSize(50, 50);
			labels[i].setBorder(BorderFactory.createLineBorder(Color.GREEN));// 외곽선 그려주는거.
			// x좌표값 y좌표값
			points[i] = new Point(i % 5 * 50, i / 5 * 50);
			labels[i].setLocation(points[i]);
			blocks[i] = new Block(labels[i], points[i]); // 위치를 블록으로 고정시키기 위해서 포인트값을 넣어줌.
			this.add(labels[i]);
		}

		this.remove(labels[blocks.length - 1]); // 25가 빈자리가 된다. 빈자리를 이동시켜야한다.
		x = blocks.length; // 25가 나옴.

	}

	KeyListener getKeyListener() {
		KeyListener listener = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			// 키 이벤트별로 조건이 다 달라서 동일한 코드를 4번 사용한다.
			@Override
			public void keyPressed(KeyEvent e) { // 왼쪽키를 누를때 x가 오른쪽 끝줄이 아니면 증가해야한다.
				if (e.getKeyCode() == KeyEvent.VK_LEFT && x % 5 != 0) // 왼쪽 <- 키를 눌렀다면.
				{
					x++; // 이때 x가 오른쪽 끝줄이다.
					moveGame(x, e.getKeyCode());
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT && x % 5 != 1) {
					x--; // 24에서 오른쪽 버튼을 누르면 왼쪽이 24가 되니까.
					moveGame(x, e.getKeyCode());
				} else if (e.getKeyCode() == KeyEvent.VK_UP && x <= 20) { // 21~25는 5씩 증가하면 안되니까.
					x += 5;
					moveGame(x, e.getKeyCode());
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN && x >= 6) { // 1~5는 5씩 감소하면 안되니까.
					x -= 5;
					moveGame(x, e.getKeyCode());
				}

//					System.out.println(x);
					matchGame(); //키 눌렀을 때 게임 실행.
			}
		};
		return listener;
	}

	
	
	void moveGame(int x, int keyCode) {
		JLabel label;
		switch (keyCode) {
		case KeyEvent.VK_LEFT:
			label = blocks[x - 1].getLable();
//			blocks[x - 1].setLable(null);
			blocks[x - 2].setLable(label);
			label.setLocation(blocks[x - 2].getPoint());
			break;
		case KeyEvent.VK_RIGHT:
			label = blocks[x - 1].getLable();
//			blocks[x - 1].setLable(null);
			blocks[x].setLable(label);
			label.setLocation(blocks[x].getPoint());
			break;
		case KeyEvent.VK_UP:
			label = blocks[x - 1].getLable();
//			blocks[x - 1].setLable(null);
			blocks[x - 6].setLable(label);
			label.setLocation(blocks[x - 6].getPoint());
			break;
		case KeyEvent.VK_DOWN:
			label = blocks[x - 1].getLable();
//			blocks[x - 1].setLable(null);
			blocks[x + 4].setLable(label);
			label.setLocation(blocks[x + 4].getPoint());
			break;

		}
	}

	void shuffleGame() {
		for (int i = 0; i < 100; i++) {
			int random = (int) (Math.random() * 4); // 할때마다 랜덤 주기위해서 포문안에 넣음.
			switch (random) {
			case 0:
				if (x % 5 != 0) {
					x++;
					moveGame(x, KeyEvent.VK_LEFT);
				}
				break;
			case 1:
				if (x % 5 != 1) {
					x--;
					moveGame(x, KeyEvent.VK_RIGHT);
				}
				break;
			case 2:
				if (x <= 20) {
					x += 5;
					moveGame(x, KeyEvent.VK_UP);
				}
				break;
			case 3:
				if (x >= 6) {
					x -= 5;
					moveGame(x, KeyEvent.VK_DOWN);
				}
				break;
			}

			try {
				// 0.1초 텀을 준다.
				Thread.sleep(10);
			} catch (InterruptedException e) {

			}
		}

	}

	void matchGame() {
		int cnt = 0;
		for (int i = 0; i < blocks.length; i++) {
			if (blocks[i].getLable().getText().equals(i + 1 + "")) {
				
			} else {
				break;
			}
				//총 24개니까 0에서 23번까지 여서
			if(i == 23) {
				JOptionPane.showMessageDialog(this, "정답입니다.");
			}
		}
	}

	class Block {
		private JLabel lable;
		private Point point;

		// 우클릭 소스 - 필드생성
		public Block(JLabel lable, Point point) {
			super();
			this.lable = lable;
			this.point = point;
		}

		public JLabel getLable() {
			return lable;
		}

		public void setLable(JLabel lable) {
			this.lable = lable;
		}

		public Point getPoint() {
			return point;
		}

		public void setPoint(Point point) {
			this.point = point;
		}

	}

}
