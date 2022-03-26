package practice;

class Ameet {
	void meth(double sal) {
		System.out.println(sal);
	}

	void meth(double sal, double tax) {
		System.out.println(sal + tax);
	}

}

public class Main {
	public static void main(String[] args) {
		Ameet ameet = new Ameet();
		ameet.meth(1000);
		ameet.meth(1000, 10);
	}

}
