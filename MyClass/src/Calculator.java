import javax.swing.*;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataValidationException;

import java.awt.*;
import java.awt.event.*;

public class Calculator {
	JFrame frame;
	JPanel panel;
	JLabel label1,label2,label3;
	JTextField field1,field2;
	Button add,sub,mult,div,mod;
	
	public static void main(String[] args) {
	  Calculator cal = new Calculator();
	  cal.go();
	}

    public void go() {
      frame = new JFrame();
      panel = new JPanel();
      
      
      label1 = new JLabel("Enter 1st number");
      label2 = new JLabel("Enter 2nd number");
      field1 = new JTextField(30);
      field2 = new JTextField(30);
      add = new Button("Add");
      sub = new Button("Subtract");
      mult = new Button("Multiply");
      div = new Button("Divide");
      mod = new Button("Module");
      label3 = new JLabel("");

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
      frame.setSize(300, 300);
      frame.setVisible(true);
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
	

