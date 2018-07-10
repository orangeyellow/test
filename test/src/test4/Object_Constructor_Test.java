package test4;

public class Object_Constructor_Test {

	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println(s1.hashCode());

		Student s2 = new Student();
		System.out.println(s2.hashCode());

		Student s3 = s1;
		System.out.println(s3.hashCode());

		Class c1 = s1.getClass();
		String st = c1.getName();
		System.out.println(st);
	}
}
