package Day21;

import java.awt.Color;

import javax.swing.JFrame;

//애플릿 실습문제 -1 실행문

public class PieChartEx {

			public static void main(String[] args) {
				JFrame f = new JFrame("파이차트"); //Frame = 틀.
				PieChart p = new PieChart();
				
			
				f.add(p);
				f.setSize(600, 600);
				f.setBackground(Color.LIGHT_GRAY);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <- 오른쪽 창 x표시.
				f.setResizable(false); //사이즈를 변경할 수 없다.
				f.setVisible(true); //트루를 해야 실행된다.
				
}
}
