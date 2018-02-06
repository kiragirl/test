/**
* @author:liyiming
* @date:2018年2月6日
* Description:
**/
package designpattern.behavioralpattern.visitor;


/**
 * 	Title: Monitor
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月6日
 **/
public class Monitor implements ComputerPart{

	/**
	 * @author:liyiming
	 * @date:2018年2月6日
	 * @Description:
	 * @param computerPartVisitor
	 */
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
	@Override
	public String toString() {
		return "Monitor [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
