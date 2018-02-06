/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.behavioralpattern.nullobject;

/**
 * Title: RealCustomer Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class RealCustomer extends AbstractCustomer{

	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isNil() {
		return false;
	}
}
