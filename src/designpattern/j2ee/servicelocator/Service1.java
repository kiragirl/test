/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package designpattern.j2ee.servicelocator;

/**
 * Title: Service1 Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public class Service1 implements Service{

	public void execute() {
		System.out.println("Executing Service1");
	}

	@Override
	public String getName() {
		return "Service1";
	}
}
