package test8;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = "helloWorld";
		String s2 = "helloWorld";
		String s3 = "HelloWorld";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println("---------------");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println("----------------");
		
		System.out.println(s1.contains("e"));
		System.out.println(s2.contains("H"));
		System.out.println(s3.contains("H"));
		System.out.println(s1.contentEquals("hello"));
		System.out.println("----------------");

		System.out.println(s1.startsWith("h"));
		System.out.println(s1.startsWith("e"));
		System.out.println(s2.startsWith("hello"));
		System.out.println(s3.startsWith("H"));
		System.out.println("----------------");

		System.out.println(s1.endsWith("d"));
		System.out.println(s2.endsWith("l"));
		System.out.println(s3.endsWith("d"));
		System.out.println("----------------");
		
		System.out.println("".isEmpty());
		String tt = null;
		System.out.println(String.valueOf(tt));
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		
		
	}

}
