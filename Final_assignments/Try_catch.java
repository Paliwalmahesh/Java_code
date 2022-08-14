package Final_assignments;
import java.util.Scanner;

public class Try_catch {
	static Scanner obj =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter numbers to divide");
		   int a= obj.nextInt();
    	   int b = obj.nextInt();
	       try 
	       { 
	    	   
	    	    
	    	
	    	   int div;
	       	   div= a/b;
	       	System.out.println(div);
		   }
	       catch (ArithmeticException e) 
	       {
	    	   System.out.println("Cannot divide by zero");
		   }

	       
	}

}
