/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.behavioralpattern.command;

/**
 * Title: BuyStockOrder Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class BuyStockOrder implements Order{

	private Stock abcStock;

	public BuyStockOrder(Stock abcStock) {
		this.abcStock = abcStock;
	}

	/**
	 * @author:liyiming
	 * @date:2018年2月6日
	 * @Description:
	 */
	@Override
	public void execute() {
		 abcStock.buy();
	}

}
