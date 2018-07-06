/**
* @author:liyiming
* @date:2018年7月6日
* Description:
**/
package leetcode.hard.array;

/**
 * Title: RemoveBoxes Description:Given several boxes with different colors
 * represented by different positive numbers. You may experience several rounds
 * to remove boxes until there is no box left. Each time you can choose some
 * continuous boxes with the same color (composed of k boxes, k >= 1), remove
 * them and get k*k points. Find the maximum points you can get.
 * 
 * 给几个用不同颜色代表不同正数的盒子。通过几次移除，使之没有剩余。每次移除你可以选择同样颜色的连续盒子（由k个盒子组成，k大于1），
 * 移除他们得到k*k点积分。找出你能得到的最大积分。
 * 
 * Example 1: Input:
 * 
 * [1, 3, 2, 2, 2, 3, 4, 3, 1]
 * 
 * Output:
 * 
 * 23
 * 
 * Explanation:
 * 
 * [1, 3, 2, 2, 2, 3, 4, 3, 1] 
 * ----> [1, 3, 3, 4, 3, 1] (3*3=9 points) 
 * ----> [1, 3, 3, 3, 1] (1*1=1 points) 
 * ----> [1, 1] (3*3=9 points) 
 * ----> [] (2*2=4 points)
 * 
 * Note: The number of boxes n would not exceed 100.
 * 
 * Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年7月6日
 **/
public class RemoveBoxes{

	/**
	 * @author:liyiming
	 * @date:2018年7月6日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[]{1, 3, 2, 2, 2, 3, 4, 3, 1};
	}

	public int removeBoxes(int[] boxes) {
		int maxPoints = 0;
		return maxPoints;
	}
}
