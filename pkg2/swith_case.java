package pkg2;
import java.util.Scanner;
public class swith_case {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int ch,reverse=0;
		System.out.println("enter  number");
		int a= obj.nextInt();
		
		do {
		
			System.out.println("\n1.reverse\n2.Penlindrom\n3.Odd/Even\n4.prime\n5.exit");
			ch=obj.nextInt();
			switch (ch)
			{
				case 1:
					int number=a;
					while(number != 0)   
					{  
					int remainder = number % 10;  
					reverse = reverse * 10 + remainder;  
					number = number/10;  
					}
					System.out.println("The reverse of the given number is: " + reverse);  
					break;
					
				case 2:
					if(a==reverse) {
						
						System.out.println("number is pelindrome");
					}
					else {
						System.out.println("number is pelindrome");
					}
					
					break;
					
				case 3:
					
				    if ( a % 2 == 0 ) {
				        System.out.println(a+" number is even");
				        }
				     else {
				        System.out.println(a+" number is odd");}
					break;
					
				case 4:
					int i,m=0,f=0;      
					
					  m=a/2;      
					  if(a==0||a==1)
					  {  
					   System.out.println(a+" is not prime number");      
					  }
					  else
					  {  
						  for(i=2;i<=m;i++)
						  {      
							  if(a%i==0)
							 {      
								  System.out.println(a+" is not prime number");      
								  f=1;      
								  break;      
							  	}      
						  } 
					  
						  if(f==0)
						  {
						   System.out.println(a+" is prime number"); 
						  }  
					  }
					
					break;
				case 5:
					System.out.println("exiting!!");
					break;
				default:
					System.out.println("invalid!!");
			
			
			}
		}while(ch!=5);
	}
}
