/**
* @author:liyiming
* @date:2017年12月5日
* Description:
**/
package testJDK8;


/**
 * 	Title: TestVolatile2
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2017年12月5日
 **/
public class TestVolatile2{
	private static boolean stop = false;
	private static volatile int  i = 0;
	//private static int  i = 0;
	/**
	 * @author:liyiming
	 * @date:2017年12月5日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		Thread th = new Thread(()->{
			while(!stop){
				i++;
			}
			System.out.println(" thread is stop i="+i);
		});
		th.start();
		try {
			Thread.sleep(1000);
			stop=true;
			System.out.println("stop is:"+stop);
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
