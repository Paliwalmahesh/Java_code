package pkg_assig3;
import java.util.Scanner;
public class Assign3 {
	public  void main (String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Rectangle: ");
		Rect r1=new Rect();
		r1.get_length();
		r1.get_width();
		r1.get_area();
		r1.get_color();
		System.out.println("Second Rectangle: ");
		Rect r2=new Rect();
		r2.get_length();
		r2.get_width();
		r2.get_area();
		r2.get_color();
		if(r1.area==r2.area && r1.color.equals(r2.color))
		{
			System.out.println("Matching Rectangle ");
		}
		else
		{
			System.out.println("Non Matching Rectangle ");
		}		          
	}
}
	class Rect
	{
		public double width,length,area;
		public String color;
		public Scanner sc=new Scanner(System.in);
		public void get_length()
		{
			System.out.print("Enter the length: ");
			length=sc.nextDouble();
		}
		public void get_width()
		{
			System.out.print("Enter the width: ");
			width=sc.nextDouble(); 
		}
		public void get_area()
		{
			area=length*width;
			System.out.println("Area of Rectangle: "+area);
		}
		public void get_color()
		{
			System.out.print("Enter the color: ");
			color=sc.next();
		}
	}

