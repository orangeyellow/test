package test12;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector
 * 底层数据结构是数组，查询快，增删慢；
 * 线程安全，效率高
 */
public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("hello");
		v.add("world");
		v.add("java");

		for (int x = 0; x < v.size(); x++) {
			String s = (String) v.elementAt(x);
			System.out.println(s);

		}
		System.out.println("-----------------");
		Enumeration<String> en = v.elements();
		while (en.hasMoreElements()) {
			String s = (String) en.nextElement();
			System.out.println(s);

		}
	}
}
