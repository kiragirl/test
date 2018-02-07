/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package designpattern.j2ee.interceptingfilter;

/**
 * Title: AuthenticationFilter Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public class AuthenticationFilter implements Filter{

	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}
}
