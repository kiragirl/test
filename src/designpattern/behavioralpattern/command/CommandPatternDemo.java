/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.behavioralpattern.command;

/**
 * Title: CommandPatternDemo Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class CommandPatternDemo{

	/**
	 * @author:liyiming
	 * @date:2018年2月6日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		Stock abcStock = new Stock();

		Order buyStockOrder = new BuyStockOrder(abcStock);
		Order sellStockOrder = new SellStockOrder(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
 
		broker.placeOrders();

	}

}
