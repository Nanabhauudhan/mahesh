package practice;

class Rahul4 extends Thread {
	@Override
	public void run() {
		System.out.println("thread" + Thread.currentThread().getName());

	}
}

public class Thread4 {
	public static void main(String[] args) {
		Rahul4 r1 = new Rahul4();
		r1.start();
	}
}
