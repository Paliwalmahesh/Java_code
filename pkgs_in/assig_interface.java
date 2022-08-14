package pkgs_in;

interface Area{  
void find_Area();  
}

interface perimeter  extends Area {  
void find_perimeter();  
}

interface volume{  
void find_volume();  
}

// hierarchical inheritance 
class Rectangle implements Area{
	int lenght,bredth;
	 Rectangle(int a,int b) {
		lenght=a;
		bredth=b;
	}
	
	public void find_Area()
	{
		System.out.println("area of rectangle"+(lenght*bredth));
	}  
}

class triangle implements Area{
	int height,width;
	triangle(int a,int b) {
		height=a;
		width=b;
	}
	
	public void find_Area( )
	{
		System.out.println("area of triangle"+(0.5*height*width));
	}  
}

//implement class
class circle implements perimeter{
	int redius;
	circle(int a){
		redius=a;
	}
	
	public void find_perimeter() {
		System.out.println("perimeter of circle"+(2*3.14*redius));
		
	}
	
	public void find_Area( )
	{
		System.out.println("area of circle"+(3.14*redius*redius));
	}
	
}

//multiple inheritance 
class cube implements Area{
	int side;
	cube(int a){
		side=a;
		
	}
	public void find_Area( )
	{
		System.out.println("area of cube"+(side*side));
	}
	public void find_volume()
	{
		System.out.println("volume of cube"+(side*side*side));
	}
}

public class assig_interface {

	public static void main(String[] args) {
// hierarchical inheritance 
		Rectangle obj1 = new Rectangle(5,6);
		triangle obj2 =new triangle(5,6);
		obj1.find_Area();
		obj2.find_Area();		
//implement class
		circle obj3 =new circle(5);
		obj3.find_Area();
		obj3.find_perimeter();
//multiple inheritance
		cube obj4=new cube(5);
		obj4.find_Area();
		obj4.find_volume();
	}

}
