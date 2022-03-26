package practice;

import practice.Outer4.Inner4;

class Outer4 {
	static class Inner4 {
		static void meth5() {
			System.out.println("Mahesh");
		}

		void meth6() {
			System.out.println("Rahul");
		}
	}
}

public class Sl {
	public static void main(String[] args) {
		Outer4.Inner4 o = new Outer4.Inner4();
		o.meth6(); // step1
		Outer4.Inner4.meth5();// step2
		Inner4.meth5();// step 3

	}
}
