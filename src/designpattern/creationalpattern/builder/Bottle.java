/**
* @author:liyiming
* @date:2018年2月5日
* Description:
**/
package designpattern.creationalpattern.builder;


/**
 * 	Title: Bottle
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月5日
 **/
public class Bottle implements Packing{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @return
	 */
	@Override
	public String pack() {
		 return "Bottle";
	}

}
