package ClassAssignment3;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class AppletCalculator extends  Applet {
		Label l1, l2, l3;
	TextField t1, t2;
	Button b1, b2, b3, b4;
	
	public void init() {
		l1 = new Label("First number");
		l2 = new Label("Second number");
		t1 = new TextField();
		t2 = new TextField();
		b1 = new Button("Add");
		b2 = new Button("Sub");
		b3 = new Button("Mult");
		b4 = new Button("Div");
		
		setLayout(null);
		l1.setBounds(30, 50, 100, 20);
		l2.setBounds(30, 50, 100, 20);
		t1.setBounds(150, 50, 100, 20);
		t2.setBounds(150, 100, 100, 20);
		b1.setBounds(100, 150, 80, 20);
		b2.setBounds(100, 150, 80, 20);
		b3.setBounds(100, 150, 80, 20);
		b4.setBounds(100, 150, 80, 20);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b1.addActionListener(new addListener());
		b2.addActionListener(new subListener());
		b3.addActionListener(new multListener());
		b4.addActionListener(new divListener());
	}
	
	class addListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			float a, b, c = 0;
			a = Float.parseFloat(t1.getText());
			b = Float.parseFloat(t2.getText());
			c = a + b;
			l3.setText("Addition is " + c);
		}
		
	}

	class subListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			float a, b, c = 0;
			a = Float.parseFloat(t1.getText());
			b = Float.parseFloat(t2.getText());
			c = a - b;
			l3.setText("Subtraction is " + c);
		}
		
	}
	class multListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			float a, b, c = 0;
			a = Float.parseFloat(t1.getText());
			b = Float.parseFloat(t2.getText());
			c = a * b;
			l3.setText("Multiplication is " + c);
		}
		
	}
	class divListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			float a, b , c = 0;
			a = Float.parseFloat(t1.getText());
			b = Float.parseFloat(t2.getText());
			try {
				c = a / b;
			}
			catch(ArithmeticException ex) {
				l3.setText("Error");
			}
			l3.setText("Division is " + c);
		}
		
	}
	
}
