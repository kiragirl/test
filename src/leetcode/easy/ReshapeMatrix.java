/**
* @author:liyiming
* @date:2018年6月27日
* Description:
**/
package leetcode.easy;

/**
 * Title: ReshapeMatrix Description: Company:pusense In MATLAB, there is a very
 * useful function called 'reshape', which can reshape a matrix into a new one
 * with different size but keep its original data.
 * 
 * You're given a matrix represented by a two-dimensional array, and two
 * positive integers r and c representing the row number and column number of
 * the wanted reshaped matrix, respectively.
 * 
 * The reshaped matrix need to be filled with all the elements of the original
 * matrix in the same row-traversing order as they were.
 * 
 * If the 'reshape' operation with given parameters is possible and legal,
 * output the new reshaped matrix; Otherwise, output the original matrix.
 * 
 * @author ：lyiming
 * @date ：2018年6月27日
 **/
public class ReshapeMatrix{

	/**
	 * @author:liyiming
	 * @date:2018年6月27日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] nums = new int[][]{{1, 2}, {3, 4}};
		ReshapeMatrix rm = new ReshapeMatrix();
		int[][] reshapeNums = rm.matrixReshape(nums, 4, 1);
		for (int i = 0; i < reshapeNums.length; i++) {
			for (int j = 0; j < reshapeNums[i].length; j++) {
				System.out.print(reshapeNums[i][j]);
			}
			System.out.println();
		}
	}

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if(nums.length==0) {
			return nums;
		}
		if (nums.length * nums[0].length < r * c) {
			return nums;
		}
		int[][] reshapeNums = new int[r][c];
		int a = 0;
		int b = 0;
		for (int i = 0; i < nums.length; i++) {
			int[] numss = nums[i];
			for (int j = 0; j < numss.length; j++) {
				reshapeNums[a][b] = numss[j];
				b++;
				if (b == c) {
					a++;
					b = 0;
				}
			}
		}
		return reshapeNums;
	}
}
