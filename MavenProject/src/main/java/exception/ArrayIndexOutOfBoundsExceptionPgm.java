package exception;

public class ArrayIndexOutOfBoundsExceptionPgm {

	public static void main(String[] args) {
		int[] array= new int [5];
		try { 
			array[10]=45;
		}
		catch (ArrayIndexOutOfBoundsException q){
			System.out.println("overcome");
			
		}
		finally {
			System.out.println("print");
			
		}
		
		// TODO Auto-generated method stub

	}

}
