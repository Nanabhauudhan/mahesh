package practice;

class Mahesh1 extends Thread {
	@Override
	public void run() {
		System.out.println("");
	}
}

class Meet implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class Tread {
	public static void main(String[] args) {
		Mahesh1 m = new Mahesh1();
		m.start();
		Meet m2 = new Meet();
		Thread t = new Thread(m2);
		t.start();

	}
}
