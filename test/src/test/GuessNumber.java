package test;

import java.util.Scanner;

/**
 * 猜数字游戏，猜（1-100）的数
 * @author Administrator
 *
 */

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//产生一个（1-100）的随机数
		int number = (int)(Math.random() * 100) +1;
		System.out.println(number);
		
		while (true) {
			
			//键盘输入一个数字
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			
			if(a > number) {
				System.out.println("你猜测的数："+a+"大了");
			}else if (a < number) {
				System.out.println("你猜测的数："+a+"小了");
			}else {
				System.out.println("你猜测的数："+a+"和获奖数："+number+"一致");
				break;
			}
			
		}
	}

}
