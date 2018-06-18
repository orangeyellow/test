package test;

import java.io.LineNumberInputStream;
import java.util.ArrayList;

/**
 * 动态数组的应用
 */
public class DynamicArrayDemo {

	public static void main(String[] args) {

		/** 
		 * 定义动态数组
		 */
		
		/**
		 * 
		 */
		int[] arr = new int[3];

		/** 
		 * 数组的地址值
		 */
		System.out.println(arr.toString());

		System.out.println("------------------");

		/** 
		 * 数组的长度
		 */
		System.out.println(arr.length);

		System.out.println("------------------");

		/**
		 *  数组的里面的默认值
		 */
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println("------------------");

		int[] arr2 = new int[3];
		arr2 = arr;
		arr[0] = 100;
		arr[2] = 200;
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2.toString());
		
		System.out.println("------------------");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr.toString());
		

	}

}