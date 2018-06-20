/**
* @author:liyiming
* @date:2018年6月20日
* Description:
**/
package leetcode.easy;

/**
 * Title: MissingNumber Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月20日
 **/
public class MissingNumber{

	public static void main(String[] args) {
		int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		int max = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			max = nums[i] > max ? nums[i] : max;
			min = nums[i] < min ? nums[i] : min;
			sum += nums[i];
		}
		if (min > 0) {
			return 0;
		}
		int missValue = max * (max + 1) / 2 - sum;
		if (missValue == 0) {
			return max+1;
		}else {
			return missValue;
		}
	}
	
	public int missingNumber2(int[] nums) {
        int len = nums.length;
        int sum = len * (len + 1) / 2;
        for (int num: nums) {
            sum = sum - num;
        }
        return sum;
    }
}
