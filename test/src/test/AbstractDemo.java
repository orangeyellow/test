package test;

abstract class Animal_2 {
	public Animal_2() {
	}

	public Animal_2(int a) {
	}

	public abstract void eat();

	public abstract void sleep();
}

class Dog_2 extends Animal_2 {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("¹·³Ô¶«Î÷");

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog_2 d = new Dog_2();
		d.eat();

		Animal_2 an = new Dog_2();
		an.eat();

		Dog_2 dd = (Dog_2) an;
		dd.eat();
	}

}
