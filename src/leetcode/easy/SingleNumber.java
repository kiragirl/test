/**
* @author:liyiming
* @date:2018年5月11日
* Description:
**/
package leetcode.easy;

/**
 * Title: SingleNumber Description: Company:pusense
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 
 * 说明：
 * 
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？(利用异或运算)
 * 
 * 示例 1:
 * 
 * 输入: [2,2,1] 输出: 1
 * 
 * 示例 2:
 * 
 * 输入: [4,1,2,1,2] 输出: 4
 * 
 * 
 * @author ：lyiming
 * @date ：2018年5月11日
 **/
public class SingleNumber{

	/**
	 * @author:liyiming
	 * @date:2018年5月11日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] nums = new int[]{4, 1, 2, 1, 2};
		int[] nums = new int[]{4, 1, 3, 5, 6, 1, 3, 5, 6};
		// int[] nums = new int[]{2,2,1};
		System.out.println(singleNumber(nums));
	}

	/**
	 * 只出现一次的数字 异或性质：交换律，0^a=a, a^a=0;
	 * a⊕b⊕a=(a⊕a)⊕b=0⊕b=b
	 * @author:liyiming
	 * @date:2018年5月11日
	 * @Description:
	 * @param nums
	 * @return
	 */
	public static int singleNumber(int[] nums) {
		int value = 0;
		for (int i = 0; i < nums.length; i++) {
			value ^= nums[i];
		}
		return value;
	}
}
