/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.behavioralpattern.mediator;

/**
 * Title: MediatorPatternDemo Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class MediatorPatternDemo{

	/**
	 * @author:liyiming
	 * @date:2018年2月6日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}

}
