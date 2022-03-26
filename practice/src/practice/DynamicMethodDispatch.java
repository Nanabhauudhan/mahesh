package practice;

class Animal2 {
	void meth1() {
		System.out.println("Cat");
	}

}

class Dog2 extends Animal2 {
	@Override
	void meth1() {
		System.out.println("Donkey");
	}

	void meth2() {
		System.out.println("Monkey");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Animal2 animal = new Dog2();
		animal.meth1();

	}
}
