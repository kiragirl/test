/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.structuralpattern.facade;

/**
 * Title: FacadePatternDemo Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class FacadePatternDemo{

	/**
	 * @author:liyiming
	 * @date:2018年2月6日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();

	}

}
