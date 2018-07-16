package test11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo4 {
	public static void main(String[] args) {

		Collection c = new ArrayList();

		Student s1 = new Student("小红", 11);
		Student s2 = new Student("小方", 12);
		Student s3 = new Student("小明", 13);
		Student s4 = new Student("小童", 14);
		Student s5 = new Student("小建", 15);
		Student s6 = new Student("小天", 16);

		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		c.add(s6);

		Iterator it = c.iterator();

		// while(it.hasNext()) {
		// System.out.println(it.next());
		//
		// }

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------");
		
//		while (it.hasNext()) {
//			it.next();
//			it.remove();
//
//		}
		
		//it.next();
		it.remove();
		
		System.out.println("--------------------");
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
