/**
* @author:liyiming
* @date:2018年2月5日
* Description:
**/
package designpattern.creationalpattern.abstractfactory;


/**
 * 	Title: Green
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月5日
 **/
public class Green implements Color{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 */
	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

}
