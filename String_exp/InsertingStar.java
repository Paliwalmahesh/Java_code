package String_exp;

public class InsertingStar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="PICT";
		String S1="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
		    if (i==s.length()-1) {
		    	S1 +=ch;
		    }
		    else {
		    	
		    	S1 +=ch + "_";
		    }
		}
		
		System.out.println(S1);
}

}
