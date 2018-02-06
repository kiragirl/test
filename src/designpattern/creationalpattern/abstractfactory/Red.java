/**
* @author:liyiming
* @date:2018年2月5日
* Description:
**/
package designpattern.creationalpattern.abstractfactory;


/**
 * 	Title: Red
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月5日
 **/
public class Red implements Color{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 */
	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}

}
