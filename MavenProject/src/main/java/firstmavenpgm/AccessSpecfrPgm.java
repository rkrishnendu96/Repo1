package firstmavenpgm;

public class AccessSpecfrPgm {

	
		public  void display1() {
			System.out.println("this is public statement");
		}
		private  void display2() {
			System.out.println("this is private statement");
		}
		protected  void display3() {
			System.out.println("this is protected statement");
		}
		  void display4() {
			System.out.println("this is default statement");
		}
		 public static void main(String[] args) {
			 AccessSpecfrPgm obj=new AccessSpecfrPgm();
			 obj.display1();
			 obj.display2();
			 obj.display3();
			 obj.display4();
			 
	}

}
