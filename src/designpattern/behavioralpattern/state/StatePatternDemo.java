/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.behavioralpattern.state;

/**
 * Title: StatePatternDemo Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class StatePatternDemo{

	/**
	 * @author:liyiming
	 * @date:2018年2月6日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();

		State startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		State stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}
}
