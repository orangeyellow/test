package test2;

public class Pingpong_Coach extends Coach implements SpeakEnglish {
	public Pingpong_Coach() {
	}

	public Pingpong_Coach(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("ƹ�������-ѧϰ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ƹ�������-�Է�");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("ƹ�������-��Ӣ��˵��");
	}
}
