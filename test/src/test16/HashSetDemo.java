package test16;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {

		// 创建集合存储对象
		HashSet<Student> ts = new HashSet<Student>();
//
//		// 创建Student存储对象；
//		Student s1 = new Student("小明", 80, 96, 60);
//		Student s2 = new Student("小红", 80, 95, 60);
//		Student s3 = new Student("小明", 80, 50, 60);
//		Student s4 = new Student("小将", 80, 96, 60);
//		Student s5 = new Student("小白", 80, 90, 80);
		
		// 创建Student存储对象；
		Student s1 = new Student("小明", 80, 96, 60);
		Student s2 = new Student("小红", 80, 95, 60);
		Student s3 = new Student("小明", 80, 96, 60);
		Student s4 = new Student("小将", 96, 80, 60);
		Student s5 = new Student("小白", 80, 96, 60);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);

		for (Student s : ts) {
			System.out.println(s + "总分：" + (s.getChinese() + s.getMath() + s.getEnglish()));
		}
	}

}
