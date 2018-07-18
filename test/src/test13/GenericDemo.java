package test13;

import java.util.ArrayList;
import java.util.Collection;

public class GenericDemo {

	public static void main(String[] args) {
		// 泛 型前后必须一致
		Collection<Object> c1 = new ArrayList<Object>();
		Collection<Animal> c2 = new ArrayList<Animal>();
		Collection<Dog> c3 = new ArrayList<Dog>();
		Collection<Cat> c4 = new ArrayList<Cat>();
		// Collection<Object> c5 = new ArrayList<Dog>();
		// Collection<Object> c6 = new ArrayList<Cat>();

		// ？表示任意的类型都可以
		Collection<?> c7 = new ArrayList<Object>();
		Collection<?> c8 = new ArrayList<Animal>();
		Collection<?> c9 = new ArrayList<Dog>();
		Collection<?> c10 = new ArrayList<Cat>();

		// ？extends E : 向下限定类型，为E本身或者E及其子类
		Collection<? extends Object> c11 = new ArrayList<Object>();
		Collection<? extends Object> c12 = new ArrayList<Animal>();
		Collection<? extends Object> c13 = new ArrayList<Dog>();
		Collection<? extends Object> c14 = new ArrayList<Cat>();

		// Collection<? extends Animal> c15 = new ArrayList<Object>();
		Collection<? extends Animal> c16 = new ArrayList<Animal>();
		Collection<? extends Animal> c17 = new ArrayList<Dog>();
		Collection<? extends Animal> c18 = new ArrayList<Cat>();
		
		
		//? super E  : 向上限定类型，为E本身或者E及其父类
		Collection<? super Animal> c19 = new ArrayList<Object>();
		Collection<? super Animal> c20 = new ArrayList<Animal>();
		//Collection<? super Animal> c21 = new ArrayList<Dog>();
		//Collection<? super Animal> c22 = new ArrayList<Cat>();

	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
