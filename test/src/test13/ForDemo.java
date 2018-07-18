package test13;

import java.util.ArrayList;

public class ForDemo {

	public static void main(String[] args) {
		
		//int数组用增强for循环
		int[] i = new int[] { 1, 5, 1, 6 };
		for (int x : i) {
			System.out.println(x);

		}
		
		System.out.println("---------------");

		//String数组用增强for循环
		String[] s = { "a", "b", "c", "d" };
		for (String s1 : s) {
			System.out.println(s1);
		}

		System.out.println("---------------");
		
		//对象数组用增强for循环
		Student ss1 = new Student("小明", 20);
		Student ss2 = new Student("小红", 21);
		Student ss3 = new Student("小芳", 25);
		Student[] ss4 = { ss1, ss2, ss3 };
		for (Student ss5 : ss4) {
			System.out.println(ss5.getName() + "----" + ss5.getAge());
		}
		
		System.out.println("---------------");
		
		//集合存储String对象使用增强for循环
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("xiao");
		for(String sss:array) {
			System.out.println(sss);
			
		}
		
		System.out.println("---------------");
		
		//集合存储Student对象使用增强for循环
		//增强for循环是用来替换集合的迭代器的
		ArrayList<Student> array2 = new ArrayList<Student>();
		array2.add(ss1);
		array2.add(ss2);
		array2.add(ss3);
		for(Student sss:array2) {
			System.out.println(sss.getName()+"------"+sss.getAge());
		}
		
	}
}
