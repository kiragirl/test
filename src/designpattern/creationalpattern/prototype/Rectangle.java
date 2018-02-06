/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.prototype;

/**
 * Title: Rectangle Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class Rectangle extends Shape{

	public Rectangle() {
		type = "Rectangle";
	}

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 */
	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
