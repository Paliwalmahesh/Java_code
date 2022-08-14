package PKJ1;

import java.util.Scanner;
import pkg_i.*;
import pkg2.sample2;

public class simple_calc {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int a;
	do
	{
		
		double ans;
		System.out.println("Choose  for calculating \n1.add\n2.sub\n3.multiply\n4.divide\n5.exit");
		a=obj.nextInt();
		switch (a)
		{
			case 1:
				Sample oba = new Sample();  
				   oba.add();
				
				break;
				
			case 2:
				Sample obb = new Sample();  
				   obb.Sub();
				
				break;
				
			case 3:
				sample2 obc = new sample2();  
				   obc.Mul();
				
			
				
				break;
				
			case 4:
				sample2 obd = new sample2();  
				   obd.Div();
				
				
				break;
			
			default:
				System.out.println("end of program");
		}
	}while(a!=5);

	}
}
