/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.builder;

/**
 * Title: ChickenBurger Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class ChickenBurger extends Burger{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @return
	 */
	@Override
	public String name() {
		return "Chicken Burger";
	}

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @return
	 */
	@Override
	public float price() {
		return 50.5f;
	}

}
