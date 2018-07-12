package test11;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 遍历集合元素
 * Object[] toArray​() 返回一个包含此集合中所有元素的数组。  
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add("hello");
		c.add("world");
		c.add("java");

		Object[] obj = c.toArray();

		for (int x = 0; x < obj.length; x++) {

//			System.out.println(obj[x]);
//			String s = (String) obj[x];
//			System.out.println(s.length());
			System.out.println(((String)obj[x]).length());
			
		}

	}
}
