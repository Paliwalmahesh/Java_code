package String_exp;


public class ReplacingInttoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PI4C3T";
		String s1="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='1' || ch=='2'|| ch=='3'|| ch=='4'|| ch=='5') {
				ch='-';
				s1+=ch;
			}
			else {
				s1+=ch;
			}
			
		}
		
		System.out.println(s1);

	}

	}


