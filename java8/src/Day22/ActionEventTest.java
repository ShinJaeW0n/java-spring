package Day22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

		//액션이벤트-1 메시지창, 생성, 실행
		public class ActionEventTest extends JFrame implements ActionListener {
				JButton jbt1, jbt2, jbt3, jbt4; //필드에 버튼 지정. 아래 생성자 메소드들과 공통으로 쓰려고.

				
				//생성자
				public ActionEventTest() {
					super("ActionEvent 처리"); //JFrame
					
					setLayout(new FlowLayout()); //순서대로 출력
					jbt1 = new JButton("입력");
					jbt2 = new JButton("확인");
					jbt3 = new JButton("옵션");
					jbt4 = new JButton("메시지");
					
					add(jbt1); //그냥 add는 this. JFrame
					add(jbt2);
					add(jbt3);
					add(jbt4);
					
					jbt1.addActionListener(this); //this는 액션리스너!
					jbt2.addActionListener(this);
					jbt3.addActionListener(this);
					jbt4.addActionListener(this);
					
					setSize(300,300);
					setVisible(true);
					
					}

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == jbt1) { //버튼 1의 객체(입력)와 같다면 //부모 컴퍼넌트 - this(나)
							String name = JOptionPane.showInputDialog(this, "이름을 입력하세요"); //제이옵션팬 - 옵션패널(많은 옵션을 가지고 있다).그중 첫번째 쇼인풋 다이얼로그.
							//입력되는 값			     //새로운 입력창이 뜨는거. 모달-다른 창을 띄웠을 경우 하위 창을 사용할 수 없는 것.
							System.out.println(name);
						}
						if(e.getSource() == jbt2) { 
							int con = JOptionPane.showConfirmDialog(this, "확인?");
							if(con==JOptionPane.YES_NO_OPTION);{
//								System.exit(0);
							}
						}
						
						if(e.getSource() == jbt3) {
							String[] option = {"검색", "추가", "취소"};
							JOptionPane.showOptionDialog(this, "원하는 직업 선택", "옵션 대화상자",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, 
									null, option, option[0]);
						}
						
						if(e.getSource() == jbt4) {
							JOptionPane.showMessageDialog(this, "메시지 대화상자");
						}
							
						}

						public static void main(String[] args) {
							ActionEventTest at = new ActionEventTest();
							at.setDefaultCloseOperation(EXIT_ON_CLOSE);
						}
					
					}
