/**
* @author:liyiming
* @date:2018年5月22日
* Description:
**/
package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: ContainsDuplicate Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月22日
 **/
public class ContainsDuplicate{

	/**
	 * @author:liyiming
	 * @date:2018年5月22日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		int nums[] = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
		System.out.println(containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> s = new HashSet<>();
		for (int n : nums) {
			if (s.contains(n)) {
				return true;
			} else {
				s.add(n);
			}
		}
		return false;
	}
}
