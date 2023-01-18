package com.nb.test_demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 写一个LRU缓存
 */
class LRU extends LinkedHashMap<String, Object> {

	private int capacity;

	public LRU(int initialCapacity) {
		super(initialCapacity, 0.75F, true);
		this.capacity = initialCapacity;
	}

	/**
	 * 如果map中的数据量大于设定的最大容量，返回true，再新加入对象时删除最老的数据
	 *
	 * @param eldest 最老的数据项
	 * @return true则移除最老的数据
	 */
	@Override
	protected boolean removeEldestEntry(Map.Entry<String, Object> eldest) {
		return size() > capacity;
	}

	public static void main(String[] args) {
		LRU lru = new LRU(2);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line = scanner.nextLine();
			if (line.startsWith("put")) {
				String[] split = line.split(" ");
				lru.put(split[1], split[2]);
			} else if (line.startsWith("get")) {
				String[] split = line.split(" ");
				System.out.println(lru.get(split[1]));
			}else {
				break;
			}
			System.out.println("==========="+lru.toString());
		}
	}
}
