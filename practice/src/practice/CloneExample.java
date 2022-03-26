package practice;
class Bajhi_Rao_Singham implements Cloneable{//1 implement cloneable
	int id;;
	String name;
	
	public Bajhi_Rao_Singham(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bajhi_Rao_Singham [id=" + id + ", name=" + name + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {//2 ovveriding the clone method
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method 
		Bajhi_Rao_Singham b=new Bajhi_Rao_Singham(23,"Bajhi Rao");
		Bajhi_Rao_Singham bb;
		bb=(Bajhi_Rao_Singham)b.clone();
		System.out.println(bb);

	}

}
