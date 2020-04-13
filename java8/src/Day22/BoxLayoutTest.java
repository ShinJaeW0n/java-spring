package Day22;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
	//박스 레이아웃 -1 ,생성, 실행

public class BoxLayoutTest extends JFrame {
		public BoxLayoutTest() {
			super("박스 레이아웃");
			
			Box hBox = Box.createHorizontalBox();	//수평으로 배열하는 박스
			hBox.add(Box.createHorizontalStrut(30));	//고정크기 컴포넌트
			hBox.add(new JCheckBox("우리투자증권"));	//체크박스
			hBox.add(Box.createHorizontalStrut(30));
			hBox.add(new JCheckBox("삼성증권"));
			hBox.add(Box.createHorizontalStrut(30));
			hBox.add(Box.createGlue());	//크기 변환하는 컴포넌트,박스말고 더 상위의 컴포넌트를 가져옴, 뒤 쪽 공백을 30만 남기겠다.
			JPanel lpanel = new JPanel(new BorderLayout()); //보더 레이아웃을 사용하는 패널
			lpanel.setBorder(new TitledBorder(new EtchedBorder(), "증권회사 구분")); //외곽선 설정
			lpanel.add(hBox, BorderLayout.CENTER); //패널에 박스 장착
			
			//수평으로 컴포넌트 추가
			Box hhBox = Box.createHorizontalBox();
			hhBox.add(Box.createHorizontalStrut(30));
			hhBox.add(new JCheckBox("국민은행"));
			hhBox.add(Box.createHorizontalStrut(30));
			hhBox.add(new JCheckBox("외환은행"));
			hhBox.add(Box.createHorizontalStrut(30));
			hhBox.add(Box.createGlue());
			JPanel llpanel = new JPanel(new BorderLayout());
			llpanel.setBorder(new TitledBorder(new EtchedBorder(), "은행구분"));
			llpanel.add(hhBox, BorderLayout.CENTER);
			
			//수직으로 패널 추가
			Box cBox = Box.createVerticalBox(); //수직박스
			cBox.add(lpanel); //패널추가
			cBox.add(llpanel);//패널추가
			add(cBox, BorderLayout.CENTER); //프레임에 추가 ,그냥 add는 자기자신(this), **JFrame에 생성하는 것임.!!
			
		
		}
	
		
		public static void main(String[] args) {
			BoxLayoutTest bx = new BoxLayoutTest();
			bx.setSize(400, 200);
			bx.setDefaultCloseOperation(EXIT_ON_CLOSE);
			bx.setVisible(true);
		}
	
}
