/**
* @author:liyiming
* @date:2018年2月6日
* Description:
**/
package designpattern.structuralpattern.facade;



/**
 * 	Title: Square
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月6日
 **/
public class Square implements Shape{

	/**
	 * @author:liyiming
	 * @date:2018年2月6日
	 * @Description:
	 */
	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}

}
