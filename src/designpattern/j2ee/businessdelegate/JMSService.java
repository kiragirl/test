/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package designpattern.j2ee.businessdelegate;

/**
 * Title: JMSService Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public class JMSService implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}
}
