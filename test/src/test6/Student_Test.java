package test6;

public class Student_Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student();
		Object obj = s1.clone();
		
		System.out.println(s1 == obj);
		System.out.println(s1.hashCode());
		System.out.println(obj.hashCode());
		System.out.println(s1);
		System.out.println(obj);
		
	}
}
