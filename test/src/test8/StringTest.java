package test8;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		String username = "admin";
		String password = "123456";

		for (int x = 3; 0 < x && x <= 3; x--) {
			Scanner sc = new Scanner(System.in);
			System.out.println("用户输入用户名：");
			String name = sc.nextLine();
			System.out.println("用户输入密码：");
			String pwd = sc.nextLine();

			if (username.equals(name) && password.equals(pwd)) {
				System.out.println("恭喜你登入成功！");
				GuessNumberGame.start();
				break;
			} else if (x > 1 && x <= 3) {
				System.out.println("请重新输入，可再次输入的次数是：" + (x - 1));
				continue;
			}else {
				System.out.println("你登入失败！");
				break;
			}

		}
	}
}
