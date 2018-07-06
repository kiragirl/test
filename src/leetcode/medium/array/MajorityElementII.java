/**
* @author:liyiming
* @date:2018年7月6日
* Description:
**/
package leetcode.medium.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Title: MajorityElementII Description:给定一个大小为 n 的数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 * 
 * 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1)。
 * 
 * 示例 1:
 * 
 * 输入: [3,2,3] 输出: [3]
 * 
 * 示例 2:
 * 
 * 输入: [1,1,1,3,3,2,2,2] 输出: [1,2]
 * 
 * 
 * Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年7月6日
 **/
public class MajorityElementII{

	/**
	 * @author:liyiming
	 * @date:2018年7月6日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{1, 1, 1, 3, 3, 2, 2, 2};
		MajorityElementII me = new MajorityElementII();
		System.out.println(me.majorityElement2(nums));;
	}

	// 不符合要求
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int halfLength = nums.length / 3;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			Integer k = map.get(i);
			if (null == k) {
				k = 1;
			} else {
				k++;
			}
			map.put(i, k);
			if (k > halfLength && !list.contains(i)) {
				list.add(i);
			}
		}
		return list;
	}

	// 使用投票算法 最多存在两个这样的数 candidate1和candidate2 也可能不存在
	public List<Integer> majorityElement2(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return list;
		if (nums.length == 1) {
			list.add(nums[0]);
			return list;
		}
		int halfLength = nums.length / 3;
		int candidate1 = nums[0];
		int candidate2 = 0;
		int time1 = 1;
		int time2 = 0;
		for (int i = 1; i < nums.length; i++) {
			if (candidate1 == nums[i]) {
				time1++;
			} else if (candidate2 == nums[i]) {
				time2++;
			} else if (time1 == 0) {
				candidate1 = nums[i];
				time1++;
			} else if (time2 == 0) {
				candidate2 = nums[i];
				time2++;
			} else {
				time1--;
				time2--;
			}
		}
		time1 = 0;
		time2 = 0;
		for (int i : nums) {
			if (i == candidate1)
				time1++;
			if (i == candidate2)
				time2++;
		}
		if (candidate1 == candidate2) {
			list.add(candidate1);
		}
		if (time1 > halfLength && candidate1 != candidate2)
			list.add(candidate1);
		if (time2 > halfLength && candidate1 != candidate2)
			list.add(candidate2);
		return list;
	}
}
