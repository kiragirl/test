/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package designpattern.j2ee.servicelocator;

/**
 * Title: ServiceLocator Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public class ServiceLocator{

	private static Cache cache;

	static {
		cache = new Cache();
	}

	public static Service getService(String jndiName) {

		Service service = cache.getService(jndiName);

		if (service != null) {
			return service;
		}

		InitialContext context = new InitialContext();
		Service service1 = (Service) context.lookup(jndiName);
		cache.addService(service1);
		return service1;
	}
}
