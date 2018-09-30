package leetcode.medium.array;

/**
 * leet code 845 Longest Mountain in Array
 * 
 * @author yiming.li
 * @description 我们把数组 A 中符合下列属性的任意连续子数组 B 称为 “山脉”： B.length >= 3 存在 0 < i <
 *              B.length - 1 使得 B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... >
 *              B[B.length - 1] （注意：B 可以是 A 的任意子数组，包括整个数组 A。） 给出一个整数数组 A，返回最长
 *              “山脉” 的长度。 如果不含有 “山脉” 则返回 0
 */
public class LongestMountainInArray {

	public static void main(String[] args) {
		// int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 3, 2, 3, 4, 7, 6, 5, 3,
		// 5, 7, 8, 9, 10, 11, 12, 13, 14 };
		// int[] nums = new int[] { 1,1,1 };
		int[] nums = new int[] { 1, 2, 3, 4, 4, 5, 6, 7, 3, 2, 3, 4, 7, 6, 11, 12, 13, 14 };
		// int[] nums = new int[] {2,3,3,2,0,2};
		LongestMountainInArray longestMountainInArray = new LongestMountainInArray();
		System.out.println(longestMountainInArray.longestMountain(nums));
	}

	public int longestMountain(int[] nums) {
		if (nums.length < 3) {
			return 0;
		}
		int current = nums[0];
		int per = current;
		int peak = 0;
		int currentLenght = 1;
		int maxLenght = 0;
		boolean isUphill = true;
		for (int i = 1; i < nums.length; i++) {
			current = nums[i];
			if (per < current) {
				if (!isUphill) {
					maxLenght = maxLenght > currentLenght ? maxLenght : currentLenght;
					currentLenght = 1;
					isUphill = true;
				}
				peak = current;
				currentLenght++;
				if (i == nums.length - 1 && isUphill) {
					currentLenght = 0;
				}
			} else if (per > current) {
				if (isUphill) {
					isUphill = false;
				}
				if (peak > current) {
					currentLenght++;
				}
			} else {
				if (!isUphill) {
					maxLenght = maxLenght > currentLenght ? maxLenght : currentLenght;
					isUphill = true;
				}
				currentLenght = 1;
				peak = 0;
			}
			per = current;
		}
		maxLenght = maxLenght > currentLenght ? maxLenght : currentLenght;
		return maxLenght >= 3 ? maxLenght : 0;
	}
}
