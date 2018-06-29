/**
* @author:liyiming
* @date:2018年6月29日
* Description:
**/
package leetcode.easy;

import java.util.HashMap;

/**
 * Title: LongestHarmoniousSubsequence Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月29日
 **/
public class LongestHarmoniousSubsequence{

	/**
	 * @author:liyiming
	 * @date:2018年6月29日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {

		//int[] nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
		int[] nums = new int[]{-1,0,-1,0,-1,0,-1};
		LongestHarmoniousSubsequence l = new LongestHarmoniousSubsequence();
		System.out.println(l.findLHS(nums));
	}

	public int findLHS(int[] nums) {
		int max = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i :nums) {
			if(map.get(i)!=null) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i,1);
			}
			
			if(map.get(i-1)!=null) {
				max = map.get(i-1)+map.get(i)>max?map.get(i-1)+map.get(i):max;
			}
			if(map.get(i+1)!=null) {
				max = map.get(i+1)+map.get(i)>max?map.get(i+1)+map.get(i):max;
			}
		}
		return max;
	}
}
