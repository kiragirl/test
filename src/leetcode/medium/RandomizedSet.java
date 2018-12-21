package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RandomizedSet {
	public static void main(String[] args) {
		RandomizedSet rSet = new RandomizedSet();
		rSet.insert(4);
		rSet.insert(1);
		rSet.insert(2);
		rSet.insert(3);

		for (int i = 0; i < 10; i++) {
			System.out.println(rSet.getRandom());
		}

		rSet.insert(5);
		rSet.remove(3);
		//
		rSet.remove(5);
		for (int i = 0; i < 10; i++) {
			System.out.println(rSet.getRandom());
		}
	}

	// 以数据为key存放数据在vector中的下标
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	// 存放数据
	List<Integer> vector = new ArrayList<Integer>();

	/** Initialize your data structure here. */
	public RandomizedSet() {

	}

	/**
	 * Inserts a value to the set. Returns true if the set did not already
	 * contain the specified element.
	 */
	public boolean insert(int val) {
		if (map.containsKey(val)) {
			return false;
		} else {
			vector.add(val);
			map.put(val, vector.size() - 1);
		}
		return true;
	}

	/**
	 * Removes a value from the set. Returns true if the set contained the
	 * specified element.
	 * 将需要删除的元素与最后一位的元素交换位置，删除最后一位。将需要移除的元素从map中删除，更新原最后一位元素在map中的位置
	 */
	public boolean remove(int val) {
		if (map.containsKey(val)) {
			int offset = map.get(val);
			int size = vector.size() - 1;
			if (offset != size) {
				int lastE = vector.get(size);
				int reomveE = vector.get(offset);
				vector.set(offset, lastE);
				vector.set(size, reomveE);
				map.put(lastE, offset);
			}
			vector.remove(size);
			map.remove(val);
			return true;
		} else {
			return false;
		}
	}

	/** Get a random element from the set. */
	public int getRandom() {
		if (vector.size() == 0) {
			return 0;
		}
		int a = (int) (Math.random() * (vector.size()));
		return vector.get(a);
	}
}
