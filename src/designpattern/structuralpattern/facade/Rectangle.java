/**
* @author:liyiming
* @date:2018年2月6日
* Description:
**/
package designpattern.structuralpattern.facade;


/**
 * 	Title: Rectangle
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月6日
 **/
public class Rectangle implements Shape{

	/**
	 * @author:liyiming
	 * @date:2018年2月6日
	 * @Description:
	 */
	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}

}
