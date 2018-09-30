package leetcode.easy.array;

/**
 * 53.Maximum Subarray
 * 
 * @author yiming.li
 * @description Given an integer array nums, find the contiguous subarray
 *              (containing at least one number) which has the largest sum and
 *              return its sum. Example: Input: [-2,1,-3,4,-1,2,1,-5,4], Output:
 *              6 Explanation: [4,-1,2,1] has the largest sum = 6. Follow up: If
 *              you have figured out the O(n) solution, try coding another
 *              solution using the divide and conquer approach, which is more
 *              subtle.
 */
public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = new int[] { -2, -1, -3, -4, -1, -2, -1, -5, -4 };
		//int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		// int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4,2};
		MaximumSubarray ms = new MaximumSubarray();
		System.out.println(ms.maxSubArray(nums));
	}

	public int maxSubArray(int[] nums) {
		int maximumSum = nums[0];
		int currentSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(currentSum<=0){
				currentSum = Math.max(currentSum, nums[i]);
			}else if(currentSum>0){
				maximumSum = Math.max(currentSum, maximumSum);
				currentSum = currentSum+nums[i];
			}
		}
		return Math.max(currentSum, maximumSum);
	}
}
