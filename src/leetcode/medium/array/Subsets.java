/**
* @author:liyiming
* @date:2018年7月6日
* Description:
**/
package leetcode.medium.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Subsets Description:给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * 
 * 说明：解集不能包含重复的子集。
 * 
 * 示例:
 * 
 * 输入: nums = [1,2,3] 输出: [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
 * 
 * 
 * Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年7月6日
 **/
public class Subsets{

	/**
	 * @author:liyiming
	 * @date:2018年7月6日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		Subsets sb = new Subsets();
		int[] nums = new int[]{1, 2, 3};
		System.out.println(sb.subsets(nums));
	}

	/**
	 * 组合法
	 * 
	 * @author:liyiming
	 * @date:2018年7月6日
	 * @Description:
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(new ArrayList<Integer>());
		for (int num : nums) { // ①从数组中取出每个元素
			int size = res.size();
			for (int i = 0; i < size; i++) {
				List<Integer> temp = new ArrayList<>(res.get(i)); // ②逐一取出中间结果集
				temp.add(num); // ③将 num 放入中间结果集
				res.add(temp); // ④加入到结果集中
			}
		}
		return res;
	}
	/**
	 * 回溯算法
	 * @author:liyiming
	 * @date:2018年7月6日
	 * @Description:
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> subsets2(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		dfs(res, temp, nums, 0);
		return res;
	}

	private void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int j) {
		res.add(new ArrayList<Integer>(temp));
		for (int i = j; i < nums.length; i++) {
			temp.add(nums[i]); // ① 加入 nums[i]
			dfs(res, temp, nums, i + 1); // ② 递归
			temp.remove(temp.size() - 1); // ③ 移除 nums[i]
		}
	}
}
