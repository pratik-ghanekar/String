package practise;

public class palindrome {
	public static void main(String[] args) {
		String a="tree";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(a.equals(b)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome"); {		
			}
		}
	}

}
