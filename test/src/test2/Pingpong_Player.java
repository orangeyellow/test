package test2;

public class Pingpong_Player extends Sportsperson implements SpeakEnglish {

	public Pingpong_Player() {}
	
	public Pingpong_Player(String name, int age) {
		super(name,age);
	}
	
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("ƹ�����˶�Ա-ѧϰ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ƹ�����˶�Ա-�Է�");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("ƹ�����˶�Ա-˵Ӣ��");
	}



}
