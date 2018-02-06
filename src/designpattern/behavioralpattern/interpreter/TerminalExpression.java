/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.behavioralpattern.interpreter;

/**
 * Title: TerminalExpression Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class TerminalExpression implements Expression{

	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		if (context.contains(data)) {
			return true;
		}
		return false;
	}

}
