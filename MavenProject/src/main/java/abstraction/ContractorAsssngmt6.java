package abstraction;

public class ContractorAsssngmt6 extends EmployeeAsssngmt6 {

	public static void main(String[] args) {
		ContractorAsssngmt6 obj= new ContractorAsssngmt6();
		obj.calculateSalary(800, 5);
		obj.FullTimeEmployee();
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateSalary(int payment, int time) {
		this.payment=payment;
		int contrctrSal= payment*time;
		System.out.println("Contractor Salary-"+contrctrSal);
		
		// TODO Auto-generated method stub
		
	}

	

}
