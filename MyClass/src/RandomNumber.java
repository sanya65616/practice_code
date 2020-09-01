import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RandomNumber {
	JFrame frame;
	JPanel panel;
	JLabel label2;
	Button button;
	
	public static void main(String[] args) {
		RandomNumber num = new RandomNumber();
		num.go();
	}
	
	public void go() {
		frame = new JFrame();
		panel = new JPanel();
		//label1 = new JLabel("Press Button");
		label2 = new JLabel("");
		button = new Button("Press Button");
		
		frame.add(panel);
		//panel.add(label1);
		panel.add(button);
		panel.add(label2);
		button.addActionListener(new buttonListener());
		
		frame.getContentPane();
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public class  buttonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int max = 30;
			int min = 0;
			double value = 0;
			int number = 0;
			int range = max + 1;
			
			 value = (Math.random() * range + min );
			
			number = (int) value;
			label2.setText("number is "+number);
			
		}
	}
}

	 



