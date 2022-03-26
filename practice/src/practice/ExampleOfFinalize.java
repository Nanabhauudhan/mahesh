package practice;
class Student{
	String name;
	int id;
	String address;
	public Student(String name, int id, String address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("this is called before the object get deleted");
	}
	
}
public class ExampleOfFinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("King", 78, "vasai");
		System.out.println(s);
	s=null;
		System.gc();
		

	}

}
