package abstraction;

public class AbstractionChild extends AbstractionParent {
	

	public static void main(String[] args) {
		AbstractionChild obj= new AbstractionChild();
		obj.display1();
		obj.display2();
		

	}

	@Override            // body of abstracted method
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("Java");
		
	}

}
