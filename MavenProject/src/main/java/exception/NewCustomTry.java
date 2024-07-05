package exception;

public class NewCustomTry {
	
	public void show(int a) throws ErrorAgeException
	{
		if(a>25)
		{
			System.out.println("valid");
		}
		else
		{
			throw new ErrorAgeException("failed statemnet");
		}
	}

	public static void main(String[] args) throws ErrorAgeException {
		NewCustomTry obj= new NewCustomTry();
		obj.show(1);
		// TODO Auto-generated method stub

	}

}
