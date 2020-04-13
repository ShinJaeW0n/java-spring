package Day22;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

		//아이템이벤트-1 메시지창, 생성, 실행
		public class ItemEventTest  extends JFrame{
			JLabel txt1, txt2;
			JRadioButton r1, r2, r3, r4, r5, r6;
			
			public ItemEventTest() {
				super("아이템 이벤트 처리");
				setLayout(new FlowLayout());
//				setLayout(new GridLayout(2,2));
				
				//수평으로 컴포넌트 추가
				Box hBox = Box.createHorizontalBox();
				ButtonGroup rgGroup = new ButtonGroup();
				rgGroup.add(r1 = new JRadioButton("우리 투자 증권"));
				hBox.add(r1);
				
				
				hBox.add(Box.createHorizontalStrut(30));
				rgGroup.add(r2 = new JRadioButton("삼성증권"));
				hBox.add(r2);
				
				hBox.add(Box.createHorizontalStrut(30));
				rgGroup.add(r3 = new JRadioButton("대우증권"));
				hBox.add(r3);
				
				hBox.add(Box.createHorizontalStrut(30));
				hBox.add(Box.createGlue());
				
				JPanel panel = new JPanel(new BorderLayout());
				//외곽선
				panel.setBorder(new TitledBorder(new EtchedBorder(), "증권회사 구분"));
				panel.add(hBox);
				
				//수평으로 컴포넌트 증가
				Box hhbox = Box.createHorizontalBox();
				ButtonGroup cgroup = new ButtonGroup();
				cgroup.add(r4 = new JRadioButton("국민은행"));
				cgroup.add(r4);
				
				hhbox.add(Box.createHorizontalStrut(30));
				cgroup.add(r5 = new JRadioButton("외환은행"));
				hhbox.add(r5);
				
				hhbox.add(Box.createHorizontalStrut(30));
				cgroup.add(r6 = new JRadioButton("기업은행"));
				hhbox.add(r6);
				
				hhbox.add(Box.createHorizontalStrut(30));
				hhbox.add(Box.createGlue());
				
				JPanel lpanel = new JPanel(new BorderLayout());
				lpanel.setBorder(new TitledBorder(new EtchedBorder(), "은행 구분"));
				lpanel.add(hhbox);
				
				//수직으로 패널추가
				Box cbox = Box.createVerticalBox();
				cbox.add(panel);
				cbox.add(lpanel);
				txt1 = new JLabel("증권회사 출력됨");
				txt1.setFont(new Font("굴림", Font.PLAIN, 16));
				cbox.add(txt1);
				
				txt2 = new JLabel("은행 출력됨");
				txt2.setFont(new Font("굴림", Font.PLAIN, 16));
				cbox.add(txt2);
				add(cbox);
				
				RBHandler rh = new RBHandler();
				r1.addItemListener(rh);
				r2.addItemListener(rh);
				r3.addItemListener(rh);
				r4.addItemListener(rh);
				r5.addItemListener(rh);
				r5.addItemListener(rh);
				
				
				
				}
			
				private class RBHandler implements ItemListener {
					
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(e.getSource() == r1)
						if(e.getStateChange() == ItemEvent.SELECTED) //바뀐 이벤트가 선택된거라면
							txt1.setText("선택 : 우리투자증권");
					if(e.getSource() == r2)
						if(e.getStateChange() == ItemEvent.SELECTED)
							txt1.setText("선택 : 삼성증권");
					if(e.getSource() == r3)
						if(e.getStateChange() == ItemEvent.SELECTED)
							txt1.setText("선택 : 대우증권");
					if(e.getSource() == r4)
						if(e.getStateChange() == ItemEvent.SELECTED)
							txt2.setText("선택 : 국민은행");
					if(e.getSource() == r5)
						if(e.getStateChange() == ItemEvent.SELECTED)
							txt2.setText("선택 : 외환은행");
					if(e.getSource() == r6)
						if(e.getStateChange() == ItemEvent.SELECTED)
							txt2.setText("선택 : 기업은행");
					
						
					
				}
			
				}
				
			public static void main(String[] args) {
				ItemEventTest it = new ItemEventTest();
				it.setDefaultCloseOperation(EXIT_ON_CLOSE);
				it.setSize(400,200);
				it.setVisible(true);
				
			}
			}	
