package test8;

public class StringDemo {

	public static void main(String[] args) {
		
		String  str = new String();
		System.out.println(str);
		System.out.println(str.length());
		System.out.println("-------------");
		
		
		byte[] bys = {97,98,99,100};
		String str2 = new String(bys);
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println("-------------");
		
		String str3 = new String(bys,1,3);
		System.out.println(str3);
		System.out.println(str3.length());
		System.out.println("-------------");
		
		char [] cha = {'a','b','c','аж'};
		String str4 = new String(cha);
		System.out.println(str4);
		System.out.println(str4.length());
		System.out.println("-------------");
		
		String str5 =new String(cha,1,3);
		System.out.println(str5);
		System.out.println(str5.length());
		System.out.println("-------------");
		
		String str6 = "Hello";
		String str7 = "Hello";
		System.out.println(str6 == str7);
		System.out.println(str6.equals(str7));
		System.out.println(str6.hashCode());
		System.out.println(str7.hashCode());
		str6 += " world";
		System.out.println(str6.hashCode());
		
		
		
	}
}
