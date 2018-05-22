/**
* @author:liyiming
* @date:2018年5月15日
* Description:
**/
package leetcode.easy;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3,1] 输出: 4 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。 偷窃到的最高金额 = 1
 * + 3 = 4 。
 * 
 * 示例 2:
 * 
 * 输入: [2,7,9,3,1] 输出: 12 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋
 * (金额 = 1)。 偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * 
 * 
 * Title: HouseRobber Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月15日
 **/
public class HouseRobber{

	/**
	 * 2,7,9,3,1,4,7,6 2+9 = 11 a 7+3 = 10 b
	 * 
	 * 1+7 = 8 c 4+6 = 10 d
	 * 
	 * ac ad bd
	 * 
	 * 2+9+1+7 = 19 7+3+4+6 = 20 2+9+4+6 = 21
	 * 
	 * @author:liyiming
	 * @date:2018年5月15日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		// int nums[] = new int[]{6, 1, 3, 2, 4, 7};
		// int nums[] = new int[]{1,2,3,1};
		// int nums[] = new int[]{2, 7, 9, 3, 1};
		// int nums[] = new int[]{1,1,1,1};
		// [1,3,1,3,100]
		int nums[] = new int[]{1, 3, 1, 3, 100};
		System.out.println(rob(nums));
	}

	public static int rob(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		int a = nums[0];
		int b = nums[1];
		int i = 2;
		while (i <= nums.length - 2) {
			if (a >= b) {
				int b1 = a + nums[i + 1];
				a = a + nums[i];
				b = b + nums[i + 1] > b1 ? b + nums[i + 1] : b1;
			} else {
				a = a + nums[i];
				if (a < b) {
					a = b;
				}
				b = b + nums[i + 1];
			}
			i = i + 2;
		}
		if (i + 1 == nums.length) {
			a = a + nums[nums.length - 1];
		}
		return a >= b ? a : b;
	}

	public int rob2(int[] nums) {
		int prev = 0, curr = 0;
		for (int n : nums) {
			int tmp = curr;
			curr = Math.max(prev + n, curr);
			prev = tmp;
		}
		return curr;
	}
}
