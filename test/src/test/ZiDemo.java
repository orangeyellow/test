package test;

class Fu {
	 final int a;

	Fu() {
		this.a = 100;
	}

	public void show() {
		System.out.println("父类方法");

	}
}

class Zi extends Fu {
	
	int a = 200;

	public void show() {

		System.out.println("子类方法");
	}
}

public class ZiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zi zi = new Zi();
		zi.show();
		System.out.println(zi.a);

		System.out.println("---------------");

		Fu fu = new Fu();
		System.out.println(fu.a);
	}

}
