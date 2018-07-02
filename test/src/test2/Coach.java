package test2;

public abstract class Coach extends Person {

	public Coach () {}
	
	public Coach (String name, int age) {
		
		super(name,age);
	}
	
	//½ÌÓı
	public abstract void teach();
}
