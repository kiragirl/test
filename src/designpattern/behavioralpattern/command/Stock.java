/**
 * @author:liyiming
 * @date:2018年2月6日
 * Description:
 **/
package designpattern.behavioralpattern.command;

/**
 * Title: Stock Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月6日
 **/
public class Stock{

	private String name = "ABC";
	private int quantity = 10;

	public void buy() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought  1");
	}

	public void sell() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
	}
}
