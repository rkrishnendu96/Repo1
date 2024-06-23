package superkeyword;

public class SuperKeywordAssignmt6Child extends SuperKeywordAssignmt6 {
	public void divide() {
		super.add(10, 25);
		int d = sum % 10;
		if (d == 0) {
			System.out.println("The number is divisible by 10");
		} else {
			System.out.println("The number is not divisible by 10");
		}

	}

	public static void main(String[] args) {
		SuperKeywordAssignmt6Child obj = new SuperKeywordAssignmt6Child();
		obj.divide();
		System.out.println(obj.newAdd());

		// TODO Auto-generated method stub

	}

}
