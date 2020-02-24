package thread;

public class ThreadExample extends Thread{
	
	public int count =0;
	
	public void run() {
		System.out.println("Runnable thread starting");
		
		try {
			while (count<5) {
				Thread.sleep(500);
				count++;
				System.out.println(count);
			}
		}catch(InterruptedException e) {
			System.out.println("Runnable thread interrupted "+e);
		}
		finally {
				System.out.println("Runnable thread terminating");
		}
	}
}
