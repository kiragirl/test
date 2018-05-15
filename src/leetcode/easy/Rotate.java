/**
* @author:liyiming
* @date:2018年5月14日
* Description:
**/
package leetcode.easy;

import java.util.Arrays;

/**
 * Title: Rotate Description: Company:pusense 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k
 * 是非负数。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3,4,5,6,7] 和 k = 3 输出: [5,6,7,1,2,3,4] 解释: 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5] 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 
 * 示例 2:
 * 
 * 输入: [-1,-100,3,99] 和 k = 2 输出: [3,99,-1,-100] 解释: 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 
 * 说明:
 * 
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。 要求使用空间复杂度为 O(1) 的原地算法。
 * 
 * 
 * @author ：lyiming
 * @date ：2018年5月14日
 **/
public class Rotate{

	/**
	 * @author:liyiming
	 * @date:2018年5月14日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] nums = new int[]{2, 7, 11, 15};
		int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
		// int[] nums = new int[]{1, 2, 3, 4, 5, 6};
		// int[] nums = new int[]{1, 2};
		rotate(nums, 3);
		for (int a : nums) {
			System.out.println(a);
		}
	}

	public static void rotate2(int[] nums, int k) {
		if (nums.length <= 1) {
			return;
		}
		for (int i = 0; i < k; i++) {
			int temp = nums[nums.length - 1];
			for (int j = 0; j < nums.length; j++) {
				int temp2 = nums[j];
				nums[j] = temp;
				temp = temp2;
			}
		}
	}

	public static void rotate(int[] nums, int k) {

		if (nums.length <= 1) {
			return;
		}
		int j = k > nums.length ? k % nums.length : k;

		int[] tempnums = Arrays.copyOfRange(nums, nums.length - j, nums.length);
		for (int i = nums.length - j - 1; i >= 0; i--) {
			int temp2 = nums[i];
			nums[i + j] = temp2;
		}
		// 1,2,3,4,5,6
		int m = (k / nums.length + 1) % 2;
		for (int i = 0; i < tempnums.length; i++) {
			if (nums.length >= k || m == 0) {
				nums[i] = tempnums[i];
			} else {
				if (i + j >= tempnums.length) {
					nums[0] = tempnums[i];
				} else {
					nums[i + j] = tempnums[i];
				}
			}
		}
	}

	/**
	 * 反转
	 * Using Reverse
	 * @author:liyiming
	 * @date:2018年5月15日
	 * @Description:
	 * @param nums
	 * @param k
	 */
	public void rotate3(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
