/**
* @author:liyiming
* @date:2018年6月21日
* Description:
**/
package leetcode.easy;

import java.util.HashMap;

/**
 * Title: NumArray Description: Company:pusense 给定一个整数数组 nums，求出数组从索引 i 到 j (i ≤
 * j) 范围内元素的总和，包含 i, j 两点。
 * 
 * 示例：
 * 
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 * 
 * sumRange(0, 2) -> 1 sumRange(2, 5) -> -1 sumRange(0, 5) -> -3
 * 
 * 说明:
 * 
 * 你可以假设数组不可变。 会多次调用 sumRange 方法
 * 
 * @author ：lyiming
 * @date ：2018年6月21日
 **/
public class NumArray{

	private int[] nums;
	private HashMap<javafx.util.Pair<Integer, Integer>, Integer> map = new HashMap<>();

	/**
	 * 
	 */
	public NumArray(int[] nums) {
		this.nums = nums;
	}

	/**
	 * @author:liyiming
	 * @date:2018年6月21日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
		NumArray obj = new NumArray(nums);
		int param_1 = obj.sumRange(2, 6);
		System.out.println(param_1);
	}

	public int sumRange(int i, int j) {
		javafx.util.Pair<Integer, Integer> p = new javafx.util.Pair<Integer, Integer>(i, j);
		if (map.get(p) != null) {
			return map.get(p);
		}
		int sum = 0;
		while (i <= j) {
			sum += nums[i];
			i++;
		}
		map.put(p, sum);
		return sum;
	}
}
