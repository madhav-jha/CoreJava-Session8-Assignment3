package session8.assignment3;

public class TestDemoThread {

	public static void main(String[] args) {
		
		DemoThread t1 = new DemoThread();
		DemoThread t2 = new DemoThread();
		DemoThread t3 = new DemoThread();
		
		t1.setPriority(t1.MAX_PRIORITY);
		t2.setPriority(t2.NORM_PRIORITY);
		t3.setPriority(t3.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
