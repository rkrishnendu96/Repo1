package inheritance;

public class Assignmt5Child extends Assignmt5Parent2 {
	
	public void display3() {

		int totalsalary = basicpay + hra - pf - deduction + bonus;

		System.out.println("SALARY SLIP");
		System.out.println("BASIC PAY -" + " " + basicpay);
		System.out.println("DEDUCTION -" + " " + deduction);
		System.out.println("hra -" + " " + hra);
		System.out.println("pf -" + " " + pf);
		System.out.println("BONUS -" + " " + bonus);
		System.out.println("Total Salary -" + " " + totalsalary);
	}

	public static void main(String[] args) {
		Assignmt5Child obj = new Assignmt5Child();
		obj.display1();
		obj.display2();
		obj.display3();

	}

}
