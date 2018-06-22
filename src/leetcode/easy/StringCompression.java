/**
* @author:liyiming
* @date:2018年6月22日
* Description:
**/
package leetcode.easy;


/**
 * Title: StringCompression Description:给定一组字符，使用原地算法将其压缩。
 * 
 * 压缩后的长度必须始终小于或等于原数组长度。
 * 
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 * 
 * 在完成原地修改输入数组后，返回数组的新长度。
 * 
 * 
 * 
 * 进阶： 你能否仅使用O(1) 空间解决问题？
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入： ["a","a","b","b","c","c","c"]
 * 
 * 输出： 返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
 * 
 * 说明： "aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。
 * 
 * 示例 2：
 * 
 * 输入： ["a"]
 * 
 * 输出： 返回1，输入数组的前1个字符应该是：["a"]
 * 
 * 说明： 没有任何字符串被替代。
 * 
 * 示例 3：
 * 
 * 输入： ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * 
 * 输出： 返回4，输入数组的前4个字符应该是：["a","b","1","2"]。
 * 
 * 说明： 由于字符"a"不重复，所以不会被压缩。"bbbbbbbbbbbb"被“b12”替代。 注意每个数字在数组中都有它自己的位置。
 * 
 * 注意：
 * 
 * 所有字符都有一个ASCII值在[35, 126]区间内。 1 <= len(chars) <= 1000。
 * 
 * 
 * Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月22日
 **/
public class StringCompression{

	/**
	 * @author:liyiming
	 * @date:2018年6月22日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		// char[] chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
		 // char[] chars = new char[]{'a', 'a', 'a', 'b'};
		// char[] chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c','c', 'c', 'c', 'c', 'c', 'c', 'c', 'c'};
		 //char[] chars = new char[]{'6', 'E', '<', '`', '|', 'v', 'p', 'k',':', 'E'};
		char[] chars = new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'};
		// char[] chars = new char[]{'a'};
		StringCompression sc = new StringCompression();
		// System.out.println(sc.compress(chars) + ",chars:" +
		// String.valueOf(chars));
		System.out.println(sc.compress2(chars) + ",chars:" + String.valueOf(chars));
	}

	public int compress2(char[] chars) {
		int k = 0;
		for (int i = 0; i < chars.length;) {
			char c = chars[i];
			int n = i + 1;
			while (n < chars.length && chars[n] == c) {
				n++;
			}
			int a = n - i;
			chars[k] = c;
			if (a > 1) {
				String b = String.valueOf(a);
				char[] d = b.toCharArray();
				for (int j = 0; j < d.length; j++) {
					chars[k + j + 1] = d[j];
				}
				k += d.length;
			}
			k++;
			i += a;
		}
		return k;
	}

	public int compress(char[] chars) {
		int[] count = new int[128];
		for (char c : chars) {
			count[c]++;
		}
		int k = 0;
		for (int i = 0; i < chars.length;) {
			char c = chars[i];
			int a = count[c];
			String b = String.valueOf(a);
			char[] d = b.toCharArray();
			if (a > 1) {
				for (int j = 0; j < d.length; j++) {
					chars[k + j + 1] = d[j];
				}
				k++;
			}
			k += d.length;
			i += a;
		}
		return k;
	}
}
