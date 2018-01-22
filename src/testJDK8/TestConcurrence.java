/**
* @author:liyiming
* @date:2017年10月24日
* Description:
**/
package testJDK8;


/**
 * 	Title: TestConcurrence
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2017年10月24日
 **/
public class TestConcurrence{
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			Runnable runnable = new Runnable(){
				@Override
				public void run() {
					System.out.println(MyUserIdIdentety.generateSequenceNo());
				}
			};
			Thread th = new Thread(runnable);
			th.start();
		}
	}
}
