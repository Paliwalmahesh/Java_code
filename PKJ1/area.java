package PKJ1;

public class area {
	public static void main(String[] args) {
		double height_r=8,width_r=15,height_t=10,base_t=12, length=5,area_t,area_r,area_s;
		
	
		area_t=0.5*height_t*base_t;
		area_s=length*length;
		area_r=height_r*width_r;
		
		System.out.print("Area of triangle: ");
		System.out.println(area_t);
		System.out.print("Area of square: ");
		System.out.println(area_s);
		System.out.print("Area of Rectangle: ");
		System.out.println(area_r);
	}
	
	
	

}
