package leetcode.medium.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 421:给定一个非空数组，数组中元素为 a0, a1, a2, … , an-1，其中 0 ≤ ai < 231 。 找到 ai 和aj 最大的异或
 * (XOR) 运算结果，其中0 ≤ i, j < n 。 你能在O(n)的时间解决这个问题吗？ 示例: 输入: [3, 10, 5, 25, 2, 8]
 * 
 * 输出: 28
 * 
 * 解释: 最大的结果是 5 ^ 25 = 28.
 * 
 * @author yiming.li
 *
 */
public class MaximumXOROfTwoNumbersInanArray {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 10, 5, 25, 2, 8 };
		//System.out.println(Integer.toBinaryString(25));
		//System.out.println(Integer.toBinaryString(5));
		MaximumXOROfTwoNumbersInanArray mx = new MaximumXOROfTwoNumbersInanArray();
		System.out.println(mx.findMaximumXOR(nums));
		System.out.println(mx.findMaximumSum(nums));
	}

	/**
	 * 最大两个数的和 可以动态规划 异或可不可动态规划
	 *  并不可以
	 * @return
	 */
	public int findMaximumSum(int[] nums) {
		int max = Integer.MIN_VALUE;
		int cMax = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (cMax + nums[i] > max) {
				max = cMax + nums[i];
			}
			if (cMax < nums[i]) {
				cMax = nums[i];
			}
		}
		return max;
	}

	public int findMaximumXOR(int[] nums) {
		int max = 0;
		int mask = 0;
		System.out.println(Integer.toBinaryString(30));
		System.out.println(Integer.toBinaryString(1 << 30));
		for (int i = 30; i >= 0; i--) {
			mask |= (1 << i);
			System.out.println(Integer.toBinaryString(mask));
			System.out.println("*************************************************");
			Set<Integer> set = new HashSet<>();
			for (int a : nums) {
				set.add(a & mask);
			}
			int t = max | (1 << i);
			System.out.println(Integer.toBinaryString(t));
			// int count = 0;
			for (int a : set) {
				if (set.contains(t ^ a)) {
					max = t;
					break;
				}

			}
		}
		return max;
	}
}
