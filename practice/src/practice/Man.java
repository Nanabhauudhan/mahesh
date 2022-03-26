package practice;

public class Man {
	

	public static void main(String[] args) {
for(int i=1; i<=10; i++) {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(i);
}
	}

}
