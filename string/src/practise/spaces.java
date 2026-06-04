package practise;

public class spaces {
	public static void main(String[] args) {
		String a="the man";
		String result="";
		for(int i=0;i<a.length();i++) {
			char ch= a.charAt(i);
			
			if (ch != ' ') {
				result = result + ch;
			}
		}
		System.out.println(result);
	}

}
