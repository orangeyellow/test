package test3;

public class InnerClassDemo4 {

	private  static int num = 10;

	public static class Inner {
		
		public void show() {

			System.out.println(num);
		}

		public static void show2() {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner.show2();
		InnerClassDemo4.Inner  ii = new InnerClassDemo4.Inner();
		
		ii.show();
		InnerClassDemo4.Inner.show2();
		

	}

}
