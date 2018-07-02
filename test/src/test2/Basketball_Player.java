package test2;

public class Basketball_Player extends Sportsperson  {

	public Basketball_Player() {
	}

	public Basketball_Player(String name, int age) {
		super(name, age);
	}

	

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("蓝球运动员-学习");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("蓝球运动员-吃饭");
	}

}
