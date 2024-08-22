package thread;

public class ThreadExample extends Thread {
    
	int i;
	
	public void run() {

        for (int i = 0; i < 3; i++)
            
            try {
                sleep((int)(Math.random() * 5000)); // 5 secs
            } catch (InterruptedException e) { }
           System.err.println(i);
    }

    public static void main(String[] args) {
          new ThreadExample().start();   //create and start a no-name thread 
          new ThreadExample().start();
          System.out.println("Done");
    }
}

