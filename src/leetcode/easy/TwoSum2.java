/**
* @author:liyiming
* @date:2018年5月14日
* Description:
**/
package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Title: TwoSum2 Description: Company:pusense 给定一个已按照升序排列
 * 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 
 * 说明:
 * 
 * 返回的下标值（index1 和 index2）不是从零开始的。 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 
 * 示例:
 * 
 * 输入: numbers = [2, 7, 11, 15], target = 9 输出: [1,2] 解释: 2 与 7 之和等于目标数 9 。因此
 * index1 = 1, index2 = 2
 * 
 * @author ：lyiming
 * @date ：2018年5月14日
 **/
public class TwoSum2{

	/**
	 * @author:liyiming
	 * @date:2018年5月14日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{2, 7, 11, 15};
		int res[] = twoSum3(nums, 9);
		for (int a : res) {
			System.out.println(a);
		}
	}

	public static int[] twoSum(int[] numbers, int target) {
		int[] indexs = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int complement = target - numbers[i];
			if (numbers[i] > target && target > 0)
				continue;
			if (map.containsKey(complement)) {
				indexs = new int[]{map.get(complement) + 1, i + 1};
			}
			map.put(numbers[i], i);
		}
		return indexs;
	}

	public static int[] twoSum2(int[] numbers, int target) {
		int x = 0, y = numbers.length - 1;
		while (x < y) {
			if (numbers[x] + numbers[y] == target)
				return new int[]{x + 1, y + 1};
			if (numbers[x] + numbers[y] > target)
				y--;
			else
				x++;
		}
		return numbers[x] + numbers[y] == target ? new int[]{x + 1, y + 1} : new int[]{-1, -1};
	}

	public static int[] twoSum3(int[] numbers, int target) {
		int[] indexs = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			int temp = target - numbers[i];
			int k = Arrays.binarySearch(numbers, i+1, numbers.length, temp);
			if (k > 0) {
				indexs = new int[] {i+1,k+1};
			}
		}
		return indexs;
	}
}
