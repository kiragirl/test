/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.builder;

/**
 * Title: Pepsi Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class Pepsi extends ColdDrink{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @return
	 */
	@Override
	public String name() {
		return "Pepsi";
	}

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @return
	 */
	@Override
	public float price() {
		return 35.0f;
	}

}
