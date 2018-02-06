/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.structuralpattern.decorator;

/**
 * Title: Rectangle Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}
