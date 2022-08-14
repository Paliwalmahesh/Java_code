package Final_assignments;
import java.util.Scanner;

public class matrix_opration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Enter the element of matrix A : ");
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Enter the element of matrix B : ");
				b[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("The addition of two matrix are: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.print(c[i][j]+"\t");
			}
			System.out.println('\n');

	}

}
	}
