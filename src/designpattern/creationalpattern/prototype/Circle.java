/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.prototype;

/**
 * Title: Circle Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class Circle extends Shape{

	public Circle() {
		type = "Circle";
	}

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 */
	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
