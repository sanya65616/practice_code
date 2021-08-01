
import java.awt.*;
import java.awt.event.*;

public class Form {
	Frame frame;
	//JPanel panel;
	Label firstName, lastName, age, gender, collegeName, place, language, submitted;
	Button submit;
	TextField field1, field2, field3, field4;
	TextArea area;
	Choice setPlace;
	 
	public static void main(String[] args) {
		Form form = new Form();
		form.go();
	}
	
	public void go() {
		frame = new Frame("Form Filling");
		//panel = new JPanel();
		
		firstName = new Label("First Name: ");
		firstName.setBounds(50, 50, 100, 50);
		field1 = new TextField();
		field1.setBounds(150, 60, 250, 25);
		field1.addActionListener(new Field1Listener());
		field1.selectAll();
		lastName = new Label("Last Name: ");
		lastName.setBounds(500, 50, 100, 50);
		field2 = new TextField();
		field2.setBounds(600, 60, 250, 25);
		field2.addActionListener(new Field2Listener());
		field2.selectAll();
		age = new Label("Age: ");
		age.setBounds(50, 110, 100, 50);
		field3 = new TextField();
		field3.setBounds(150, 120, 70, 25);
		field3.addActionListener(new Field3Listener());
		field3.selectAll();
		gender = new Label("Gender: ");
		gender.setBounds(50, 160, 100, 50);
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox gender1 = new Checkbox("Male", cbg, false);
		gender1.setBounds(150, 160, 50, 50);
		gender1.addItemListener(new Gender1Listener());
		Checkbox gender2 = new Checkbox("Female", cbg, false);
		gender2.setBounds(250, 160, 50, 50);
		gender2.addItemListener(new Gender2Listener());
		Checkbox gender3 = new Checkbox("Other", cbg, false);
		gender3.setBounds(350, 160, 50, 50);
		gender3.addItemListener(new Gender3Listener());
		collegeName = new Label("College Name: ");
		collegeName.setBounds(50, 210, 100, 50);
		area = new TextArea();
		area.setBounds(150, 220, 400, 50);
		place = new Label("Place: ");
		place.setBounds(50, 270, 50, 50);
		setPlace = new Choice();
		setPlace.setBounds(150, 285, 150, 75);
		setPlace.add("Andhra Pradesh");
		setPlace.add("Arunachal Pradesh");
		setPlace.add("Assam");
		setPlace.add("Bihar");
		setPlace.add("Chhattisgarh");
		setPlace.add("Goa");
		setPlace.add("Gujarat");
		setPlace.add("Haryana");
		setPlace.add("Himachal Pradesh");
		setPlace.add("Jammu and Kashmir");
		setPlace.add("Jharkhand");
		setPlace.add("Karnataka");
		setPlace.add("Kerala");
		setPlace.add("Madya Pradesh");
		setPlace.add("Maharashtra");
		setPlace.add("Manipur");
		setPlace.add("Meghalaya");
		setPlace.add("Mizoram");
		setPlace.add("Nagaland");
		setPlace.add("Orissa");
		setPlace.add("Punjab");
		setPlace.add("Rajasthan");
		setPlace.add("Sikkim");
		setPlace.add("Tamil Nadu");
		setPlace.add("Telagana");
		setPlace.add("Tripura");
		setPlace.add("Uttaranchal");
		setPlace.add("Uttar Pradesh");
		setPlace.add("West Bengal");
		language = new Label("Choose Language");
		language.setBounds(50, 330, 200, 50);
		Checkbox checkbox1 = new Checkbox("C");
		checkbox1.setBounds(100, 370, 50, 50);
		checkbox1.addItemListener(new Checkbox1Listener());
		Checkbox checkbox2 = new Checkbox("C++");
		checkbox2.setBounds(100, 410, 50, 50);
		checkbox2.addItemListener(new Checkbox2Listener());
		Checkbox checkbox3 = new Checkbox("JAVA");
		checkbox3.setBounds(100, 460, 50, 50);
		checkbox3.addItemListener(new Checkbox3Listener());
		Checkbox checkbox4 = new Checkbox("HTML");
		checkbox4.setBounds(100, 510, 50, 50);
		checkbox4.addItemListener(new Checkbox4Listener());
		Checkbox checkbox5 = new Checkbox("PHP");
		checkbox5.setBounds(100, 560, 50, 50);
		checkbox5.addItemListener(new Checkbox5Listener());
		Checkbox checkbox6 = new Checkbox("JavaScript");
		checkbox6.setBounds(100, 610, 100, 50);
		checkbox6.addItemListener(new Checkbox6Listener());
		
		submit = new Button("Submit");
		submit.setBounds(80, 670, 80, 30);
		submit.addActionListener(new ButtonListener());
		submitted = new Label("");
		
		//frame.add(panel);
	    frame.add(firstName);
	    frame.add(field1);
	    frame.add(lastName);
	    frame.add(field2);
	    frame.add(age);
	    frame.add(field3);
	    frame.add(gender);
	    frame.add(gender1);
	    frame.add(gender2);
	    frame.add(gender3);
	    frame.add(collegeName);
	    frame.add(area);
	    frame.add(place);
	    frame.add(setPlace);
		frame.add(language);
		frame.add(checkbox1);
		frame.add(checkbox2);
		frame.add(checkbox3);
		frame.add(checkbox4);
		frame.add(checkbox5);
		frame.add(checkbox6);
		frame.add(submit);
		frame.add(submitted);
		
		frame.setSize(700, 700);
		frame.setLayout(null);
        frame.setVisible(true);
		
	}
	
	class Field1Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(field1.getText());
		}
	}
	class Field2Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(field2.getText());
		}
		
	}
	class Field3Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(field3.getText());
		}
		
	}
	class Gender1Listener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			e.getStateChange();
		}
		
	}
	class Gender2Listener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			e.getStateChange();
		}
		
	}
	class Gender3Listener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			e.getStateChange();
		}
		
	}
	class Checkbox1Listener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			e.getItemSelectable();
		}
		
	}
	class Checkbox2Listener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			e.getItemSelectable();
		}
		
	}
	class Checkbox3Listener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			e.getItemSelectable();
		}
		
	}
	class Checkbox4Listener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			e.getItemSelectable();
		}
		
	}
	class Checkbox5Listener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			e.getItemSelectable();
		}
		
	}
	class Checkbox6Listener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			e.getItemSelectable();
		}
		
	}
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			submitted.setText("Form Submitted");
		}
	}

}
