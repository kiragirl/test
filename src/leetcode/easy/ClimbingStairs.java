/**
* @author:liyiming
* @date:2018年5月8日
* Description:
**/
package leetcode.easy;

/**
 * Title: ClimbingStairs Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月8日
 **/
public class ClimbingStairs{

	/**
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(climbStairs2(7));
	}

	/**
	 * 爬楼梯
	 * 
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:
	 * @param n
	 * @return
	 */
	public static int climbStairs(int n) {
		return climb_Stairs(0, n);
	}

	public static int climb_Stairs(int i, int n) {
		if (i > n) {
			return 0;
		}
		if (i == n) {
			return 1;
		}
		return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
	}

	/**
	 * Recursion with memorization
	 * 
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:
	 * @param n
	 * @return
	 */
	public static int climbStairs2(int n) {
		int memo[] = new int[n + 1];
		return climb_Stairs(0, n, memo);
	}

	public static int climb_Stairs(int i, int n, int memo[]) {
		if (i > n) {
			return 0;
		}
		if (i == n) {
			return 1;
		}
		if (memo[i] > 0) {
			return memo[i];
		}
		memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
		return memo[i];
	}

	/**
	 * Fibonacci Number
	 * 
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:
	 * @param n
	 * @return
	 */
	public int climbStairs3(int n) {
		if (n == 1) {
			return 1;
		}
		int first = 1;
		int second = 2;
		for (int i = 3; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}
}
