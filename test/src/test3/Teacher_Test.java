package test3;

interface Love {
	abstract void love();
}

class LoveDemo {

	Love getLove() {

		return (Love) new Teacher();
	}
}

class Teacher implements Love {

	@Override
	public void love() {
		// TODO Auto-generated method stub
		System.out.println("Teacher love()");
	}

}

public class Teacher_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoveDemo l = new LoveDemo();
		Love ll = l.getLove();
		ll.love();
		
	}

}
