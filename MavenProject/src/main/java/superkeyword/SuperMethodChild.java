package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
	public void display() {
		System.out.println("Sum is");
		super.add(25,88);
	}

	public static void main(String[] args) {
		SuperMethodChild obj= new SuperMethodChild();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
