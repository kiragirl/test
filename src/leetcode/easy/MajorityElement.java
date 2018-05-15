/**
* @author:liyiming
* @date:2018年5月14日
* Description:
**/
package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Title: MajorityElement Description: Company:pusense 给定一个大小为 n
 * 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * 
 * 示例 1:
 * 
 * 输入: [3,2,3] 输出: 3
 * 
 * 示例 2:
 * 
 * 输入: [2,2,1,1,1,2,2] 输出: 2
 * 
 * 
 * @author ：lyiming
 * @date ：2018年5月14日
 **/
public class MajorityElement{

	/**
	 * @author:liyiming
	 * @date:2018年5月14日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int halfLength = nums.length / 2;
		System.out.println(halfLength);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			Integer k = map.get(i);
			if (null == k) {
				map.put(i, 1);
			} else {
				if (k + 1 > halfLength) {
					return i;
				} else {
					map.put(i, k + 1);
				}
			}
		}
		return 0;
	}

	/**
	 * 数组排序 则中间的元素肯定为众数
	 * 
	 * @author:liyiming
	 * @date:2018年5月14日
	 * @Description:
	 * @param nums
	 * @return
	 */
	public static int majorityElement2(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	/**
	 * Boyer-Moore Voting Algorithm 多数投票算法 没出现一次候选元素 count+1 否则count-1 count为0
	 * 则当前元素为候选元素 最后留下的候选元素肯定为众数
	 * 
	 * @author:liyiming
	 * @date:2018年5月14日
	 * @Description:
	 * @param nums
	 * @return
	 */
	public int majorityElement3(int[] nums) {
		int count = 0;
		Integer candidate = null;

		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			count += (num == candidate) ? 1 : -1;
		}

		return candidate;
	}
}
