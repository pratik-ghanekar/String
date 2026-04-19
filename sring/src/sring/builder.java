package sring;

public class builder {
	public static void main(String[] args) {
		String s="Hello ";
		StringBuilder sd = new StringBuilder(s);
		sd.append(" Java");
		System.out.println(sd);
		StringBuilder s1 = new StringBuilder(s);
		s1.insert(6, "Java ");
		System.out.println(s1);
		StringBuilder s2 = new StringBuilder("Hello");
		s2.reverse();
		System.out.println(s2);
		StringBuilder s3 = new StringBuilder("HelloWorld");
		s3.delete(2, 5);
		System.out.println(s3);
		String p = "madam";
		StringBuilder sb = new StringBuilder(p);

		if(p.equals(sb.reverse().toString())) {
		    System.out.println("Palindrome");
		} else {
		    System.out.println("Not Palindrome");
		}
	}

}
