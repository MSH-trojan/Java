package thread;

public class ThreadTester {
	   public static void main( String args[] )   {
	      PrintThread thread1, thread2, thread3, thread4;       
	   
	      thread1 = new PrintThread( "thread1" );
	      thread2 = new PrintThread( "thread2" );
	      thread3 = new PrintThread( "thread3" );
	      thread4 = new PrintThread( "thread4" );
	      System.err.println( "\nStarting threads" ); 

	      // start executing PrintThreads
	      thread1.start();
	      thread2.start();
	      thread3.start();
	      thread4.start();
	      System.err.println( "Threads started\n" );
	   }
	}  // end class ThreadTester

	// Each object of this class picks a random sleep       // interval.  When a PrintThread executes, it prints its // name, sleeps, prints its name again, terminates.

	class PrintThread extends Thread {
	   private int sleepTime;

	   public PrintThread( String name )   {
	      super( name );
	      // sleep between 0 and 5 seconds
	      sleepTime = (int) ( Math.random() * 5000 );
	      // display name and sleepTime
	      System.err.println( "Name: " + getName() +   
	                         ";  sleep: " + sleepTime );
	    }

	   public void run() {
	       // put thread to sleep for a random interval

	      try {
	        System.err.println( getName() + " going to sleep" );
	        Thread.sleep( sleepTime );
	       }
	       // if thread interrupted during sleep, catch
	       //  exception and display error message

	       catch ( InterruptedException interruptedException ) {
	         System.err.println( interruptedException.toString() );
	       }

	       // print thread name
	       System.err.println( getName() + " done sleeping" );
	    }

	 }  // end class PrintThread
