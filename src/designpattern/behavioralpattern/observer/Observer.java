/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.behavioralpattern.observer;

/**
 * Title: Observer Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public abstract class Observer{

	protected Subject subject;

	public abstract void update();
}
