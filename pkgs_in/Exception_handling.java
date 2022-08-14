package pkgs_in;

public class Exception_handling {

	public static void main(String[] args) {
		int div;
	       int a =0;
	       try 
	       { 
	       	div= a/0;
		   }
	       catch (ArithmeticException e) 
	       {
	    	   System.out.println("Cannot divide by zero");
		   }

	       
	}

}
