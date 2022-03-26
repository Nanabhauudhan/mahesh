package practice;

class Animal {
	int id;
	String name;

	public Animal(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + "]";
	}

	void meth() {
		System.out.println(10);
		System.out.println("mahesh");
	}
}

public class Dog {
	public static void main(String[] args) {
		Animal a = new Animal(10, "nana");
		a.meth();
		System.out.println(a);
	}

}
