package session8.assignment3;

public class DemoThread extends Thread {

	@Override
	public void run() {
		
		
		System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());
		//System.out.println(Thread.currentThread().getPriority());
		System.out.println("Thread has been invoked");
		
	}

}
