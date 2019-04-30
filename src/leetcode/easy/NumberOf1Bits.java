/**
* @author:liyiming
* @date:2018年5月15日
* Description:
**/
package leetcode.easy;

/**
 * Title: NumberOf1Bits Description: Company:pusense
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 * 
 * 示例 :
 * 
 * 输入: 11 输出: 3 解释: 整数 11 的二进制表示为 00000000000000000000000000001011
 * 
 * 示例 2:
 * 
 * 输入: 128 输出: 1 解释: 整数 128 的二进制表示为 00000000000000000000000010000000
 * 
 * @author ：lyiming
 * @date ：2018年5月15日
 **/
public class NumberOf1Bits{

	/**
	 * @author:liyiming
	 * @date:2018年5月15日
	 * @Description:位与运算符（&）运算规则                                  ：两个数都转为二进制，然后从高位开始比较，如果两个数都为1则为1，否则为0
	 * @param args
	 */
	public static void main(String[] args) {
		// 4294967295 (11111111111111111111111111111111)
		int m = 7;
		System.out.println("m的二 进 制码是："+Integer.toBinaryString(m));
		System.out.println("m>>2的二进制码是："+Integer.toBinaryString(m>>2));
		System.out.println("(m>>2)="+(m>>2));
		System.out.println("m<<2的二进制码是："+Integer.toBinaryString(m<<2));
		System.out.println("(m<<2)=:"+(m<<2));
		System.out.println("m>>>24的二进制码是："+Integer.toBinaryString(m>>>24));
		System.out.println(" m>>>24 :"+ (m>>>24));
		System.out.println(126&125);
		System.out.println(hammingWeight(123));
	}

	public static int hammingWeight(int n) {
		int bits = 0;
	    int mask = 1;
	    for (int i = 0; i < 32; i++) {
	        if ((n & mask) != 0) {
	            bits++;
	        }
	        mask <<= 1;
	    }
	    return bits;
	}
	/**
	 * Bit Manipulation Trick
	 * n&(n-1) 比较值为0或者n-1 为0 证明n的二进制只包含一个1
	 * @author:liyiming
	 * @date:2018年5月15日
	 * @Description:
	 * @param n
	 * @return
	 */
	public int hammingWeight2(int n) {
	    int sum = 0;
	    while (n != 0) {
	        sum++;
	        n &= (n - 1);
	    }
	    return sum;
	}
}
