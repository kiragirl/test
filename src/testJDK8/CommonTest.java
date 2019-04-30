/**
* @author:liyiming
* @date:2017年11月24日
* Description:
**/
package testJDK8;

/**
 * 	Title: CommonTest
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2017年11月24日
 **/
public class CommonTest{

	/**
	 * @author:liyiming
	 * @date:2017年11月24日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		String idcard = "211481198905157210";
		int cardSex = Integer.valueOf(idcard.substring(16, 17));
		System.out.println(cardSex);
	}

}
