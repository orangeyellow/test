package test10;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Matg_Test {

	public static void main(String[] args) {
		
		//数学常量
		System.out.println(Math.PI);
		
		//数学常量
		System.out.println(Math.E);
		
		//绝对值
		System.out.println(Math.abs(100));
		System.out.println(Math.abs(-100));
		
		//大于本身加1
		System.out.println(Math.ceil(1.0000005));
		//大于本身去小数点后面的取整
		System.out.println(Math.floor(1.0000005));
		
		//比较两个值的最大值
		System.out.println(Math.max(5, 9));
		//比较两个值的最小值
		System.out.println(Math.min(5, 9));
		
		//代表2的3次幂
		System.out.println(Math.pow(2, 3));
		
		//随机数
		System.out.println((int)(Math.random()*100));
		
		//四舍五入
		System.out.println(Math.round(3.5415926));
		
		//平方根
		System.out.println(Math.sqrt(4));
	}
}
