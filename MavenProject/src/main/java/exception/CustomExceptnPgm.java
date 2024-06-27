package exception;

public class CustomExceptnPgm {

	public void display(int age) throws InvalidException {

		if (age >= 18) {
			System.out.println("eligible for vote");
		} else {
			throw new InvalidException("invalid age entered");

		}
	}

	public static void main(String[] args) throws InvalidException {
		CustomExceptnPgm obj = new CustomExceptnPgm();
		obj.display(10);

	}

}
