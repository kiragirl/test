package leetcode.medium.array;

import java.util.Arrays;

/**
 * 300. 最长上升子序列。
 * 动态规划，二分
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。 示例: 输入: [10,9,2,5,3,7,101,18] 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。 说明: 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
 * 你算法的时间复杂度应该为 O(n2) 。 进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?
 * 
 * @author yiming.li
 *
 */
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] nums = new int[] { 10, 9, 2, 5, 3, 7, 101, 18 };
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		System.out.println(lis.lengthOfLISByDP(nums));
		System.out.println(lis.lengthOfLISByDPAndBS(nums));
	}

	public int lengthOfLISByDP(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
	}
	public int lengthOfLISByDPAndBS(int[] nums) {
		int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
            System.out.println(len);
        }
        return len;
	}
}
