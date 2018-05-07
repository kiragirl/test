/**
* @author:liyiming
* @date:2018年5月7日
* Description:
**/
package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: TwoSum Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月7日
 **/
public class TwoSum{

	/**
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{2, 7, 11, 15};
		int res[] = twoSum(nums, 9);
		for (int a : res) {
			System.out.println(a);
		}
	}

	/**
	 * 两数之和
	 * 
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] res = null;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					res = new int[]{i, j};
				}
			}
		}
		return res;
	}

	/**
	 * 参考答案
	 * 
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
