/**
 * @author:liyiming
 * @date:2018年2月7日
 * Description:
 **/
package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: TestBean Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月7日
 **/
public class TestBean{

	/**
	 * @author:liyiming
	 * @date:2018年2月7日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		List<A> list = new ArrayList<A>();
		A a = new A();
		a.setA(10);
		list.add(a);
		A b = new A();
		//b = list.get(0);
		b.setA(a.getA());
		System.out.println(a.getA());
	}

}

class A{

	private double a;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

}
