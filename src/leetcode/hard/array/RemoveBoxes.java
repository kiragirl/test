/**
* @author:liyiming
* @date:2018年7月6日
* Description:
**/
package leetcode.hard.array;

/**
 * Title: RemoveBoxes Description:Given several boxes with different colors
 * represented by different positive numbers. You may experience several rounds
 * to remove boxes until there is no box left. Each time you can choose some
 * continuous boxes with the same color (composed of k boxes, k >= 1), remove
 * them and get k*k points. Find the maximum points you can get.
 * 
 * 给几个用不同颜色代表不同正数的盒子。通过几次移除，使之没有剩余。每次移除你可以选择同样颜色的连续盒子（由k个盒子组成，k大于1），
 * 移除他们得到k*k点积分。找出你能得到的最大积分。
 * 
 * Example 1: Input:
 * 
 * [1, 3, 2, 2, 2, 3, 4, 3, 1]
 * 
 * Output:
 * 
 * 23
 * 
 * Explanation:
 * 
 * [1, 3, 2, 2, 2, 3, 4, 3, 1] ----> [1, 3, 3, 4, 3, 1] (3*3=9 points) ----> [1,
 * 3, 3, 3, 1] (1*1=1 points) ----> [1, 1] (3*3=9 points) ----> [] (2*2=4
 * points)
 * 
 * Note: The number of boxes n would not exceed 100.
 * 
 * Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年7月6日
 **/
public class RemoveBoxes{

	/**
	 * @author:liyiming
	 * @date:2018年7月6日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{1, 3, 2, 2, 2, 3, 4, 3, 1};
		RemoveBoxes rb = new RemoveBoxes();
		System.out.println(rb.removeBoxes(nums));
	}

	public int removeBoxes2(int[] boxes) {
		int n = boxes.length;
		int dp[][][] = new int[100][100][100];;
		return helper(boxes, 0, n - 1, 0, dp);
	}
	/**
	 * 动态规划
	 * @author:liyiming
	 * @date:2018年7月6日
	 * @Description:
	 * @param boxes
	 * @param i
	 * @param j
	 * @param k
	 * @param dp
	 * @return
	 */
	public int helper(int[] boxes, int i, int j, int k, int dp[][][]) {
		if (j < i)
			return 0;
		if (dp[i][j][k] > 0)
			return dp[i][j][k];
		int res = (1 + k) * (1 + k) + helper(boxes, i + 1, j, 0, dp);
		for (int m = i + 1; m <= j; ++m) {
			if (boxes[m] == boxes[i]) {
				res = Math.max(res, helper(boxes, i + 1, m - 1, 0, dp) + helper(boxes, m, j, k + 1, dp));
			}
		}
		return dp[i][j][k] = res;
	}

	/**
	 * 动态规划
	 * 提前计算
	 * @author:liyiming
	 * @date:2018年7月6日
	 * @Description:
	 * @param boxes
	 * @return
	 */
	public int removeBoxes(int[] boxes) {
		int n = boxes.length;
		int[][][] dp = new int[n][n][n];
		for (int i = 0; i < n; ++i) {
			for (int k = 0; k <= i; ++k) {
				dp[i][i][k] = (1 + k) * (1 + k);
			}
		}
		for (int t = 1; t < n; ++t) {
			for (int j = t; j < n; ++j) {
				int i = j - t;
				for (int k = 0; k <= i; ++k) {
					int res = (1 + k) * (1 + k) + dp[i + 1][j][0];
					for (int m = i + 1; m <= j; ++m) {
						if (boxes[m] == boxes[i]) {
							res = Math.max(res, dp[i + 1][m - 1][0] + dp[m][j][k + 1]);
						}
					}
					dp[i][j][k] = res;
				}
			}
		}
		return n == 0 ? 0 : dp[0][n - 1][0];
	}
}
