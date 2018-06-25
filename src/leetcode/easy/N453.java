/**
* @author:liyiming
* @date:2018年6月25日
* Description:
**/
package leetcode.easy;

import java.util.Arrays;

/**
 * Title: N453 Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月25日
 **/
public class N453{

	public static void main(String[] args) {
		int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
		System.out.println(minMoves(nums));
	}

	public static int minMoves(int[] nums) {
		Arrays.sort(nums);
		int k = 0;
		int first = nums[0];
		for(int i:nums) {
			k += i-first;
		}
		return k;
	}
	
	public int minMoves2(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums){
            sum += num;
            if(num < min){
                min = num;
            }
        }
        return sum - (nums.length) * min;
    }
}
