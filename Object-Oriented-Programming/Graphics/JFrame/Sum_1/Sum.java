package sum_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sum extends JFrame  implements ActionListener {
JTextField t1, t2, t3;
JButton b;

public Sum() {
	super("Calculator");
	setSize(600,150);
	setVisible(true);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	t1=new JTextField(10);
	c.add(t1);
	t2=new JTextField(10);
	c.add(t2);
	t3=new JTextField(10);
	c.add(t3);
	b=new JButton("Calculate the sum");
	c.add(b);

	b.addActionListener(this);  // this means an object of the Sum type
}


public void actionPerformed(ActionEvent e) { 
	String s1=t1.getText();
	double i1=Double.parseDouble(s1);
	
	String s2=t2.getText();
	double i2=Double.parseDouble(s2);
	
	t3.setText("sum="+(i1+i2));     
}

public static void main( String args[] )   { 
	Sum application = new Sum();
	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

