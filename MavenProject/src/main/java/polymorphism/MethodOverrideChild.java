package polymorphism;

public class MethodOverrideChild extends MethodOverrideParent  {
	public void display() {
		System.out.println("Welcome to JAVA");
		super.display();
	}

	public static void main(String[] args) {
		MethodOverrideChild obj= new MethodOverrideChild();
		obj.display();
				
		// TODO Auto-generated method stub

	}

}
