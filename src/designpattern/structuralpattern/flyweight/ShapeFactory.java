/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.structuralpattern.flyweight;

import java.util.HashMap;

/**
 * Title: ShapeFactory Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class ShapeFactory{

	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
