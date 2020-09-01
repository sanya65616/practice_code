package GUi;
import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4576963411574506458L;

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.orange);
		g2d.fillRect(20, 50, 100, 100);
	}

}
