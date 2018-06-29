/**
* @author:liyiming
* @date:2018年6月29日
* Description:
**/
package leetcode.easy;

/**
 * Title: RangeAdditionII Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月29日
 **/
public class RangeAdditionII{

	/**
	 * @author:liyiming
	 * @date:2018年6月29日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		int m = 3;
		int n = 3;
		RangeAdditionII ra = new RangeAdditionII();
		int[][] ops = new int[][] {{2,2},{3,3}};
		System.out.println(ra.maxCount(m, n, ops));
	}

	public int maxCount(int m, int n, int[][] ops) {
		int minL = m;
		int minW = n;
		for (int i = 0; i < ops.length; i++) {
			if(ops[i][0]<minL) {
				minL = ops[i][0];
			}
			if(ops[i][1]<minW) {
				minW = ops[i][1];
			}
		}
		return minL * minW;
	}
}
