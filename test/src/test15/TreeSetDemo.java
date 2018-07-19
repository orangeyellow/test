package test15;

import java.util.Comparator;
import java.util.TreeSet;

import test15.Student;

/*
 * TreeSet测试
 * 特点：
 * 		1. 元素唯一
 * 		2. 自然排序
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		
		//创建TreeSet集合对象
		TreeSet<Student> tr = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int num = o1.getName().length()-o2.getName().length();
				int num2 = num==0 ? o1.getName().compareTo(o2.getName()):num;
				int num3 = num2==0 ? o1.getAge()-o2.getAge():num2;
				return num3;
			}}
		);
		
		Student student1 = new Student("小明", 20);
		Student student2 = new Student("小红", 21);
		Student student3 = new Student("小江", 24);
		Student student4 = new Student("小红", 20);
		Student student5 = new Student("小红", 20);
		Student student6 = new Student("小江", 24);
		
		tr.add(student1);
		tr.add(student2);
		tr.add(student3);
		tr.add(student4);
		tr.add(student5);
		tr.add(student6);
		
		
		//遍历TreeSet集合
		for(Student i : tr) {
			System.out.println(i);
			
		}
		
	}

}
