package practice;

import practice.Mahesha.Meet;

class Mahesha {
	class Meet {
		void meth() {
			System.out.println("Rahul");
		}
	}
}

public class Sm {
	public static void main(String[] args) {
		Mahesha m = new Mahesha();
		Mahesha.Meet mm = m .new Meet();
		mm.meth();

	}

}
