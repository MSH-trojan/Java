package wordframe;

import javax.swing.*;

import java.awt.*;


public class Words_Frame extends JFrame{

   public static void main(String[] args) {
      Words_Frame app = new Words_Frame();
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
   }   
      
   public Words_Frame() {
      super( "Words_Frame" );
      setSize(850,800);
      setVisible(true);
      
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );  
      Dictionary webster = new Dictionary();    
      String s = "Number of pages: " + webster.getPages() + "\n";
      s += "Number of definitions: " + webster.getDefinitions() + "\n";
      s += "Definitions per page: " + webster.computeRatio() +  "\n";
      JTextArea t1 = new JTextArea( s, 5, 20);
      container.add( new JScrollPane( t1 ) );  
      t1.setEditable(false);
   }
}

class Book {
   protected int pages = 1500;
   public void setPages(int numPages) {
      pages = numPages;
   }
   public int getPages() {
      return pages;
   }
}

class Dictionary {
	private Book bk;
	private int definitions = 52500;
	
	public Dictionary() {
		 bk = new Book();
	}
	
   public double computeRatio() {
      return (double) definitions/bk.getPages();
   }
   
   public void setDefinitions(int numDefinitions)   {
      definitions = numDefinitions;
   }
   
   public int getDefinitions()   {
      return definitions;
   }
   
   public int getPages() {
	   return bk.getPages();
   }
   
}  
