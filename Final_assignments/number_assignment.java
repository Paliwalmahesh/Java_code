package Final_assignments; 

import java.util.Scanner;

public class number_assignment {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int ch;
		do {
			System.out.println("\n1.factorial\n2.prime number\n3.Sum & avrage \n4.exit");
			
			ch = obj.nextInt();
			switch (ch)
			{
				case 1:
					System.out.println("enter number:");
					int num=obj.nextInt();
					long fact = 1;
			        for(int i = 1; i <= num; ++i)
			        {
			            fact *= i;
			        }
			        System.out.printf("Factorial of "+ num +"=" + fact);
					break;
				case 2:
					  System.out.println("enter number of prime numbers:");
					  int k=obj.nextInt(); 
				      int status = 1; 
				      int m = 2;
				      
				   
				      if (k>= 1) 
				      { 
				         System.out.println("First "+k+" prime numbers are:"); 
				     
				         System.out.println(2); 
				      } 
				 
				      for ( int i = 2 ; i <=k; ) 
				      { 
				         for ( int j = 2 ; j <= Math.sqrt(m) ; j++ ) 
				         { 
				            if ( m%j == 0 ) 
				            { 
				               status = 0; 
				               break; 
				            } 
				         } 
				         if ( status != 0 ) 
				         { 
				            System.out.println(m); 
				            i++; 
				         } 
				         status = 1; 
				         m++; }
					break;
				case 3:
					System.out.println("enter number:");
					int n=obj.nextInt();
					float sum=0,avg=0;
					
					for(int j =0;j<=n;j++) {
						
						sum=sum+j;
						
					}
					avg=sum/n;
					System.out.printf("sum of first "+ n +" is " + sum +"\n Average is  "+avg);
					
					break;
			
			
			}
		}while(ch!=4);

	}

	}


