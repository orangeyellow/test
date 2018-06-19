package test;


class  Fu {
	
	public void show() {
		System.out.println("父类方法");
	}
}

class Zi extends Fu {
	public void show() {
		
		System.out.println("子类方法");
	}
}




public class ZiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zi zi = new Zi();
		zi.show();
	}

}
