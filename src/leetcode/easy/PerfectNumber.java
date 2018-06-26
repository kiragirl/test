/**
* @author:liyiming
* @date:2018年6月26日
* Description:
**/
package leetcode.easy;

/**
 * Title: PerfectNumber Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月26日
 **/
public class PerfectNumber{

	/**
	 * @author:liyiming
	 * @date:2018年6月26日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		PerfectNumber pn = new PerfectNumber();
	}

	public boolean checkPerfectNumber(int num) {
		int[] nums = new int[]{6, 28, 496, 8128, 33550336};
		for (int i : nums) {
			if (num == i) {
				return true;
			}
		}
		return false;
	}

	public boolean checkPerfectNumber2(int num) {
		if (num <= 1)
			return false;

		int sum = 1;
		int i;
		for (i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				sum += i + num / i;
			}
		}

		if (i == Math.sqrt(num))
			sum += i;

		System.out.println(sum);
		return sum == num;

	}
}
