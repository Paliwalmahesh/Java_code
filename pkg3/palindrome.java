package pkg3;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args)
	{
//		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String: ");
		String name=s.next();
	
	    StringBuilder pd=new StringBuilder(name);  
	    pd.reverse();  
	     
	    if(name.equals(pd.toString())){  
	    	System.out.println("String is pelindrome");
	     
	    }else{  
	    	System.out.println("String is Not pelindrome");
	    }
}
	

}
