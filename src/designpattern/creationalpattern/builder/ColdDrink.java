/**
* @author:liyiming
* @date:2018年2月5日
* Description:
**/
package designpattern.creationalpattern.builder;


/**
 * 	Title: ColdDrink
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月5日
 **/
public abstract class ColdDrink implements Item{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @return
	 */
	@Override
	public Packing packing() {
		return new Bottle();
	}

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @return
	 */
	@Override
    public abstract float price();

}
