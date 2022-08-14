package Final_assignments;
class moviebook {
	String name;
	int bookingn;
}
class totalpro extends Thread{
	int total=0;
	moviebook a=new moviebook();
	totalpro(moviebook a)
	 {
	 this.a=a;
	 }
	
	public void run(){
		synchronized(this){
		for(int i=0;i<a.bookingn;i++) {
			total=total+100;
		}
		this.notify();
		}
	}
}
public class thread_exp {
	 public static void main(String[] args) throws InterruptedException
	 {
		 moviebook a=new moviebook();
		 
		 a.bookingn=10;
		 totalpro p= new totalpro(a);
		 p.start();
		 synchronized(p) {
			 p.wait();
			 System.out.println("Total earning"+ p.total+"rs");
			 }
		 
	 }
}
