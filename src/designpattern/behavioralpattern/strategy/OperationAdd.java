/**
* @author:liyiming
* @date:2018年2月6日
* Description:
**/
package designpattern.behavioralpattern.strategy;


/**
 * 	Title: OperationAdd
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月6日
 **/
public class OperationAdd implements Strategy{

	/**
	 * @author:liyiming
	 * @date:2018年2月6日
	 * @Description:
	 * @param num1
	 * @param num2
	 * @return
	 */
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}

}
