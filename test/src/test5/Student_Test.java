package test5;

public class Student_Test {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ҧ��",35);
		System.out.println(s1.hashCode());
		System.out.println(s1.getClass().getName());
		System.out.println(s1.toString());
		System.out.println(s1);
		
		System.out.println("-----------------");
		
		Student s2 = new Student("С��", 20);
		
		Student s3 = s1;
		System.out.println(s1 == s2);
		System.out.println("-----------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("-----------------");
		System.out.println(s1.toString().equals(s2.toString()));
		
	}
}
