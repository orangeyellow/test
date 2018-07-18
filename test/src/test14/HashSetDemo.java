package test14;
/*
 * HashSet测试
 * 特点：
 * 		1. 唯一元素
 * 		2. 数据结构哈希表
 * 		3. 不会对数据的存储先后进行记录，输出的集合元素时候是不保证提取先后顺序的
 */

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// 创建一个HashSet集合
		HashSet<Student> hashSet = new HashSet<Student>();

		Student student1 = new Student("小明", 20);
		Student student2 = new Student("小红", 21);
		Student student3 = new Student("小江", 24);
		Student student4 = new Student("小红", 20);
		Student student5 = new Student("小红", 20);
		Student student6 = new Student("小江", 24);
		
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		hashSet.add(student5);
		hashSet.add(student6);
		
		for(Student s : hashSet) {
			System.out.println(s);
			
		}

	}
}
