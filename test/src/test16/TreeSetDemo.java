package test16;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// 创建集合存储对象
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int num = (s2.getChinese() + s2.getMath() + s2.getEnglish())
						- (s1.getChinese() + s1.getMath() + s1.getEnglish());
				int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
				int num3 = num2 == 0 ? s1.getMath() - s2.getMath() :num2;
				int num4 = num3 == 0 ? s1.getEnglish()-s2.getEnglish(): num3;
				int num5 = num4 ==0 ? s1.getName().compareTo(s2.getName()): num4; 
				return num5;
			}
		});

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
