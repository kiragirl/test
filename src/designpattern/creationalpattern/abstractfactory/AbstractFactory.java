/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.abstractfactory;

/**
 * Title: AbstractFactory Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public abstract class AbstractFactory{

	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}
