package agregation;

public class AgregationPgm2 {
	String rank;
	int rollnumber;
	AgregationPgm1 add;  //agregation
	
	public AgregationPgm2(String rank, int rollnumber, AgregationPgm1 add) {
		
		this.rank=rank;
		this.rollnumber=rollnumber;
		this.add=add;
	}
	public void display() {
		System.out.println(rank+" "+rollnumber);
		System.out.println(add.name+" "+add.pincode +" "+ add.city);    //refernce value.parent class variable 
	}

	public static void main(String[] args) {
		AgregationPgm1 obj= new AgregationPgm1("ammu",65848,"tvm");
		AgregationPgm2 obje= new AgregationPgm2("second",55,obj); // for invoking reference value pass previous class obj
		obje.display();
		

	}

}
