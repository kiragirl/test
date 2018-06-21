/**
* @author:liyiming
* @date:2018年6月21日
* Description:
**/
package leetcode.easy;

/**
 * Title: MoveZeroes Description: Company:pusense 给定一个数组 nums，编写一个函数将所有 0
 * 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 
 * 示例:
 * 
 * 输入: [0,1,0,3,12] 输出: [1,3,12,0,0]
 * 
 * 说明:
 * 
 * 必须在原数组上操作，不能拷贝额外的数组。 尽量减少操作次数
 * 
 * @author ：lyiming
 * @date ：2018年6月21日
 **/
public class MoveZeroes{

	/**
	 * @author:liyiming
	 * @date:2018年6月21日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] nums = new int[]{0, 1, 0,0, 3, 12};
		// int[] nums = new int[]{0, 1, 2, 3, 12};
		//int[] nums = new int[]{1, 0};
		int[] nums = new int[]{0, 0};
		// int[] nums = new int[]{0, 0, 1};
		// int[] nums = new int[]{2,2,1};
		moveZeroes2(nums);
		for (int a : nums) {
			System.out.print(a + ",");
		}
	}

	// 1,0,3,12,0
	public static void moveZeroes(int[] nums) {
		int i = 0;
		int k = nums.length;
		while (i < k) {
			if (nums[i] == 0) {
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j + 1];
					nums[j + 1] = 0;
				}
				k--;
			} else {
				i++;
			}
		}
	}

	public static void moveZeroes2(int[] nums) {
		int k = 0;
		for (int i = 0; i < nums.length;) {
			while (i < nums.length && nums[i] == 0  ) {
				k++;
				i++;
			}
			if (k > 0 && i < nums.length ) {
				nums[i - k] = nums[i];
				nums[i] = 0;
			}
			i++;
		}
	}
	
	public void moveZeroes3(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
