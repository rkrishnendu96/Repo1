package interfaceee;

public class MultipleInheritanceChild implements MultipleInheritanceInterface1,MultipleInheritanceInterface2 {

	public static void main(String[] args) {
		MultipleInheritanceChild obj = new MultipleInheritanceChild();
		obj.display1();
		obj.display2();
		obj.display3();
		// TODO Auto-generated method stub

	}
	public void display3() {
		System.out.println("child c");
	}

	@Override
	public void display2() {
		System.out.println("parent B");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display1() {
		System.out.println("parent A");
		// TODO Auto-generated method stub
		
	}

}
