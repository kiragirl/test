/**
* @author:liyiming
* @date:2018年6月20日
* Description:
**/
package leetcode.easy;

import java.util.Arrays;

/**
 * Title: ValidAnagram Description:给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * 
 * 示例 1:
 * 
 * 输入: s = "anagram", t = "nagaram" 输出: true
 * 
 * 示例 2:
 * 
 * 输入: s = "rat", t = "car" 输出: false
 * 
 * 说明: 你可以假设字符串只包含小写字母。
 * 
 * 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * 
 * Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月20日
 **/
public class ValidAnagram{

	/**
	 * @author:liyiming
	 * @date:2018年6月20日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		String a = "anagram",b = "nagaram",s = "rat", t = "car";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char resulta[] = s.toCharArray();
		char resultb[] = t.toCharArray();
		Arrays.sort(resulta);
		Arrays.sort(resultb);
		String a = new String(resulta);
		String b = new String(resultb);
		return a.equals(b);
	}
}
