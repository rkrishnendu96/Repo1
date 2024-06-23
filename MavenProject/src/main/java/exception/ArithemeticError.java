package exception;

public class ArithemeticError {

	public static void main(String[] args) {
		// System.out.println("hai"); // will display
		int a = 5;
		int b = 0;
		try {
			int c = a / b;

			System.out.println(c);
		}

		/*catch (ArithmeticException d) {
			System.out.println("overcome");
			System.out.println(d);     // variable created for catch

		}*/

		finally {
			System.out.println("errorfree");

		}

	}

}
