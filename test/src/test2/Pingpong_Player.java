package test2;

public class Pingpong_Player extends Sportsperson implements SpeakEnglish {

	public Pingpong_Player() {}
	
	public Pingpong_Player(String name, int age) {
		super(name,age);
	}
	
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球运动员-学习");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球运动员-吃饭");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球运动员-说英语");
	}



}
