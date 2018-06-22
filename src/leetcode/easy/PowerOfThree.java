/**
* @author:liyiming
* @date:2018年6月22日
* Description:
**/
package leetcode.easy;

/**
 * Title: PowerOfThree Description:给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * 
 * 示例 1:
 * 
 * 输入: 27 输出: true
 * 
 * 示例 2:
 * 
 * 输入: 0 输出: false
 * 
 * 示例 3:
 * 
 * 输入: 9 输出: true
 * 
 * 示例 4:
 * 
 * 输入: 45 输出: false
 * 
 * 进阶： 你能不使用循环或者递归来完成本题吗？
 * 
 * Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月22日
 **/
public class PowerOfThree{

	/**
	 * 
	 */
	public PowerOfThree() {
	}

	/**
	 * @author:liyiming
	 * @date:2018年6月22日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		PowerOfThree p = new PowerOfThree();
		System.out.println(p.isPowerOfThree(5));
	}

	public boolean isPowerOfThree(int n) {
		if (n <= 0) {
			return false;
		}

		while (n != 1) {
			if (n % 3 != 0) {
				return false;
			}
			n = n / 3;
		}
		return true;
	}

	public boolean isPowerOfThree2(int n) {
		return Integer.toString(n, 3).matches("^10*$");
	}

	public boolean isPowerOfThree3(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}
	
	public boolean isPowerOfThree4(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
