package Operators.com;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Exception Concepts in java");
		
		int a = 10;
		int b = 0;
		try {
		int c = a/b;
		System.out.println(c);
		}
		
		
		catch(ArithmeticException ae) {
			//ae.printStackTrace(); --------------->method 1 is shown on exception name, reason,
			                                      //line number,method,class,programmer name.---printStackTrace is predefined
			
		//	System.out.println(ae.toString());  //---------> method 2 is shown an exception name,reason----toString is predefinrd
			
			//System.out.println(ae.getMessage());  //-----------> method 3 is shown on reason only -----getmessage is predefined
			
			System.out.println("You can not divide a number with 0"); //this is a userdefinrd or programmer
		}
		
		
		finally {
			System.out.println("THIS IS A TRY_CATCH_FINALLY IN EXCEPTION");
		}
		
		System.out.println(a);
		System.out.println(b);
	
		
		
		System.out.println("Hi Hlo Today Concepts is end lets pracices on own");

	}

}
