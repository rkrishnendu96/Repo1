package inheritance;

public class HierInheri2 extends HierInheri1 {
	public void print2() {
		System.out.println("child B");
	}

	public static void main(String[] args) {
		HierInheri2 obj=new HierInheri2();
		obj.print1();
		obj.print2();
		

	}

}
