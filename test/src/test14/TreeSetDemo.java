package test14;

import java.util.TreeSet;

/*
 * TreeSet测试
 * 特点：
 * 		1. 元素唯一
 * 		2. 自然排序
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		
		//创建TreeSet集合对象
		TreeSet<Integer> tr = new TreeSet<Integer>();
		
		//增加集合元素
		tr.add(10);
		tr.add(11);
		tr.add(12);
		tr.add(12);
		tr.add(14);
		tr.add(14);
		tr.add(9);
		
		//遍历TreeSet集合
		for(Integer i : tr) {
			System.out.println(i);
			
		}
		
	}

}
