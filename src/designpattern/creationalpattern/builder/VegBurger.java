/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.builder;

/**
 * Title: VegBurger Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class VegBurger extends Burger{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @return
	 */
	@Override
	public String name() {
		return "Veg Burger";
	}

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @return
	 */
	@Override
	public float price() {
		return 25.0f;
	}

}
