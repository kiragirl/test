/**
* @author:liyiming
* @date:2018年5月7日
* Description:
**/
package leetcode.easy;

/**
 * Title: LongestCommonPrefix Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年5月7日
 **/
public class LongestCommonPrefix{

	/**
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strs = new String[]{"flower", "flow", "flight"};
		// System.out.println(longestCommonPrefix(strs));;
		// System.out.println(longestCommonPrefix2(strs));;
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
		String s = longestCommonPrefix.longestCommonPrefix("flower", strs);
		System.out.println("---------------");
		System.out.println(s);
	}

	/**
	 * 最长公共前缀
	 * 
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param strs
	 * @return
	 */
	public static String longestCommonPrefix(String[] strs) {
		String ss = "";
		if (strs.length == 0) {
			return ss;
		}
		if (strs.length == 1) {
			return strs[0];
		}
		for (int j = 0; j < strs[0].length(); j++) {
			ss = strs[0].substring(0, strs[0].length() - j);
			int k = 0;
			for (int i = 1; i < strs.length; i++) {
				if (!strs[i].startsWith(ss)) {
					ss = "";
					break;
				} else {
					k++;
				}
			}
			if (k == strs.length - 1) {
				break;
			}
		}
		return ss;
	}

	/**
	 * Horizontal scanning
	 * 
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param strs
	 * @return
	 */
	public static String longestCommonPrefix2(String[] strs) {
		if (strs.length == 0)
			return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++)
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		return prefix;
	}

	/**
	 * Vertical scanning
	 * 
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param strs
	 * @return
	 */
	public String longestCommonPrefix3(String[] strs) {
		if (strs.length == 0)
			return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++)
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		return prefix;
	}

	/**
	 * Divide and conquer
	 * 
	 * @author:liyiming
	 * @date:2018年5月7日
	 * @Description:
	 * @param strs
	 * @return
	 */
	public String longestCommonPrefix4(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		return longestCommonPrefix(strs, 0, strs.length - 1);
	}

	private String longestCommonPrefix(String[] strs, int l, int r) {
		if (l == r) {
			return strs[l];
		} else {
			int mid = (l + r) / 2;
			String lcpLeft = longestCommonPrefix(strs, l, mid);
			String lcpRight = longestCommonPrefix(strs, mid + 1, r);
			return commonPrefix(lcpLeft, lcpRight);
		}
	}

	String commonPrefix(String left, String right) {
		int min = Math.min(left.length(), right.length());
		for (int i = 0; i < min; i++) {
			if (left.charAt(i) != right.charAt(i))
				return left.substring(0, i);
		}
		return left.substring(0, min);
	}

	public String longestCommonPrefix(String q, String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];
		Trie trie = new Trie();
		for (int i = 1; i < strs.length; i++) {
			trie.insert(strs[i]);
		}
		return trie.searchLongestPrefix(q);
	}

	class TrieNode{

	/*	TrieNode() {
			links = new TrieNode[R];
			for (int i = 0; i < links.length; i++) {
				links[i] = null;
			}
		}*/

		private final int R = 26;
		
		private TrieNode[] links = new TrieNode[R];
		
		private boolean isEnd;
		// number of children non null links
		private int size;

		public void put(char ch, TrieNode node) {
			System.out.println(ch);
			links[ch - 'a'] = node;
			size++;
		}

		public int getLinks() {
			return size;
		}

		public boolean containsKey(char ch) {
			return links[ch - 'a'] != null;
		}

		public TrieNode get(char ch) {
			return links[ch - 'a'];
		}

		public void setEnd() {
			isEnd = true;
		}

		public boolean isEnd() {
			return isEnd;
		}
		// assume methods containsKey, isEnd, get, put are implemented as it is
		// described
		// in https://leetcode.com/articles/implement-trie-prefix-tree/)
		// Inserts a word into the trie.
	}

	public class Trie{

		private TrieNode root;

		public Trie() {
			root = new TrieNode();
		}

		public void insert(String word) {
			TrieNode node = root;
			for (int i = 0; i < word.length(); i++) {
				char currentChar = word.charAt(i);
				System.out.println(word);
				if (!node.containsKey(currentChar)) {
					node.put(currentChar, new TrieNode());
				}
				node = node.get(currentChar);
			}
			node.setEnd();
		}

		// assume methods insert, search, searchPrefix are implemented as it is
		// described
		// in https://leetcode.com/articles/implement-trie-prefix-tree/)
		private String searchLongestPrefix(String word) {
			TrieNode node = root;
			StringBuilder prefix = new StringBuilder();
			for (int i = 0; i < word.length(); i++) {
				char curLetter = word.charAt(i);
				if (node.containsKey(curLetter) && (node.getLinks() == 1) && (!node.isEnd())) {
					prefix.append(curLetter);
					node = node.get(curLetter);
				} else
					return prefix.toString();
			}
			return prefix.toString();
		}
	}
}
