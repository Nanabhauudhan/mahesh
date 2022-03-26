package Interfaceandinterface;

interface Inte {
	int a = 788;// public static final

	void meth1();// abstract

	void meth2();// abstract
	void meth() ;
}

class Jam implements Inte {
	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Interface's method1");

	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Interface's method2");

	}

	@Override
	public void meth() {
		// TODO Auto-generated method stub
		
	}

}

public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jam j = new Jam();
		j.meth1();
		j.meth2();
		System.out.println(Inte.a);

	}

}
