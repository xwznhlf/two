package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		HashMap<Integer, Integer> hashMap = new HashMap();

		hashMap.put(1, 100000);
		hashMap.put(2, 3233);
		hashMap.put(3, 555);
		hashMap.put(4, 56666);

		System.out.println(hashMap);

		// 移除 值
		hashMap.remove(4);
		System.out.println(hashMap);

		HashMap<Integer, Integer> hashMap2 = new HashMap();

		hashMap2.put(5, 100000);
		hashMap2.put(6, 3233);
		hashMap2.put(7, 555);
		hashMap2.put(8, 56666);
		// 把两个集合 并列为一个集合
		hashMap.putAll(hashMap2);

		System.out.println(hashMap);

		// 通过 key 得到集合中的一个值
		int integer = hashMap.get(5);

		System.out.println(integer);

		// 得到 map集合的长度

		System.out.println(hashMap.size());
		System.out.println("------------------------------------");

		// 遍历
		// hashMap.keySet() , 通过这个方法得到对应的 键 的 集合
		for (int a : hashMap.keySet()) {

			System.out.println(hashMap.get(a));

		}

		System.out.println("------------------------------------");
		// 第二种 通过迭代器 来获取

		Iterator<Entry<Integer, Integer>> iterator = hashMap.entrySet()
				.iterator();

		while (iterator.hasNext()) {

			Entry<Integer, Integer> next = iterator.next();

			int key = next.getKey(); // 获取 key
			int value = next.getValue();// 获取value

			System.out.println(key + "   --->" + value);
		}
		System.out.println("------------------------------------");

		// 第三种 最常用

		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {

			System.out.println(entry.getKey() + "  ++++++>" + entry.getValue());

		}
		System.out.println("------------------------------------");
		// 第四种
		for (int a : hashMap.values()) {

			System.out.println(a);

		}

	}

}
