/**
* @author:liyiming
* @date:2018年2月5日
* Description:
**/
package designpattern.creationalpattern.abstractfactory;


/**
 * 长方形
 * 	Title: Rectangle
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月5日
 **/
public class Rectangle implements Shape{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 */
	@Override
	public void draw() {
		 System.out.println("Inside Rectangle::draw() method.");
	}

}
