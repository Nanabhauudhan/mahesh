package practice;

public class DoWhileLoopConcept {
	public static void main(String[] args) {
		int i = 1;
		do {
			try {
				Thread.sleep(600);
			}

			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			i++;
		} while (i <= 6);

	}
}
