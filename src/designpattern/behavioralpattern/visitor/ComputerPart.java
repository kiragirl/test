/**
* @author:liyiming
* @date:2018年2月6日
* Description:
**/
package designpattern.behavioralpattern.visitor;


/**
 * 	Title: ComputerPart
 *	Description:完全可以写成抽象父类
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月6日
 **/
public interface ComputerPart{
	public void accept(ComputerPartVisitor computerPartVisitor);
}
