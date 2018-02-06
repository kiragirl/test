/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.builder;

/**
 * Title: Item Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public interface Item{

	public String name();

	public Packing packing();

	public float price();
}
