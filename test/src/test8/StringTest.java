package test8;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		String username = "admin";
		String password = "123456";

		for (int x = 3; 0 < x && x <= 3; x--) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�û������û�����");
			String name = sc.nextLine();
			System.out.println("�û��������룺");
			String pwd = sc.nextLine();

			if (username.equals(name) && password.equals(pwd)) {
				System.out.println("��ϲ�����ɹ���");
				GuessNumberGame.start();
				break;
			} else if (x > 1 && x <= 3) {
				System.out.println("���������룬���ٴ�����Ĵ����ǣ�" + (x - 1));
				continue;
			}else {
				System.out.println("�����ʧ�ܣ�");
				break;
			}

		}
	}
}
