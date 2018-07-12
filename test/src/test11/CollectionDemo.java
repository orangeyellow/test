package test11;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean add​(E e) 确保此集合包含指定的元素（可选操作）。  
 * boolean addAll​(Collection<? extends E> c) 将指定集合中的所有元素添加到此集合（可选操作）。  
 * void clear​() 从此集合中删除所有元素（可选操作）。  
 * boolean contains​(Object o) 如果此集合包含指定的元素，则返回 true 。  
 * boolean containsAll​(Collection<?> c) 如果此集合包含指定集合中的所有元素，则返回 true 。  
 * boolean equals​(Object o) 将指定的对象与此集合进行比较以获得相等性。  
 * int hashCode​() 返回此集合的哈希码值。  
 * boolean isEmpty​() 如果此集合不包含元素，则返回 true 。  
 * Iterator<E> iterator​() 返回此集合中元素的迭代器。  
 * default Stream<E> parallelStream​() 返回可能并行的 Stream与此集合作为其来源。  
 * boolean remove​(Object o) 从该集合中删除指定元素的单个实例（如果存在）（可选操作）。  
 * boolean removeAll​(Collection<?> c) 删除指定集合中包含的所有此集合的元素（可选操作）。  
 * default boolean removeIf​(Predicate<? super E> filter) 删除满足给定谓词的此集合的所有元素。  
 * boolean retainAll​(Collection<?> c) 仅保留此集合中包含在指定集合中的元素（可选操作）。  
 * int size​() 返回此集合中的元素数。  
 * default Spliterator<E> spliterator​() 在此集合中的元素上创建一个Spliterator 。  
 * default Stream<E> stream​() 返回一个序列 Stream与此集合作为其来源。  
 * Object[] toArray​() 返回一个包含此集合中所有元素的数组。  
 * <T> T[] toArray​(T[] a) 返回一个包含此集合中所有元素的数组; 返回的数组的运行时类型是指定数组的运行时类型。  
 */
public class CollectionDemo {
	public static void main(String[] args) {

		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();

		// // boolean add​(E e) 确保此集合包含指定的元素（可选操作）。
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add("world"));
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add(null));
		// System.out.println(c1);

		// // boolean addAll​(Collection<? extends E> c) 将指定集合中的所有元素添加到此集合（可选操作）。
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add("world"));
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add(null));
		// System.out.println(c2.add("hello"));
		// System.out.println(c2.add("world"));
		// System.out.println(c2.add("hello"));
		// System.out.println(c2.add(null));
		// System.out.println(c1.addAll(c2));
		// System.out.println(c1);
		// System.out.println(c2);

		// void clear​() 从此集合中删除所有元素（可选操作）。
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add("world"));
		// System.out.println(c1.add("hello"));
		// System.out.println(c1);
		// c1.clear();
		// System.out.println(c1);

		// boolean contains​(Object o) 如果此集合包含指定的元素，则返回 true 。
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add("world"));
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add(null));
		// System.out.println(c2.add("hello"));
		// System.out.println(c2.add("world"));
		// System.out.println(c2.add("hello"));
		// System.out.println(c2.add(null));
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c1.contains("hello"));
		// System.out.println(c1.contains("hellow"));
		// System.out.println(c2.contains("hellow"));

		// boolean containsAll​(Collection<?> c) 如果此集合包含指定集合中的所有元素，则返回 true 。

		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add("world"));
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add(null));
		// System.out.println(c2.add("hello"));
		// System.out.println(c2.add("world2"));
		// System.out.println(c2.add("hello3"));
		// System.out.println(c2.add(null));
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c1.containsAll(c2));
		// System.out.println(c1);
		// System.out.println(c2);

		// boolean isEmpty​() 如果此集合不包含元素，则返回 true 。

		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add("world"));
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add(null));
		//
		// System.out.println(c1.isEmpty());
		// c1.clear();
		// System.out.println(c1.isEmpty());

		// boolean remove​(Object o) 从该集合中删除指定元素的单个实例（如果存在）（可选操作）。
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add("world"));
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add(null));
		// System.out.println(c1);
		// System.out.println(c1.remove("hello"));
		// System.out.println(c1);

		// boolean removeAll​(Collection<?> c) 删除指定集合中包含的所有此集合的元素（可选操作）。
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add("world"));
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add(null));
		// System.out.println(c2.add("hello"));
		// System.out.println(c2.add("world2"));
		// System.out.println(c2.add("hello3"));
		// System.out.println(c2.add(null));
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c1.removeAll(c2));
		// System.out.println(c1);
		// System.out.println(c2);

		// boolean retainAll​(Collection<?> c) 仅保留此集合中包含在指定集合中的元素（可选操作）。
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add("world"));
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add(null));
		// System.out.println(c2.add("hello"));
		// System.out.println(c2.add("world2"));
		// System.out.println(c2.add("hello3"));
		// System.out.println(c2.add(null));
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c1.retainAll(c2));
		// System.out.println(c1);
		// System.out.println(c2);

		// int size​() 返回此集合中的元素数。
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add("world"));
		// System.out.println(c1.add("hello"));
		// System.out.println(c1.add(null));
		// System.out.println(c2.add("hello"));
		// System.out.println(c2.add("world2"));
		// System.out.println(c2.add("hello3"));
		// System.out.println(c2.add(null));
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c1.size());
		// System.out.println(c2.size());
		//

	}

}
