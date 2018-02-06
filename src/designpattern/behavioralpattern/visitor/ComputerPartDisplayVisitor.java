/**
* @author:liyiming
* @date:2018年2月6日
* Description:
**/
package designpattern.behavioralpattern.visitor;


/**
 * 	Title: ComputerPartDisplayVisitor
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月6日
 **/
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

	/**
	 * @author:liyiming
	 * @date:2018年2月6日
	 * @Description:
	 * @param computerPart
	 */
	@Override
	public void visit(ComputerPart computerPart) {
		System.out.println(computerPart.toString());
	}

}
