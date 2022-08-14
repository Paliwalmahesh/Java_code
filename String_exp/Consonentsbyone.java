package String_exp;

public class Consonentsbyone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="PICT";
	String s1="";
	
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		
		if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch== 'I'|| ch=='O' || ch=='U') {
				
			s1+=ch;
			
		}
		else {
			ch +=1;
			s1 +=ch;
		}
	}
	
	System.out.println(s1);

}}
