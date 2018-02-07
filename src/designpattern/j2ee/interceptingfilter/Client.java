/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package designpattern.j2ee.interceptingfilter;

/**
 * Title: Client Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public class Client{

	FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}
}
