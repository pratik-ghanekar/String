package sring;

public class simplestring {
   public static void main(String[] args) {
	
	   String s ="java";
	   String p= "java";
	   
	   for(int i = 0; i < s.length(); i++) {
		    System.out.println(s.charAt(i));
		}
	   System.out.println("---------------------------------------");
	   System.out.println(s.length());
	   System.out.println("---------------------------------------");
	   System.out.println(s.toUpperCase());
	   System.out.println("---------------------------------------");
	   System.out.println(s.equals(p));
	   System.out.println("---------------------------------------");
	   System.out.println(s.concat(p));
	   System.out.println("---------------------------------------");
	   String s1 = "Hello";

	   System.out.println("First: " + s.charAt(0));
	   System.out.println("Last: " + s.charAt(s.length()-1));
}
}
