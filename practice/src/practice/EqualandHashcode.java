package practice;

class KGF {
	String name;
	int id;

	public KGF(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "KGF [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KGF other = (KGF) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	//Both equal and hashcode method are used to compare the content of object are same or not
}

public class EqualandHashcode {
	public static void main(String[] args) {
		KGF k1 = new KGF("Rocky", 1);
		KGF k2 = new KGF("Rocky", 1);
      if (k1.equals(k2)) {
		System.out.println("both are same");
	}else {
		System.out.println("Not Same");
	}
	}

}
