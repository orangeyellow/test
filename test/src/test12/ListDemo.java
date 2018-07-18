package test12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * List的特有功能
 * void add​(int index, E element) 将指定的元素插入此列表中的指定位置（可选操作）。
 * E get​(int index) 返回此列表中指定位置的元素。  
 * ListIterator<E> listIterator​() 返回列表中的列表迭代器（按适当的顺序）。  
 */
public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Hello");
		list.add("world");
		list.add("java");
		list.add("javaee");

		// void add​(int index, E element) 将指定的元素插入此列表中的指定位置（可选操作）。
		// list.add(2, "插入");
		// System.out.println(list);

		// E get​(int index) 返回此列表中指定位置的元素。
		// System.out.println(list.get(2));

		// ListIterator<E> listIterator​() 返回列表中的列表迭代器（按适当的顺序）。
		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		// static <E> List<E> of​(E e1) 返回一个包含一个元素的不可变列表。
		Student s = new Student("hh", 2);
		List<Student> l = List.of(s);
		System.out.println(l.size());
		System.out.println(list.get(0));
	}
}
