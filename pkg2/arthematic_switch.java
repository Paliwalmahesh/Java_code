package pkg2;
import java.util.Scanner;
public class arthematic_switch {

	public static void main(String[] args) 
	{
		int ch;
		
		do {
			Scanner obj = new Scanner(System.in);
			System.out.println("enter the first number");
			int a= obj.nextInt();
			System.out.println("enter the secound number");
			int b= obj.nextInt();
			
		System.out.println("enter the number for performing operation of:-\n [1] addition\n "
					+ "[2] substraction\n [3] multiplication\n [4]division\n [5]Exit");
		
		ch=obj.nextInt();
		
		switch(ch)
		{
		  case 1:{ 
			       System.out.println("Addition is= "+ (a+b));
			       break;
		         }
		  case 2:{
			       System.out.println("substraction is= "+ (a-b));
			       break;
		         }
		  case 3:{
			       System.out.println("multiplication is= "+ (a*b));
		           break;
		         }
		  case 4:{
			       System.out.println("division is= "+ (a/b));
		           break;
		         }
		  case 5:{
			     
			       System.out.println("exit");
			       break;
		         } 
		        
		}
		}while(ch!=5);

	}
}
