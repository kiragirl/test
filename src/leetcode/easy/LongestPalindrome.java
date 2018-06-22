/**
* @author:liyiming
* @date:2018年6月22日
* Description:
**/
package leetcode.easy;

import java.util.HashMap;

/**
 * Title: LongestPalindrome Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月22日
 **/
public class LongestPalindrome{

	/**
	 * @author:liyiming
	 * @date:2018年6月22日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		LongestPalindrome l = new LongestPalindrome();
		String s = "abccccddA";
		//String s = "aa";
		System.out.println(l.longestPalindrome(s));
	}

	public int longestPalindrome(String s) {
		if (s.length() == 1) {
			return 1;
		}
		HashMap<String, String> map = new HashMap<>();
		char[] a = s.toCharArray();
		int length = 0;
		for (char b : a) {
			String bb = String.valueOf(b);
			if (map.containsKey(bb)) {
				length += 2;
				map.remove(bb);
			} else {
				map.put(bb, null);
			}
		}
		if (length < s.length() )
			length++;
		return length;
	}
	
    public int longestPalindrome2(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}
