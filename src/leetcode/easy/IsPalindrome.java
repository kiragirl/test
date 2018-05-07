/**
* @author:liyiming
* @date:2018年5月7日
* Description:
**/
package leetcode.easy;

/**
 * Title: IsPalindrome Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月7日
 **/
public class IsPalindrome{

	/**
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isPalindrome(101));
		System.out.println(isPalindrome2(101));
	}
	/**
	 * 回文数
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param x
	 * @return
	 */
	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		String a = String.valueOf(x);
		StringBuffer b = new StringBuffer(String.valueOf(x));
		return a.equals(b.reverse().toString());
	}
	/**
	 * 参考答案
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param x
	 * @return
	 */
	public static boolean isPalindrome2(int x) {
		// Special cases:
		// As discussed above, when x < 0, x is not a palindrome.
		// Also if the last digit of the number is 0, in order to be a
		// palindrome,
		// the first digit of the number also needs to be 0.
		// Only 0 satisfy this property.
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}

		int revertedNumber = 0;
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}

		// When the length is an odd number, we can get rid of the middle digit
		// by revertedNumber/10
		// For example when the input is 12321, at the end of the while loop we
		// get x = 12, revertedNumber = 123,
		// since the middle digit doesn't matter in palidrome(it will always
		// equal to itself), we can simply get rid of it.
		return x == revertedNumber || x == revertedNumber / 10;
	}
}
