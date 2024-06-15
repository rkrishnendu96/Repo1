package superkeyword;

public class SuperVariableChild extends SuperVariableParent{
	String clr="red";
	
	public void display() {
		System.out.println(clr);
		System.out.println(super.clr);
	}

	public static void main(String[] args) {
		
		SuperVariableChild obj= new SuperVariableChild();
		obj.display();
		// TODO Auto-generated method stub

	}

}
