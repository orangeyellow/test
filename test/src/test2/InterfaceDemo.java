package test2;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pingpong_Player p = new Pingpong_Player();
		p.setName("王浩");
		p.setAge(33);
		System.out.println("乒乓球运动员："+p.getName() +"\t"+ "年龄：" + p.getAge());
		
		p.sleep();
		p.study();
		p.speak();
		p.eat();
		
		System.out.println("----------------------");
		
		Basketball_Player p2 = new Basketball_Player();
		p2.setName("姚明");
		p2.setAge(35);
		System.out.println("蓝球运动员："+p2.getName() +"\t"+ "年龄：" + p2.getAge());
		
		p2.sleep();
		p2.study();
		p2.eat();
	}

}
