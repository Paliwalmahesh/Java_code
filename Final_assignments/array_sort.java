package Final_assignments;
import java.util.Scanner;

public class array_sort {
	static Scanner obj = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr=new int[5];
    for(int k=0;k<5;k++) {
    	int a = 0;
			a=obj.nextInt();
			arr[k]=a;
    	
    }
    for (int i = 0; i < arr.length; i++)   
    {  
    for (int j = i + 1; j < arr.length; j++)   
    {  
    int tmp = 0;  
    if (arr[i] > arr[j])   
    {  
    tmp = arr[i];  
    arr[i] = arr[j];  
    arr[j] = tmp;  
    }  
    }  
    }
    for (int i = 0; i < arr.length; i++)   
    {       
    System.out.println(arr[i]);   
    }   

}
	}
