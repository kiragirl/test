/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.structuralpattern.bridge;


/**
 * Title: Circle Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class Circle extends Shape{

	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
