package inheritance;

public class MultilevelInheri3 extends multilevelInheri2  {
	public void display3() {
		System.out.println("class C");
	}

	public static void main(String[] args) {
		MultilevelInheri3 obj= new MultilevelInheri3();
		obj.display1();
		obj.display2();
		obj.display3();
		

	}

}
