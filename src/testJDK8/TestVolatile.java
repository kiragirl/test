/**
 * @author:liyiming
 * @date:2017年11月1日
 * Description:
 **/
package testJDK8;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Title: TestVolatile Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2017年11月1日
 **/
public class TestVolatile{

	public volatile int inc = 0;
	private TestReference testReference;
	public void increase() {
		inc++;
	}

	public static void main(String[] args) {
		int k = 10000;
		TestVolatile test = new TestVolatile();
		CountDownLatch cdl = new CountDownLatch(k);
		AtomicInteger money = new AtomicInteger(0);
		//String money2 = "";
		for (int i = 0; i < k; i++) {
			new Thread(() -> {
				money.addAndGet(1);
				test.testsysout();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				cdl.countDown();
			}).start();
		}
		try {
			cdl.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(money.get());
	}
	
	public void testsysout(){
		
	}
}
