/**
* @author:liyiming
* @date:2018年7月9日
* Description:
**/
package leetcode.hard.string;

/**
 * Title: ShortestPalindrome Description: Company:pusense 给定一个字符串
 * s，你可以通过在字符串前面添加字符将其转换为回文串。找到并返回可以用这种方式转换的最短回文串。
 * 
 * 示例 1:
 * 
 * 输入: "aacecaaa" 输出: "aaacecaaa"
 * 
 * 示例 2:
 * 
 * 输入: "abcd" 输出: "dcbabcd"
 * 
 * 
 * @author ：lyiming
 * @date ：2018年7月9日
 **/
public class ShortestPalindrome{

	/**
	 * @author:liyiming
	 * @date:2018年7月9日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		ShortestPalindrome sp = new ShortestPalindrome();
		// String s = "aacecaaa";
		String s = "abababca";
		// String s = "abcd";
		System.out.println(sp.shortestPalindrome2(s));
	}

	/**
	 * 利用后缀与前缀最大匹配PMT（Partial Match Table） 找出公共最大匹配长度 则原字符串剩余长度为需要额外添加的长度
	 * 将末尾字符截取反转
	 * 
	 * @author:liyiming
	 * @date:2018年7月10日
	 * @Description:
	 * @param s
	 * @return
	 */
	public String shortestPalindrome2(String s) {
		String tmp = s + "#" + new StringBuilder(s).reverse().toString();
		int[] table = getTable(tmp);
		System.out.println(table[table.length - 1]);
		return new StringBuilder(s.substring(table[table.length - 1])).reverse().toString() + s;

	}

	// KMP算法
	public int[] getTable(String s) {
		int len = s.length();
		int[] table = new int[len];
		char[] a = s.toCharArray();
		// i是从1开始
		for (int i = 1, k = 0; i < len; i++) {
			while (k > 0 && a[i] != a[k]) {
				k = table[k - 1];
			}
			if (a[i] == a[k])
				k++;
			table[i] = k;
		}
		return table;
	}

	/**
	 * 每次拿末尾字符反转添加到原字符头， 暴力循环优化版 只比较剩余串是不是回文串就可以
	 * 
	 * @author:liyiming
	 * @date:2018年7月9日
	 * @Description:
	 * @param s
	 * @return
	 */
	public String shortestPalindrome(String s) {
		char[] sc = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			int half = (s.length() - i) / 2;
			int j = 0;
			while (j < half) {
				if (sc[j] != sc[s.length() - i - j - 1]) {
					break;
				} else {
					j++;
				}
			}
			if (i == 0 && j == half) {
				return s;
			}
			if (j == half) {
				String ss = new StringBuffer(s.substring(s.length() - i, s.length())).reverse().toString() + s;
				return ss;
			}
		}
		return s;
	}
}
