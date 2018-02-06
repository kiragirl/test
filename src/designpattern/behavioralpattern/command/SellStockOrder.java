/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.behavioralpattern.command;

/**
 * Title: SellStockOrder Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class SellStockOrder implements Order{

	private Stock abcStock;

	public SellStockOrder(Stock abcStock) {
		this.abcStock = abcStock;
	}

	/**
	 * @author:liyiming
	 * @date:2018年2月6日
	 * @Description:
	 */
	@Override
	public void execute() {
		abcStock.sell();
	}

}
