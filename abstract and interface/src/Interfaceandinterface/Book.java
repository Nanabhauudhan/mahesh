package Interfaceandinterface;

interface Books {
	void meth();
}

class Books2 implements Books {
	@Override
	public void meth() {
		// TODO Auto-generated method stub
		System.out.println("bok2");

	}
}
interface A{ //tagging  interface
	
}
interface B1{
	
}

class B implements A,Books {
@Override
public void meth() {
	// TODO Auto-generated method stub
	
}
class C implements Books,A,B1{
	@Override
	public void meth() {
		// TODO Auto-generated method stub
		
	}
}
}


public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
