package sum;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sum2 extends JFrame  implements ActionListener{
   JTextField t1, t2, t3;
   JButton b;

  public static void main( String args[] )  { Sum2 app = new Sum2();  
      app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );  }

   public Sum2(){
     Container c=getContentPane();
     c.setLayout(new GridLayout(2,2));
     t1=new JTextField(10);     c.add(t1);
     t2=new JTextField(10);     c.add(t2);
     t3=new JTextField(10);     c.add(t3);
     b=new JButton("Calculate the sum");     c.add(b);
     b.addActionListener(this);
     setSize(275,100);  setVisible(true);
  }
    public void actionPerformed(ActionEvent e){ 
      String s1=t1.getText();
      double i1=Double.parseDouble(s1);
      String s2=t2.getText();
      double i2=Double.parseDouble(s2);
       t3.setText("sum="+(i1+i2)); 
       t3.setEditable(false);
    }
}

