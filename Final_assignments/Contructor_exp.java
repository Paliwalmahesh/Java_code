package Final_assignments;
import java.util.*;
class sqr_shape{
 double lenght;
 sqr_shape(){
	 lenght=0;
 }
 sqr_shape(double a){
	 lenght=a;
 }
}

public class Contructor_exp {
	public static void main(String[] args) {
		
		Scanner obj =new Scanner(System.in);
		sqr_shape a=new sqr_shape();
		System.out.println(a.lenght);
		sqr_shape b=new sqr_shape(10);
		System.out.println(b.lenght);
		
		
		obj.close();

	}
	

}
