package pkg3;
import java.util.Scanner;
public class string_reverse {
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			System.out.println("Enter String: ");
			String name=s.next();
			StringBuilder input1 = new StringBuilder();
			 input1.append(name);
			 input1.reverse();
			 System.out.println("reverse of given string is "+ input1);
			 
	}
}

