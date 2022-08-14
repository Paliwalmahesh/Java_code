package pkg2;
import java.util.Scanner;

public class scanner_class {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int a;
		System.out.println("Enter Integer");
		a=obj.nextInt();
		System.out.println("a = "+a);
		
		float b;
		System.out.println("Enter Float");
		b=obj.nextFloat();
		System.out.println("b = "+b);
}
}