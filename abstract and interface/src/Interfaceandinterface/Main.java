package Interfaceandinterface;

abstract class Mahesh {
	int a=889;
	void meth() {
		System.out.println("concrete/non-abstract method ");
	}

	abstract void method();// Abstract method  public abstract
}

class Nana extends Mahesh {

	@Override
	void method() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method from child class");

	}

}

public class Main {
	public static void main(String[] args) {
		Nana n = new Nana();
		n.meth();
		n.method();
		System.out.println(n.a);

	}
}
