package Assignment1;
import java.util.concurrent.*;
// share on slack
public class threadingExample {
	volatile static int count = 0;
	static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s %d%n",threadName, message, count);
    }
	static void incrementCallCount() {
		count++;
		String threadName = Thread.currentThread().getName();
        System.out.format("%s: %d%n",threadName, count);
	}
	private static class MessageLoop implements Runnable {
		public void run() {
	        String importantInfo[] = {
	            "Mares eat oats",
	            "Does eat oats",
	            "Little lambs eat ivy",
	            "A kid will eat ivy too"
	        };
	        try {
	            for (int i = 0;
	                 i < importantInfo.length;
	                 i++) {
	                // Pause for 4 seconds
	                Thread.sleep(4000);
	                // Print a message
	                incrementCallCount();
	                threadMessage(importantInfo[i]);
	            }
	        } catch (InterruptedException e) {
	            threadMessage("I wasn't done!");
	        }
    	}
	}
	 public static void main(String args[]) throws InterruptedException {
		        long patience = 10000;
		        if (args.length > 0) {
		            try {
		                patience = Long.parseLong(args[0]) * 1000;
		            } catch (NumberFormatException e) {
		                System.err.println("Argument must be an integer.");
		                System.exit(1);
		            }
		        }
		        threadMessage("Starting MessageLoop thread");
		        long startTime = System.currentTimeMillis();
		        Thread t = new Thread(new MessageLoop());
		        t.start();
		        Thread t2 = new Thread(new MessageLoop());
		        t2.start();
		        threadMessage("Waiting for MessageLoop thread to finish");
		        while (t.isAlive()) {
		            threadMessage("Still waiting...");
		            t.join(1000);
		            if (((System.currentTimeMillis() - startTime) > patience)
		                  && t.isAlive()) {
		                threadMessage("Tired of waiting!");
		                t.interrupt();
		                t.join();
		            }
		        }
		        threadMessage("Finally!");
		    }
}