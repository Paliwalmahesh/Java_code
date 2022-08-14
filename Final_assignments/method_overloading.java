package Final_assignments;
import java.util.Scanner;

class area{
	public int calculate(int a,int b) {
		return (a*b);
	}
	public int calculate(int a) {
		return (a*a);
	}

	public double calculate(float b, float h){  
	    return (0.5*b*h);
	}
	public double calculate(int a, int b, int h){  
	    return ((a+b)*h*0.5);
	}
	public double calculate(float r){ 
	    return (3.14*r*r);
	}
}

public class method_overloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner obj = new Scanner(System.in);
		do {
		System.out.println("Select number to perform area of:\n1.Circle \n2.Rectangle \n3.Square \n4.Regular Triangle\n5.Trapezoid\n6.exit");
		ch=obj.nextInt();
		area a= new area();
		
		switch(ch)
		{
		  case 1:{ 
			  	System.out.println("enter the radius of circle");
			  	float r;
			  	double ans;
			  	r=obj.nextFloat();
			  	ans=a.calculate(r);
			  	System.out.println("Area of circle is : "+ans);
			   
			       break;
		         }
		  case 2:{
			  System.out.println("enter the lenght & breadth of Rectangle");
			  	int l,b;
			  	int ans;
			  	l=obj.nextInt();
			  	b=obj.nextInt();
			  	ans=a.calculate(l,b);
			  	System.out.println("Area of Rectangle is : "+ans);
			       break;
		         }
		  case 3:{
			  System.out.println("enter the lenght of Square");
			  	int l;
			  	int ans;
			  	l=obj.nextInt();
			  	ans=a.calculate(l);
			  	System.out.println("Area of Square is : "+ans);
		           break;
		         }
		  case 4:{
			  System.out.println("enter the bace & height of Regular Triangle");
			  	float b,h;
			  	double ans;
			  	b=obj.nextFloat();
			  	h=obj.nextFloat();
			  	ans=a.calculate(b,h);
			  	System.out.println("Area of Triangle is : "+ans);
		           break;
		         }
		  case 5:{
			  System.out.println("enter the lenght,base & height  of Trapezoid");
			  	int l,b,h;
			  	double ans;
			  	l=obj.nextInt();
			  	b=obj.nextInt();
			  	h=obj.nextInt();
			  	ans=a.calculate(l,b,h);
			  	System.out.println("Area of Trapezoid is : "+ans);
	           break;
	         }
		  case 6:{
			     
			       System.out.println("exit");
			       break;
		         } 
		        
		}
		}while(ch!=6);
		 obj.close();
	}
	
 
	}


