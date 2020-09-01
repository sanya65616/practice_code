import javax.swing.*;
import java.lang.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class RomanConvertor {
	JFrame frame;
	JPanel panel;
	JTextField field;
	JLabel label1,label2;
	Button button;
	
	public static void main(String[] args) {
	RomanConvertor roman = new RomanConvertor();
	roman.go();
	}
	
	public void go() {
	  frame = new JFrame();
	  panel = new JPanel();
	  label1 = new JLabel("Enter the Roman Number");
	  field = new JTextField("Enter the Roman Number",30);
	  button = new Button("Enter");
	  label2 = new JLabel("");
	  
	  field.setText("");
	  field.addActionListener(new FieldListener());
	  field.selectAll();
	  field.requestFocus();
	    
	  frame.add(panel);
	  panel.add(label1);
	  panel.add(field);
	  panel.add(button);
	  panel.add(label2);
	  
	  frame.getContentPane();
	  frame.setSize(300, 300);
	  frame.setVisible(true);
	  
	
	  button.addActionListener(new ButtonListener());
	}
	
	public class FieldListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			System.out.println(field.getText());
			
		}
	}
	
	
	public class ButtonListener implements ActionListener{
		int sum = 0, count = 0, pre = 0, result = 0, n = 0;
	
		
		public void actionPerformed(ActionEvent event) {
			
			
		
			String str = field.getText();
			for(int i = 0; i < str.length(); i++) {
				char c =str.charAt(i);
				 n = valueOf(c);
				if(pre < n) {
				if(pre == n)	
				count++;
				pre = n;
				if(count < 1) {
					 result = convertor(n);
				 label2.setText("Decimal number is "+result);
				}
				else
					label2.setText("Invalid Input");
					
			}
				if(pre >= n) {
				if(pre == n)
					count++;
				pre = n;
				if(count <3) {
					 result = convertor(n);
				 label2.setText("Decimal number is "+result);
				}
				else
					label2.setText("Invalid Inpur");
				}
			}
		}
	
		          
		   public int convertor(int n) {
			  
		    	if(sum>=n) 
		    	return convertor(n + sum);
		    	if(sum<n)
		    	return convertor(n - sum);
		    	else
				return -1;
		    		
		   }
			
		  
		
		


   public  int valueOf(char c) {
	  
	   switch(c) {
	   case 'I': return 1;
	   case 'V': return 5;
	   case 'X': return 10;
	   case 'L': return 50;
	   case 'C': return 100;
	   case 'D': return 500;
	   case 'M': return 1000;
	   default: return -1;
	   }
   }
	
	}
	}
