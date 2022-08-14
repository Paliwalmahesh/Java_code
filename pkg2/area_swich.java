package pkg2;
import java.util.Scanner;

public class area_swich {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	
		int a,x,y;
		do
		{
			
			double ans;
			System.out.println("Choose shape for calculating area\n1.Triangle\n2.Square\n3.Rectangle\n4.Circle\n5.exit");
			a=obj.nextInt();
			switch (a)
			{
				case 1:
					System.out.println("Enter base length");
					x=obj.nextInt();
					System.out.println("Enter height");
					y=obj.nextInt();
					ans=(x*y)/2;
					System.out.println("Area of Triangle is : "+ans);
					
					break;
					
				case 2:
					System.out.println("Enter length");
					x=obj.nextInt();
					ans=(x*x);
					System.out.println("Area of Square is : "+ans);
					
					break;
					
				case 3:
					System.out.println("Enter length");
					x=obj.nextInt();
					System.out.println("Enter width");
					y=obj.nextInt();
					ans=(x*y);
					System.out.println("Area of Rectangle is : "+ans);
					
					break;
					
				case 4:
					System.out.println("Enter radius");
					x=obj.nextInt();
					ans=(3.14*x*x);
					System.out.println("Area of Circlele is : "+ans);
					
					break;
				
				default:
					System.out.println("end of program");
			}
		}while(a!=5);

	

	}

}
