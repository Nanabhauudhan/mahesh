package practice;

class ParaMeth {
	int a;
	String name;

	public void method(int a, String name) {
		this.a = a;
		this.name = name;
		System.out.println(this.a+ " "+ this.name);
	

	}
	
}

public class ParameterisedMethod {
	public static void main(String[] args) {
		ParaMeth parameth = new ParaMeth();
		parameth.method(100, "meet");
	}
}
