package agregation;

public class AddressAssignmnt6 {
	String address;
	StudentAssignmnt6 ref;
	
	public AddressAssignmnt6(String address,StudentAssignmnt6 ref ) {
		this.address=address;
		this.ref= ref;
	}
	public void display() {
		System.out.println(ref.name);
		System.out.println(ref.rolnum);
		System.out.println(address);
	}

	public static void main(String[] args) {
		StudentAssignmnt6 obj= new StudentAssignmnt6("Ammu",25);
		AddressAssignmnt6 obje= new AddressAssignmnt6("Ammu Bhavan",obj);
		obje.display();
		
		
		// TODO Auto-generated method stub

	}

}
