/**
* @author:liyiming
* @date:2017年11月3日
* Description:
**/
package testJDK8.locktest;

import java.util.Random;


/**
 * 	Title: TestMain
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2017年11月3日
 **/
public class TestMain{

	/**
	 * @author:liyiming
	 * @date:2017年11月3日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		Single single = new Single();
		for(int i=0;i<1000;i++){
			new Thread(()->{
				single.addLoanInvestMoney("lo10000", 10);
				Random r = new Random();
				int k = r.nextInt(10);
				if(k%3==0){
					single.minusLoanInvestMoney("lo10000", 10);
				}
			}).start();
		}
	}
	
}
