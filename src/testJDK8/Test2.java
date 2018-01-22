/**
 * @author:liyiming
 * @date:2017年10月10日
 * Description:
 **/
package testJDK8;

/**
 * Title: Test2 Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2017年10月10日
 **/
public class Test2{

/*	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a, b);
		System.out.println(a + "," + b);
	}

	static void operate(StringBuffer c, StringBuffer d) {
		c.append(d);
		d = c;
		System.out.println(d);
	}*/
	
/*	public static void main(String[] args) {
		String a = "A";
		String b = "B";
		operate(a, b);
		System.out.println(a + "," + b);
	}

	static void operate(String a, String b) {
		a=a+b;
		System.out.println(a);
		b = a;
		System.out.println(b);
	}*/
	public static void main(String[] args) {
		Integer1 a = new Integer1(1000);
		Integer1 b = new Integer1(2000);
		operate(a, b);
		System.out.println(a + "," + b);
	}

	static void operate(Integer1 a, Integer1 b) {
		a.add(b);
		System.out.println(a);
		b = a;
		System.out.println(b);
	}
}
final class Integer1{
	int value;
	Integer1(int value){
		this.value = value;
	}
	void add(Integer1 value){
		this.value = this.value + value.value;
	}
	/**
	 * @author:liyiming
	 * @date:2017年10月10日
	 * @Description:
	 * @return
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(this.value);
	}
}