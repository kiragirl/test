/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package designpattern.j2ee.businessdelegate;

/**
 * Title: EJBService Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public class EJBService implements BusinessService{

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}
}
