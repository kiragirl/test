/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.structuralpattern.bridge;

/**
 * Title: Shape Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public abstract class Shape{

	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
