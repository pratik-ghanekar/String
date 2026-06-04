package sring;

public class buffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Pratik");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(sb.length()-3, sb.length());
		System.out.println(sb);
		StringBuffer sp = new StringBuffer("India is great");
		sp.replace(0, 5, "Bharat");
		System.out.println(sp);
		System.out.println("Length: " + sb.length());
		System.out.println("Capacity: " + sb.capacity());
	}

}
