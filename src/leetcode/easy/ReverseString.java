/**
* @author:liyiming
* @date:2018年6月27日
* Description:
**/
package leetcode.easy;

/**
 * Title: ReverseString Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月27日
 **/
public class ReverseString{

	/**
	 * @author:liyiming
	 * @date:2018年6月27日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "abcdefg";
		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseStr(s, 2));
	}

	public String reverseStr(String s, int k) {
		String a = "";
		int j = s.length() / (2 * k);
		int remainder = s.length() % (2 * k);
		for (int i = 0; i < j; i++) {
			a = a + (new StringBuffer(s.substring(i * 2 * k, i * 2 * k  + k))).reverse().toString()
					+ s.substring(i * 2 * k + k, i * 2 * k  + 2 * k);
		}
		if (remainder < k && remainder > 0) {

			a = a + (new StringBuffer(s.substring(j * 2 * k, s.length()))).reverse().toString();
		} else if (remainder >= k && remainder < 2 * k) {
			a = a + (new StringBuffer(s.substring(j * 2 * k, j * 2 * k + k))).reverse().toString()
					+ s.substring(j * 2 * k + k, s.length());
		}
		return a;
	}
}
