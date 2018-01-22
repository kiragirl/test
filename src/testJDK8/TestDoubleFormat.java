/**
* @author:liyiming
* @date:2017年12月7日
* Description:
**/
package testJDK8;


/**
 * 	Title: TestDoubleFormat
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2017年12月7日
 **/
public class TestDoubleFormat{

	/**
	 * @author:liyiming
	 * @date:2017年12月7日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		double a = 1211;
		
		String aa = String.valueOf(a);
		int aaa = aa.indexOf(".");
		System.out.println(aaa);
		int b = aa.length();
		if(b>aaa){
			System.out.println(b);
			double k = Double.valueOf(aa.substring(aaa+1, b));
			System.out.println(k);
			if(k>0){
				System.out.println(a);
			}else{
				System.out.println(Double.valueOf(aa.substring(0, aaa)));
			}
		}
		/*if(aaa.length>1){
			double b = Double.valueOf(aaa[1]);
			System.out.println(b);
			if(b>0){
				
			}else{
				System.out.println(aaa[0]);
			}
		}*/
	}

}
