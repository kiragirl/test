/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.structuralpattern.bridge;

/**
 * Title: RedCircle Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class RedCircle implements DrawAPI{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @param radius
	 * @param x
	 * @param y
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}

}
