package practice;

class Rahul {
	class Nana {
		void meth() {
			System.out.println("meet");
		}
	}
}

public class Main2 {
	public static void main(String[] args) {
		Rahul r = new Rahul();
		Rahul.Nana n = r.new Nana();
		n.meth();
	}
}
