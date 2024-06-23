package abstraction;

public abstract class EmployeeAsssngmt6 {
	int payment;
	int time;
	public abstract void calculateSalary(int payment,int time);



public  void FullTimeEmployee() {
	
	int fulltimeSalary=this.payment*8;
	System.out.println("Fulltime Salary-"+fulltimeSalary);

}}