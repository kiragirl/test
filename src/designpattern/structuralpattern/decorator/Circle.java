/**
* @author:liyiming
* @date:2018年2月5日
* Description:
**/
package designpattern.structuralpattern.decorator;


/**
 * 	Title: Circle
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月5日
 **/
public class Circle implements Shape{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 */
	@Override
	public void draw() {
		 System.out.println("Shape: Circle");
	}

}
