/**
* @author:liyiming
* @date:2018年7月5日
* Description:
**/
package leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Title: ArrayNesting Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年7月5日
 **/
public class ArrayNesting{

	/**
	 * @author:liyiming
	 * @date:2018年7月5日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{1,0,3,4,2};
		ArrayNesting an = new ArrayNesting();
		System.out.println(an.arrayNesting(nums));
	}

	public int arrayNesting(int[] nums) {
		int maxSize = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int e = i;
			if(map.containsKey(nums[e])) {
				continue;
			}
			int curMax = 0;
			HashSet<Integer> set = new HashSet<>();
			while (set.add(nums[e])) {
				curMax++;
				e = nums[e];
			}
			for(int b : set) {
				map.put(b, curMax);
			}
			/*System.out.println(i+":"+curMax);
			System.out.println(set.toString());*/
			maxSize = maxSize > curMax ? maxSize : curMax;
		}
		return maxSize;
	}
}
