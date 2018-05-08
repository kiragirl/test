/**
* @author:liyiming
* @date:2018年5月7日
* Description:
**/
package leetcode.easy;

/**
 * Title: Solution Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月7日
 **/
public class RemoveDuplicates{

	/**
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		int[] aa = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		removeDuplicates(aa);
	}

	/**
	 * 删除排序数组中的重复项
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param nums
	 * @return
	 */
	public static int removeDuplicates(int[] nums) {
		int k = 0;
		int i = 0;
		while (i < nums.length - 1) {
			int a = nums[i];
			int b = nums[i + 1];
			if (a == b && i < nums.length - k - 1) {
				k++;
				for (int j = i + 1; j < nums.length; j++) {
					if (j + 1 < nums.length) {
						nums[j] = nums[j + 1];
					}
				}
			} else {
				i++;
			}
		}
		return nums.length - k;
	}
	/**
	 * 删除排序数组中的重复项 参考答案
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:0, 0, 1, 1, 1, 2, 2, 3, 3, 4
	 * @param nums
	 * @return
	 */
	public int removeDuplicates2(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
}
