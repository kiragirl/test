/**
* @author:liyiming
* @date:2018年6月29日
* Description:
**/
package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Title: DistributeCandies Description: Company:pusense
 * 给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的种类数。
 * 
 * 示例 1:
 * 
 * 输入: candies = [1,1,2,2,3,3] 输出: 3 解析: 一共有三种种类的糖果，每一种都有两个。
 * 最优分配方案：妹妹获得[1,2,3],弟弟也获得[1,2,3]。这样使妹妹获得糖果的种类数最多。
 * 
 * 示例 2 :
 * 
 * 输入: candies = [1,1,2,3] 输出: 2 解析:
 * 妹妹获得糖果[2,3],弟弟获得糖果[1,1]，妹妹有两种不同的糖果，弟弟只有一种。这样使得妹妹可以获得的糖果种类数最多。
 * 
 * 注意:
 * 
 * 数组的长度为[2, 10,000]，并且确定为偶数。 数组中数字的大小在范围[-100,000, 100,000]内。
 * 
 * @author ：lyiming
 * @date ：2018年6月29日
 **/
public class DistributeCandies{

	/**
	 * @author:liyiming
	 * @date:2018年6月29日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		//int[] nums = new int[]{1, 1, 2, 2, 3, 3};
		//int[] nums = new int[]{1,1,2,3};
		//int[] nums = new int[]{1,3};
		int[] nums = new int[]{100000,0,100000,0,100000,0,100000,0,100000,0,100000,0};
		DistributeCandies dc = new DistributeCandies();
		System.out.println(dc.distributeCandies2(nums));
	}

	/**
	 * 思考：1 可以将数组排序（题目中没确定是有序数组），排序后遍历 有多少总不同的糖果 超出一半 返回一半 2 用直接遍历
	 * 用hashmap将每个不同的糖果保存 比较 确定有多少不同的糖果 超出一半 返回一半
	 * 
	 * @author:liyiming
	 * @date:2018年6月29日
	 * @Description:
	 * @param candies
	 * @return
	 */
	public int distributeCandies(int[] candies) {
		int sum = 1;
		Arrays.sort(candies);
		int pre = candies[0];
		for (int a : candies) {
			if(sum==candies.length/2) {
				break;
			}
			if (a != pre) {
				pre = a;
				sum++;
			}
		}
		return sum;
	}
	public int distributeCandies2(int[] candies) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int a : candies) {
			set.add(a);
		}
		return set.size()<candies.length/2?set.size():candies.length/2;
	}
}
