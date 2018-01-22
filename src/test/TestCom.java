/**
* @author:liyiming
* @date:2017年5月25日
* Description:
**/
package test;

import java.math.BigDecimal;


/**
 * 	Title: TestCom
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2017年5月25日
 **/
public class TestCom{

	/**
	 * @author:liyiming
	 * @date:2017年5月25日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		double fee;
		Double actualMoney = 40000D;;
		Double counter_Fee_1 = 0.0013;
		Double counter_Fee_sumapay = 0.0022;
		Double counter_Fee_sumapay_begin = 2D;
		BigDecimal Fee_sumapay = new BigDecimal(counter_Fee_sumapay * actualMoney);
		
		Fee_sumapay = new BigDecimal(2D);
		System.out.println(Fee_sumapay);
		
		BigDecimal Fee_sumapay_begin = new BigDecimal(counter_Fee_sumapay_begin);
		System.out.println(Fee_sumapay_begin);
		System.out.println(Fee_sumapay.compareTo(Fee_sumapay_begin));
		if(Fee_sumapay.compareTo(Fee_sumapay_begin) == -1){
			fee = 2+counter_Fee_1*actualMoney;
		}else{
			fee = actualMoney*counter_Fee_sumapay+counter_Fee_1*actualMoney;
		}
		System.out.println(fee);
	}

}
