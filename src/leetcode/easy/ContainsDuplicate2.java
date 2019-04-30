/**
* @author:liyiming
* @date:2018年5月22日
* Description:
**/
package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: ContainsDuplicate2 Description:给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和
 * j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3,1], k = 3 输出: true
 * 
 * 示例 2:
 * 
 * 输入: [1,0,1,1], k = 1 输出: true
 * 
 * 示例 3:
 * 
 * 输入: [1,2,1], k = 0 输出: false
 * 
 * 
 * Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月22日
 **/
public class ContainsDuplicate2{

	/**
	 * @author:liyiming
	 * @date:2018年5月22日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
		// int nums[] = new int[]{1,2,1};
		// int nums[] = new int[]{-1, -1};
		// int nums[] = new int[]{};
		 //int nums[] = new int[]{1, 2};
		System.out.println(containsDuplicate(nums, 3));
	}

	public static boolean containsDuplicate(int[] nums, int k) {
		if (nums.length == 0)
			return false;
		Map<Integer, Integer> m =new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(m.containsKey(nums[i]) && i - m.get(nums[i])<=k) {
				return true;
			}else {
				m.put(nums[i], i);
			}
		}
		return false;
	}
}
