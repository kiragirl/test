/**
* @author:liyiming
* @date:2017年12月4日
* Description:
**/
package testJDK8;

import java.util.Arrays;


/**
 * 	Title: TestStringFinal
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2017年12月4日
 **/
public class TestStringFinal{

	/**
	 * @author:liyiming
	 * @date:2017年12月4日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		String[] s1 = new String[]{"hi","hi","hi"};
		String[] s2 = new String[s1.length];
		System.arraycopy(s1, 0, s2, 0, s1.length);
		s1[2]="aa";
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
		A a = new A();
		B b = new B();
		a.a=1;
		b.a=1;
		setA(a);
		setB(b);
		System.out.println(a.a);
		System.out.println(b.a);
	}
	public static void setA(A a){
		a.a=10;
	}
	public static void setB(B b){
		b = new B();
		b.a=20;
	}
}
 class A{
	int a;
}
 class B{
	int a;
}