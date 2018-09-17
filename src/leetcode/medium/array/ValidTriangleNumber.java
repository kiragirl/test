package leetcode.medium.array;

import java.util.Arrays;

/**
 * 611. 有效三角形的个数
 * 
 * @author yiming.li 给定一个包含非负整数的数组，你的任务是统计其中可以组成三角形三条边的三元组个数。 示例 1: 输入:
 *         [2,2,3,4] 输出: 3 解释: 有效的组合是: 2,3,4 (使用第一个 2) 2,3,4 (使用第二个 2) 2,2,3 注意:
 *         数组长度不超过1000。 数组里整数的范围为 [0, 1000]。
 */
public class ValidTriangleNumber {

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 2, 3, 4, 5, 6 };
		ValidTriangleNumber validTriangleNumber = new ValidTriangleNumber();
		System.out.println(validTriangleNumber.triangleNumber(nums));
		System.out.println(validTriangleNumber.triangleNumber2(nums));
		System.out.println(validTriangleNumber.triangleNumber3(nums));
	}

	public int triangleNumber(int[] nums) {
		int length = nums.length;
		if (length < 3) {
			return 0;
		}
		Arrays.sort(nums);
		int count = 0;
		for (int i = 0; i < length - 2; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				for (int n = j + 1; n < length; n++) {
					if (nums[i] + nums[j] <= nums[n]) {
						break;
					} else {
						count++;
					}
				}
				System.out.println("count:" + count);
			}
		}
		return count;
	}

	public int triangleNumber2(int[] nums) {
		int length = nums.length;
		if (length < 3) {
			return 0;
		}
		Arrays.sort(nums);
		int count = 0;
		for (int i = 0; i < length - 2; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				count = count + binarySearch(nums, j + 1, nums[i] + nums[j], length - 1) - j - 1;
				System.out.println("count:" + count);
			}
		}
		return count;
	}

	public int binarySearch(int[] nums, int begin, int key, int end) {
		// end >= begin && r < nums.length
		// while (end != begin && begin < nums.length && end < nums.length) {
		while (end >= begin && end < nums.length) {
			int mid = (begin + end) / 2;
			int midVal = nums[mid];
			if (midVal >= key)
				end = mid - 1;
			else
				begin = mid + 1;
		}
		return begin;
	}

	int binarySearch2(int nums[], int l, int r, int x) {
		while (r >= l && r < nums.length) {
			int mid = (l + r) / 2;
			if (nums[mid] >= x)
				r = mid - 1;
			else
				l = mid + 1;
		}
		return l;
	}

	public int triangleNumber3(int[] nums) {
		int count = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int k = i + 2;
			for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
				k = binarySearch2(nums, k, nums.length - 1, nums[i] + nums[j]);
				count += k - j - 1;
			}
		}
		return count;
	}
}
