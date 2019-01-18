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

		// �Ƴ� ֵ
		hashMap.remove(4);
		System.out.println(hashMap);

		HashMap<Integer, Integer> hashMap2 = new HashMap();

		hashMap2.put(5, 100000);
		hashMap2.put(6, 3233);
		hashMap2.put(7, 555);
		hashMap2.put(8, 56666);
		// ���������� ����Ϊһ������
		hashMap.putAll(hashMap2);

		System.out.println(hashMap);

		// ͨ�� key �õ������е�һ��ֵ
		int integer = hashMap.get(5);

		System.out.println(integer);

		// �õ� map���ϵĳ���

		System.out.println(hashMap.size());
		System.out.println("------------------------------------");

		// ����
		// hashMap.keySet() , ͨ����������õ���Ӧ�� �� �� ����
		for (int a : hashMap.keySet()) {

			System.out.println(hashMap.get(a));

		}

		System.out.println("------------------------------------");
		// �ڶ��� ͨ�������� ����ȡ

		Iterator<Entry<Integer, Integer>> iterator = hashMap.entrySet()
				.iterator();

		while (iterator.hasNext()) {

			Entry<Integer, Integer> next = iterator.next();

			int key = next.getKey(); // ��ȡ key
			int value = next.getValue();// ��ȡvalue

			System.out.println(key + "   --->" + value);
		}
		System.out.println("------------------------------------");

		// ������ ���

		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {

			System.out.println(entry.getKey() + "  ++++++>" + entry.getValue());

		}
		System.out.println("------------------------------------");
		// ������
		for (int a : hashMap.values()) {

			System.out.println(a);

		}

	}

}
