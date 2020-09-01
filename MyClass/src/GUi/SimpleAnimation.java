package GUi;
import java.awt.*;
import javax.swing.*;

public class SimpleAnimation {
	int x = 70; 
	int y = 70;
	public static void main (String[] arg) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(drawPanel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		for(int i = 0; i < 350; i++) {
			x++;
			y++;
			drawPanel.repaint();
			try {
				Thread.sleep(50);
			}
			catch(Exception ex) {}
		}
	}
	
	class MyDrawPanel extends JPanel {
		
		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			g.setColor(Color.orange);
			g.fillRect(x, y, 40, 40);
		}
	}
	

}
