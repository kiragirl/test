/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.creationalpattern.builder;

/**
 * Title: Burger Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public abstract class Burger implements Item{

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
