/**
* @author:liyiming
* @date:2018年7月10日
* Description:
**/
package algorithm;

/**
 * Title: KMP Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年7月10日
 **/
public class KMP{

	public static void main(String[] args) {
		KMP kmp = new KMP();
		String t = "ababababcaa";
		String p = "abababca";
		System.out.println(kmp.kmp(t, p));;
	}

	public int kmp(String t, String p) {
		int i = 0;
		int j = 0;
		int[] next = getNext(p);

		while (i < t.length() && j < p.length()) {
			if (j == -1 || t.charAt(i) == p.charAt(j)) {
				i++;
				j++;
			}else {
				j = next[j];
			}
		}
		if(j==p.length()) {
			return i-j;
		}else {
			return -1;
		}
	}

	public int[] getNext(String s) {
		int[] next = new int[s.length()];
		next[0] = -1;
		int i = 0, j = -1;
		char[] sc = s.toCharArray();
		while (i < s.length() - 1) {
			if (j == -1 || sc[i] == sc[j]) {
				i++;
				j++;
				next[i] = j;
			} else {
				j = next[j];
			}
		}
		return next;
	}
}
