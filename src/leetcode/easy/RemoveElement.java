/**
* @author:liyiming
* @date:2018年5月8日
* Description:
**/
package leetcode.easy;

/**
 * Title: RemoveElement Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月8日
 **/
public class RemoveElement{

	/**
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		//int[] nums = new int[]{3, 2, 2, 3};
		int[] nums = new int[]{0,1,2,2,3,0,4,2};
		System.out.println(removeElement2(nums, 2));
		for (int i : nums) {
			System.out.print(i);
		}
	}

	/**
	 * 移除元素
	 * 
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:
	 * @param nums
	 * @param val
	 * @return
	 */
	public static int removeElement(int[] nums, int val) {
		if (nums.length == 0)
			return 0;
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[j] != val) {
				j++;
			} else {
				for (int k = j; k < nums.length - 1; k++) {
					int m = nums[k];
					nums[k] = nums[k + 1];
					nums[k + 1] = m;
				}
			}
		}
		return j;
	}

	/**
	 * Two Pointers
	 * 
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:0,1,2,2,3,0,4,2
	 * @param nums
	 * @param val
	 * @return
	 */
	public static int removeElement2(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
			for (int m : nums) {
				System.out.print(m);
			}
			System.out.println();
		}
		return i;
	}

	/**
	 * Two Pointers - when elements to remove are rare
	 * 
	 * @author:liyiming
	 * @date:2018年5月8日
	 * @Description:
	 * @param nums
	 * @param val
	 * @return
	 */
	public int removeElement3(int[] nums, int val) {
		int i = 0;
		int n = nums.length;
		while (i < n) {
			if (nums[i] == val) {
				nums[i] = nums[n - 1];
				// reduce array size by one
				n--;
			} else {
				i++;
			}
		}
		return n;
	}
}
