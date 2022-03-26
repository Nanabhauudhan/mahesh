package practice;

class Parameter {
	int a;
	String name;

	@Override
	public String toString() {
		return "Parameter [a=" + a + ", name=" + name + "]";
	}

	public Parameter(int value1, String value2) {
		this.a = value1;
		this.name = value2;
	}

}

public class Constrctor {
	public static void main(String[] args) {
		Parameter parameter = new Parameter(1, "mahesh");
		System.out.println(parameter);

	}
}
