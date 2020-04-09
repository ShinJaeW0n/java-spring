package Day20;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;
			
				//¾ÖÇÃ¸´ ¿¹Á¦ -2

public class FontApplet extends JPanel {
		Font sansPlain, serifBold, serifBoldI, monoItalic;
		String param;
	
		public void init() { 
			serifBold = new Font("Serif", Font.BOLD, 10);
			serifBoldI = new Font("Serif", Font.BOLD+Font.ITALIC, 13);
			sansPlain = new Font("SanSerif", Font.PLAIN, 16);
			monoItalic = new Font("Monospaced", Font.ITALIC, 20);
			
			}
		
		public void paint(Graphics g) {
			g.setFont(serifBold);
			param = "Font name = Serif , Style = BOLD , size = 10";
			g.drawString(param, 10, 10);
			
			g.setFont(serifBoldI);
			param = "Font name = Serif , Style = BOLD+ITALIC , size = 13";
			g.drawString(param, 10, 50);
			
			g.setFont(sansPlain);
			param = "Font name = SanSerif , Style = PLAIN , size = 16";
			g.drawString(param, 10, 90);
			g.setColor(Color.blue);
			
			g.setFont(monoItalic);
			param = "Font name = Monospaced, style = ITALIC, size = 20";
			g.drawString(param, 10, 130);
			
			
		
		}
		
}
