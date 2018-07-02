package test3;

abstract class Person {
	private int a = 3;

	abstract void study();

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

class PersonDemo {
	Person getPerson() {
		return (Person) new Student();

	}
}

class Student extends Person {

	@Override
	void study() {
		// TODO Auto-generated method stub
		System.out.println("学生在学习！");
	}

}

public class Person_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonDemo p = new PersonDemo();
		Person pp = p.getPerson();
		pp.study();
		System.out.println(pp.getA());

	}

}
