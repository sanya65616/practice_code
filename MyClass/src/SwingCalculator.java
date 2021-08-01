import javax.swing.*;
import java.awt.ComponentOrientation;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataValidationException;

import java.awt.*;
import java.awt.event.*;

public class SwingCalculator extends JFrame {
	JFrame frame;
	JPanel panel;
	JLabel label1,label2,label3;
	JTextField field1,field2;
	JButton add,sub,mult,div,mod;
	
	public SwingCalculator(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	public static void main(String[] args) {
	  SwingCalculator cal = new SwingCalculator("Calculator");
	  cal.go();
	}

    public void go() {
      frame = new JFrame();
      panel = new JPanel();
      
      
      label1 = new JLabel("Enter 1st number");
      label2 = new JLabel("Enter 2nd number");
      field1 = new JTextField();
      field2 = new JTextField();
      add = new JButton("Addition");
      sub = new JButton("Subtract");
      mult = new JButton("Multiply");
      div = new JButton("Divide");
      mod = new JButton("Module");
      label3 = new JLabel("");
      panel.setLayout(null);
      
      label1.setBounds(500, 120, 120, 20);
      field1.setBounds(640, 120, 100, 20);
      label2.setBounds(500, 170, 120, 20);
      field2.setBounds(640, 170, 100, 20);
      add.setBounds(380, 250, 100, 20);
      sub.setBounds(500, 250, 100, 20);
      mult.setBounds(620, 250, 100, 20);
      div.setBounds(740, 250, 100, 20);
      mod.setBounds(860, 250,100, 20);
      label3.setBounds(600, 320, 200, 20);

	  field1.setText("");
	  field1.addActionListener(new Field1Listener());
	  field1.selectAll();
	  field1.requestFocus();
	  field2.setText("");
	  field2.addActionListener(new Field2Listener());
	  field2.selectAll();
	  field2.requestFocus();
	  
      frame.add(panel);
      panel.add(label1);
      panel.add(field1);
      panel.add(label2);
      panel.add(field2);
      panel.add(add);
      panel.add(sub);
      panel.add(mult);
      panel.add(div);
      panel.add(mod);
      panel.add(label3);
      add.addActionListener(new addListener());
      sub.addActionListener(new subListener());
      mult.addActionListener(new multListener());
      div.addActionListener(new divListener());
      mod.addActionListener(new modListener());
    
      frame.getContentPane();
      frame.setSize(400, 500);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     class Field1Listener implements ActionListener{
    	 public void actionPerformed(ActionEvent event) {
    		 System.out.println(field1.getText());
    	 }
     }
     
     class Field2Listener implements ActionListener{
    	 public void actionPerformed(ActionEvent event) {
    		 System.out.println(field2.getText());
    	 }
     }
    
    class addListener implements ActionListener {
    	public void actionPerformed(ActionEvent event) {
    	float a,b,s;
    	a = Float.parseFloat(field1.getText());
    	b = Float.parseFloat(field2.getText());
    	s = a+b;
    	label3.setText("sum is "+s);
    	}
    }
    
    class subListener implements ActionListener {
    	public void actionPerformed(ActionEvent event) {
    		float a,b,s;
    		a = Float.parseFloat(field1.getText());
    		b = Float.parseFloat(field2.getText());
    		s = a-b;
    		label3.setText("difference is "+s);
    	}
    }
    
    class multListener implements ActionListener {
    	public void actionPerformed(ActionEvent event) {
    		float a,b,s;
    		a = Float.parseFloat(field1.getText());
    		b = Float.parseFloat(field2.getText());
    		s = a*b;
    		label3.setText("Multiplication is "+s);
    	}
    }
    
    class divListener implements ActionListener {
    	public void actionPerformed(ActionEvent event) {
    		float a,b,s=0;
    		a = Float.parseFloat(field1.getText());
    		b = Float.parseFloat(field2.getText());
    		
    		try {
    			s = a/b;
    		}
    		catch(ArithmeticException ex) {
    			label3.setText("Error");
    		}
    		label3.setText("division is "+s);
    	}
    }
    
    class modListener implements ActionListener {
    	public void actionPerformed(ActionEvent event) {
    		float a,b,s=0;
    		a = Float.parseFloat(field1.getText());
    		b = Float.parseFloat(field2.getText());
    		
    		try {
    			s = a%b;
    		}
    		catch(ArithmeticException ex) {
    			label3.setText("Error");
    		}
    		label3.setText("Remainder is "+s);
    	}
    }
   
}
	

