/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.abstractfactory;

/**
 * Title: ShapeFactory Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class ShapeFactory extends AbstractFactory{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @param shapeType
	 * @return
	 */
	@Override
	Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @param color
	 * @return
	 */
	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
