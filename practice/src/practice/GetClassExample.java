package practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Baahubali{
	int id=67;
	int age;
	double salary;
	public Baahubali(int age, double salary) {
		this.age = age;
		this.salary = salary;
	}
public Baahubali(int f) {
	// TODO Auto-generated constructor stub
}
	public void meth() {
		System.out.println("hikj");
	}
	
}
public class GetClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baahubali b=new Baahubali(25, 100000);
		System.out.println(b.getClass().getName());
		Method m[]=b.getClass().getMethods();
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		Field f[]=b.getClass().getFields();
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		Constructor[] c=b.getClass().getConstructors();
		//          1     1<2          i+1
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		

	}

}
