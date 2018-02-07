/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package designpattern.j2ee.interceptingfilter;

/**
 * Title: Target Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public class Target{

	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}
}
