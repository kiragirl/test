/**
* @author:liyiming
* @date:2018年5月9日
* Description:
**/
package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: PascalTriangle Description:杨辉三角 Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月9日
 **/
public class PascalTriangle{

	/**
	 * @author:liyiming
	 * @date:2018年5月9日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(generate(5).toString());
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> listIn = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					listIn.add(1);
				} else {
					listIn.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
				}
			}
			list.add(listIn);
		}
		return list;
	}
}
