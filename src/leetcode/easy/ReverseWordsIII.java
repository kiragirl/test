/**
* @author:liyiming
* @date:2018年6月27日
* Description:
**/
package leetcode.easy;

/**
 * Title: ReverseWordsIII Description: Company:pusense
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * 
 * 示例 1:
 * 
 * 输入: "Let's take LeetCode contest" 输出: "s'teL ekat edoCteeL tsetnoc"
 * 
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格
 * 
 * @author ：lyiming
 * @date ：2018年6月27日
 **/
public class ReverseWordsIII{

	/**
	 * @author:liyiming
	 * @date:2018年6月27日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseWordsIII rw = new ReverseWordsIII();
		String s = "Let's take LeetCode contest";
		System.out.println(rw.reverseWords(s));
	}

	public String reverseWords(String s) {
		StringBuffer a = new StringBuffer();
		String[] b = s.split(" ");
		for (int i = 0; i < b.length; i++) {
			StringBuffer d = new StringBuffer(b[i]);
			a.append(d.reverse());
			if (i != b.length - 1) {
				a.append(" ");
			}
		}
		return a.toString();
	}
}
