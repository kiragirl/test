/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.abstractfactory;

/**
 * Title: Square Description: Company:pusense
 * 正方形
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class Square implements Shape{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 */
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
