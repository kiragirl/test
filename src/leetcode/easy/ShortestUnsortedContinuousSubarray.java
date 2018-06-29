/**
* @author:liyiming
* @date:2018年6月29日
* Description:
**/
package leetcode.easy;

import java.util.Arrays;

/**
 * Title: Company:pusense ShortestUnsortedContinuousSubarray
 * Description:给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * 
 * 你找到的子数组应是最短的，请输出它的长度。
 * 
 * 示例 1:
 * 
 * 输入: [2, 6, 4, 8, 10, 9, 15] 输出: 5 解释: 你只需要对 [6, 4, 8, 10, 9]
 * 进行升序排序，那么整个表都会变为升序排序。
 * 
 * 说明 :
 * 
 * 输入的数组长度范围在 [1, 10,000]。 输入的数组可能包含重复元素 ，所以升序的意思是<=
 * 
 * @author ：lyiming
 * @date ：2018年6月29日
 **/
public class ShortestUnsortedContinuousSubarray{

	/**
	 * @author:liyiming
	 * @date:2018年6月29日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] nums = new int[]{2, 6, 4, 8, 10, 9, 16, 13, 15, 17, 15};
		// int[] nums = new int[]{1,3,2,2,2};
		// int[] nums = new int[]{2,6,4,8,10,9,15};
		// int[] nums = new int[]{2, 1};
		//int[] nums = new int[]{2, 3, 3, 2, 4};
		int[] nums = new int[]{1,2,4,5,3};
		ShortestUnsortedContinuousSubarray suc = new ShortestUnsortedContinuousSubarray();
		System.out.println(suc.findUnsortedSubarray(nums));
	}

	public int findUnsortedSubarray(int[] nums) {
		int[] snums = nums.clone();
        Arrays.sort(snums);
        int start = snums.length, end = 0;
        for (int i = 0; i < snums.length; i++) {
            if (snums[i] != nums[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        return (end - start >= 0 ? end - start + 1 : 0);
	}
}
