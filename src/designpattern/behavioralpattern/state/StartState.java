/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.behavioralpattern.state;

/**
 * Title: StartState Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class StartState implements State{

	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}

}
