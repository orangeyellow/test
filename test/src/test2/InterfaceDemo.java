package test2;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pingpong_Player p = new Pingpong_Player();
		p.setName("����");
		p.setAge(33);
		System.out.println("ƹ�����˶�Ա��"+p.getName() +"\t"+ "���䣺" + p.getAge());
		
		p.sleep();
		p.study();
		p.speak();
		p.eat();
		
		System.out.println("----------------------");
		
		Basketball_Player p2 = new Basketball_Player();
		p2.setName("Ҧ��");
		p2.setAge(35);
		System.out.println("�����˶�Ա��"+p2.getName() +"\t"+ "���䣺" + p2.getAge());
		
		p2.sleep();
		p2.study();
		p2.eat();
	}

}
