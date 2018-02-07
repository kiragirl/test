/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package designpattern.j2ee.interceptingfilter;

/**
 * Title: DebugFilter Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public class DebugFilter implements Filter{

	public void execute(String request) {
		System.out.println("request log: " + request);
	}
}
