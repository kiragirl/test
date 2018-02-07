/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package designpattern.j2ee.servicelocator;

/**
 * Title: Service2 Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public class Service2 implements Service{

	public void execute() {
		System.out.println("Executing Service2");
	}

	@Override
	public String getName() {
		return "Service2";
	}
}
