/**
* @author:liyiming
* @date:2018年1月19日
* Description:
**/
package jiuzhang;


/**
 * 	Title: AAAAA
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年1月19日
 **/
public class Solution {
    public static boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        int[] next = new int[l];
        next[0] = -1;
        int i, j = -1;
        for (i = 1; i < l; i++) {
            while (j >= 0 && s.charAt(i) != s.charAt(j + 1)) {
                j = next[j];
            }
            if (s.charAt(i) == s.charAt(j + 1)) {
                j++;
            }
            next[i] = j;
        }
        int lenSub = l - 1 - next[l - 1];
        return lenSub != l && l % lenSub ==0;
    }
    public static void main(String[] args) {
    	System.out.println(repeatedSubstringPattern("abab"));
    	System.out.println(repeatedSubstringPattern("ababcababc"));
    	System.out.println("working11111");
    	System.out.println("working in master");
    	String sss= "sdfsdfasdfsadf";
    	sss.indexOf("11");
    }
}
