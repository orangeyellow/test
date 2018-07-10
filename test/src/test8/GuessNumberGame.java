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
			System.out.println("欢迎进入才子游戏！");
			int guessNumber = s.nextInt();
			if(guessNumber > number ) {
				System.out.println("你输入的数字大了！");
				continue;
			} else if (guessNumber < number) {
				System.out.println("你输入的数字小了！");
				continue;
			} else {
				System.out.println("你猜对！");
				break;
			}
			
		}
		
	}
}
