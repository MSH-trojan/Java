package animation;

import javax.swing.*;
import java.awt.*;

public class Anim extends JFrame implements Runnable {
    int position = 10, inc = 3;
    int time = 40;
    Thread t;
    MyPanel panel;

    public Anim() {
        super("Animation");
        setSize(200, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new MyPanel();
        
        add(panel);
        setVisible(true);

        if (t == null) {
            t = new Thread(this);
            t.start();
        }
       
       
    }

    public static void main(String[] args) {
        Anim application = new Anim();
    }

    
    class MyPanel extends JPanel {
        
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.red);
            g.fillOval(position + 10 ,  position + 10,   30, 30);
            
        }
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            position += inc;
            if (position > 100 || position < 10)
                inc = -inc;
            panel.repaint();  
        }
    }
}
