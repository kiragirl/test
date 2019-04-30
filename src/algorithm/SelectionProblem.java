/**
* @author:liyiming
* @date:2018年7月10日
* Description:
**/
package algorithm;

/**
 * @Title: SelectionProblem 设有一组N个数而要确定其中第k个最大者，称之为选择为题（selection problem）
 * @Description:data structures and algorithm analysis chapter 1 practice 1.1
 * @Company:pusense
 * @author ：lyiming
 * @date ：2018年7月10日
 **/
public class SelectionProblem{

	/**
	 * @author:liyiming
	 * @date:2018年7月10日
	 * @Description:编写一个程序解决选择问题，令k=n/2。
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{5, 4, 3, 7, 1, 2, 6, 8};
		SelectionProblem sp = new SelectionProblem();
		System.out.println(sp.findKthBigElement(nums));
	}

	public int findKthBigElement(int[] nums) {
		int element = 0;
		int halfLength = nums.length / 2;
		int[] halfNums = new int[halfLength];
		for (int i = 0; i < halfLength; i++) {
			int temp = nums[i];
			for (int j = 0; j <= i; j++) {
				if (halfNums[j] < temp) {
					int cur = halfNums[j];
					halfNums[j] = temp;
					temp = cur;
				}
			}
		}
		element = halfNums[halfLength - 1];
		for (int i = halfLength; i < nums.length; i++) {
			if (nums[i] > element) {
				int temp = nums[i];
				for (int j = 0; j < halfLength; j++) {
					if (halfNums[j] < temp) {
						int cur = halfNums[j];
						halfNums[j] = temp;
						temp = cur;
					}
				}
			}
		}
		return halfNums[halfLength - 1];
	}
}
