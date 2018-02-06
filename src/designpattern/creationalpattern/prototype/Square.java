/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.prototype;

/**
 * Title: Square Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class Square extends Shape{

	public Square() {
		type = "Square";
	}

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 */
	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
