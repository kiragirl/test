/**
* @author:liyiming
* @date:2018年6月21日
* Description:
**/
package leetcode.easy;


/**
* 	Title: NimGame
*	Description:
*	Company:pusense
* 	@author ：lyiming
* 	@date ：2018年6月21日
**/
public class NimGame{

	/**
	 * @author:liyiming
	 * @date:2018年6月21日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(canWinNim(4));
	}
	public static boolean canWinNim(int n) {
	    return (n % 4 != 0);
	}
}
