package test8;

import java.util.Scanner;

public class GuessNumberGame {

	private GuessNumberGame() {
		// TODO Auto-generated method stub

	}

	public static void start () {

		int number = (int) (Math.random() *100 + 1);
		System.out.println(number);
		while (true) {
			
			Scanner s = new Scanner(System.in);
			System.out.println("��ӭ���������Ϸ��");
			int guessNumber = s.nextInt();
			if(guessNumber > number ) {
				System.out.println("����������ִ��ˣ�");
				continue;
			} else if (guessNumber < number) {
				System.out.println("�����������С�ˣ�");
				continue;
			} else {
				System.out.println("��¶ԣ�");
				break;
			}
			
		}
		
	}
}
