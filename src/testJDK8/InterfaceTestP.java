/**
 * @author:liyiming
 * @date:2018年3月6日
 * Description:
 **/
package testJDK8;

/**
 * Title: InterfaceTestP Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年3月6日
 **/
public class InterfaceTestP implements InterfaceTest{
	
	public static void main(String[] args) {
		InterfaceTest InterfaceTestC = new InterfaceTestC();
		InterfaceTestC.a();
	}
	/**
	 * @author:liyiming
	 * @date:2018年3月6日
	 * @Description:
	 */
	@Override
	public void a() {
		System.out.println("this is p a");
		b();
	}

	/**
	 * @author:liyiming
	 * @date:2018年3月6日
	 * @Description:
	 */
	@Override
	public void b() {
		System.out.println("this is p b");
		this.c();
	}

	/**
	 * @author:liyiming
	 * @date:2018年3月6日
	 * @Description:
	 */
	@Override
	public void c() {
		System.out.println("this is p c");
	}

}
