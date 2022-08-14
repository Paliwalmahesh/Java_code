package pkgs_in;
import java.io.*;
public class File_read_write {
	 public static void main(String[] args) throws InterruptedException
	 {
	File in=new File("C:\\Users\\Mahesh Paliwal\\Desktop\\mahesh.txt");
	File out=new File("C:\\Users\\Mahesh Paliwal\\Desktop\\mahesh1.txt");
	FileReader ins=null;
	FileWriter outs=null;
	try {
		ins=new FileReader(in);
		outs=new FileWriter(out);
		int ch=0;
		while((ch=ins.read())!=-1) {
			outs.write(ch);
		}
		System.out.println("File 1 read and File 2 write Success...");
		
	}
	catch(IOException e) {
		System.out.println(e);
	}

	finally {
	   try {
		   ins.close();
		   outs.close();
	   }
	   catch(IOException e) {
		   System.out.println();
	   }
	}

}
	 
}
