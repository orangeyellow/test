package test;


class  Fu {
	
	public void show() {
		System.out.println("���෽��");
	}
}

class Zi extends Fu {
	public void show() {
		
		System.out.println("���෽��");
	}
}




public class ZiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zi zi = new Zi();
		zi.show();
	}

}
