package test;

class Animal {
	public void eat() {
		System.out.println("Animal eat");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog  eat");
	}

	public void lookDoor() {
		System.out.println("Dog  lookDoor");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eat");
	}

	public void playGame() {
		System.out.println("Cat playGame");
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Dog();
		a.eat();

		System.out.println("------------");

		Dog d = (Dog) a;
		d.eat();
		d.lookDoor();

		System.out.println("------------");

		a = new Cat();
		a.eat();

		System.out.println("------------");
		
		Cat c = (Cat) a;
		c.eat();
		c.playGame();
		
		System.out.println("------------");

		//d = (Dog)a;
		//d.eat();
		//d2.lookDoor();

	}

}
