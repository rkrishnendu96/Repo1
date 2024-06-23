package exception;

public class ThrowPgm {

	public static void main(String[] args) {
		int age = 6;
		if (age >= 18) {
			System.out.println("eligible for vote");
		} else {
			throw new ArithmeticException("invalid age entered");

		}
		// TODO Auto-generated method stub

	}

}
