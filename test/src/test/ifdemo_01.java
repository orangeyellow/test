package test;

/*
 * if语句
 */
public class ifdemo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;

		if (a == b) {
			System.out.println("if语句执行了！");
		} else if (a >= b) {
			System.out.println("不等if语句执行了！");

		} else {
			System.out.println("最后");
		}

		switch (1) {
		case 1: {
			System.out.println("switch1");
			System.out.println("switch2");
			break;
		}
		default:
			System.out.println("switch3");
			break;
		}
	}

}
