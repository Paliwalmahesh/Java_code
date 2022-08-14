package PKJ1;

public class logical_op {

	public static void main(String[] args) {
		int a=10,b=15,c=20;
		if(b>c && b>a ) {
			System.out.println("The And operator condition satified");
		}
		else {
			System.out.println("The And operator condition not satified");
		}
		if(b>c || b>a ) {
			System.out.println("The one of OR operator condition satified");
		}
		else {
			System.out.println("The OR operator condition not satified");
		}

	}

}
