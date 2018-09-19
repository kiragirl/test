package leetcode.medium.array;

import java.util.Arrays;

/**
 * 
 * @author yiming.li 518. 零钱兑换 II
 *         给定不同面额的硬币和一个总金额。写出函数来计算可以凑成总金额的硬币组合数。假设每一种面额的硬币有无限个。 注意: 你可以假设 0 <=
 *         amount (总金额) <= 5000 1 <= coin (硬币面额) <= 5000 硬币种类不超过500种 结果符合32位符号整数
 *         示例 1: 输入: amount = 5, coins = [1, 2, 5] 输出: 4 解释: 有四种方式可以凑成总金额: 5=5
 *         5=2+2+1 5=2+1+1+1 5=1+1+1+1+1 示例 2: 输入: amount = 3, coins = [2] 输出: 0
 *         解释: 只用面额2的硬币不能凑成总金额3。 示例 3: 输入: amount = 10, coins = [10] 输出: 1
 */
public class CoinChange2 {

	public static void main(String[] args) {
		int[] coins = new int[] { 2, 3, 4, 5, 11, 15 };
		int amount = 6;
		CoinChange2 coinChange2 = new CoinChange2();
		System.out.println(coinChange2.change(amount, coins));
	}

	public int change(int amount, int[] coins) {
		int dp[] = new int[amount + 1];
		dp[0] = 1;
		for (int i = 0; i < coins.length; i++) {
			int coin = coins[i];
			for (int j = 0; j < amount; j++) {
				int camount = j + coin;
				if (camount <= amount) {
					dp[camount] += dp[j];
				}
			}
		}
		return dp[dp.length - 1];
	}

	public int binarySearch2(int nums[], int l, int r, int x) {
		while (r >= l && r < nums.length) {
			int mid = (l + r) / 2;

			if (nums[mid] > x)
				r = mid - 1;
			else if (nums[mid] < x)
				l = mid + 1;
			else
				return mid + 1;
		}
		return l;
	}
}
