package inheritance;

public class HierInheri3 extends HierInheri1 {
	public void print3() {
		System.out.println("child C");
	}

	public static void main(String[] args) {
		HierInheri3 obj=new HierInheri3();
		obj.print1();
		obj.print3();
		

	}

}
