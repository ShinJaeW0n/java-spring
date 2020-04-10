package Day21;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//스윙예제-1 , 버튼 만들기 //이벤트
public class JPanelEx {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		//패널은 중복적으로 사용가능하고
		JButton btn1 = new JButton("버튼 1번");
		JButton btn2 = new JButton("버튼 2번");
		JButton btn3 = new JButton("버튼 3번");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setText("변경1");
			}
		});
		
		
		
		//람다식
		btn2.addActionListener(e -> btn3.doClick());
		btn3.addActionListener(e -> btn3.setText("변경3"));
		
		
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p1.add(p2); //그룹화
		
		
		f.add(p1); 
		//f.pack(); //내부의 컴퍼넌트 크기에 맞춰서 자동으로 크기조절
		f.setLayout(new FlowLayout());
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	} 
	
		
	
	
}


 