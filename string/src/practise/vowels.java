package practise;
import java.util.Scanner;
public class vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine().toLowerCase();
		int v=0;
		int c=0;
		for(int i=0;i<str.length();i++) {
			 char ch=str.charAt(i);
			 if (ch >='a' && ch<='z') {
				 if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
					 v++;
				 else
					 c++;
			 }
		}
		System.out.println("vowels="+v);
		System.out.println("constants="+c);
	}
}
