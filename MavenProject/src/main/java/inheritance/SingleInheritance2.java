package inheritance;

public class SingleInheritance2 extends SingleInheritance1  {  //extend applied
	public void print()
	{
		System.out.println("Welcome to Child");
	}

	public static void main(String[] args) {
		SingleInheritance2 obj= new SingleInheritance2();
		obj.display();   // call the parent
		obj.print();
		
	}

}
