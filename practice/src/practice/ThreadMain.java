package practice;

class Mahesh10 implements Runnable {
	@Override
	public void run() {
		Thread.currentThread().setName("  MaheshThread");
		System.out.println("Thread" + Thread.currentThread().getName());
		// Thread.currentThread().setDaemon(true); // if you call the setDaemon()
		// method after starting the thread it would throw illegalThreadStateException
		System.out.println("check if its daemon thread: " + Thread.currentThread().isDaemon());
		Thread.currentThread().setPriority(5);
		System.out.println("Thread" + Thread.currentThread().getPriority());

	}
}

public class ThreadMain {
	public static void main(String[] args) {
		Mahesh10 m10 = new Mahesh10();
		Thread t10 = new Thread(m10);
		t10.start();
	}
}
