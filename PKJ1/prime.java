package PKJ1;

public class prime {

	public static void main(String[] args) {
		  int i,m=0,f=0;      
		  int n=7; 
		  m=n/2;      
		  if(n==0||n==1)
		  {  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
			  for(i=2;i<=m;i++)
			  {      
				  if(n%i==0)
				 {      
					  System.out.println(n+" is not prime number");      
					  f=1;      
					  break;      
				  	}      
			  }      
			  if(f==0)
			  {
			   System.out.println(n+" is prime number"); 
			  }  
		   }
		  
		}

}
