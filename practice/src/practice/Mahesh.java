package practice;

class A {
	int id;
}

class B extends A {
	void meth() {
		System.out.println(id);
	}
	
}
class C extends B{
	@Override
	void meth() {
	System.out.println("mahesh");
	}
}

public class Mahesh {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(10);
		C c=new C();
		c.meth();
		

	}

}
