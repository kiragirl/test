/**
 * @author:liyiming
 * @date:2017年12月21日
 * Description:
 **/
package testJDK8;

/**
 * Title: TestSwap Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2017年12月21日
 **/
public class TestSwap{

	/**
	 * @author:liyiming
	 * @date:2017年12月21日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * AA aa1 = new AA(); AA aa2 = new AA(); aa2.setAa(1);
		 * System.out.println("aa1:"+aa1.getAa());
		 * System.out.println("aa2:"+aa2.getAa()); swap(aa1,aa2);
		 * System.out.println("aa1:"+aa1.getAa());
		 * System.out.println("aa2:"+aa2.getAa());
		 */
		int a = 10;
		int b = 20;
		method(a, b);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	static void swap(AA obj1, AA obj2) {
		/*
		 * AA aa = obj1; obj1 = obj2; obj2 = aa;
		 */
		AA aa = obj1;
		obj1.setAa(obj2.getAa());
		obj2.setAa(aa.getAa());
	}

	static void method(int a, int b) {
		a = a * 10;
		b = b * 10;
	}
}
