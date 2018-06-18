package test;

public class yy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, s = 1;
		for (i = 1; i <= 2; i++)
			s = fun();
		System.out.printf("%d\n", s);
	}

	static int fun() {
		// TODO Auto-generated method stub
		int x = 0;
		x += 2;
		return x;
	}

}
