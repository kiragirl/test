package leetcode.easy.array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 859. 亲密字符串
 * @author yiming.li
 * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。

	示例 1：
	
	输入： A = "ab", B = "ba"
	输出： true
	示例 2：
	
	输入： A = "ab", B = "ab"
	输出： false
	示例 3:
	
	输入： A = "aa", B = "aa"
	输出： true
	示例 4：
	
	输入： A = "aaaaaaabc", B = "aaaaaaacb"
	输出： true
	示例 5：
	
	输入： A = "", B = "aa"
	输出： false
 */
public class BuddyStrings {

	public static void main(String[] args) {
		BuddyStrings buddyStrings = new BuddyStrings();
		/*String A = "aaaaaaabc";
		String B = "aaaaaaacb";*/
		
		/*String A = "baaaaaaac";
		String B = "caaaaaaab";*/
		
		/*String A = "aaaaaaacb";
		String B = "aaaaaaacb";*/
		
		/*String A = "ab";
		String B = "ab";*/
		
		String A = "abcd";
		String B = "badc";
		
		/*String A = "bc";
		String B = "cb";*/
		System.out.println(buddyStrings.buddyStrings(A, B));
	}
	/**
	 * 暴力循环 时间超限
	 * @param A
	 * @param B
	 * @return
	 */
	public boolean buddyStrings1(String A, String B) {
		if (A.length() != B.length()) {
			return false;
		}
		for (int i = 0; i < A.length()-1; i++) {
			char a = A.charAt(i);
			for (int j = i+1; j < A.length(); j++) {
				char[] carray = A.toCharArray();
				char b = A.charAt(j);
				carray[j] = a;
				carray[i] = b;
				if (B.equals(new String(carray))) {
					return true;
				};
			}
		}
		return false;
	}
	
	public boolean buddyStrings(String A, String B) {
		if (A.length() != B.length()) {
			return false;
		}
		if(A.equals(B)){
			HashSet<Character> set = new HashSet<>();
			for (int i = 0; i < A.length(); i++) {
				if (set.contains(A.charAt(i))) {
					return true;
				}else{
					set.add(A.charAt(i));
				}
			}
		}else{
			boolean secondDifferent = false;
			char[] aArray = new char[2];
			char[] bArray = new char[2];
			int differentCount = 0;
			for (int i = 0; i < A.length(); i++) {
				char a = A.charAt(i);
				char b = B.charAt(i);
				if(a != b){
					differentCount++;
					if(differentCount>2){
						return false;
					}
					if(!secondDifferent){
						secondDifferent = true;
						aArray[1] = a;
						bArray[0] = b;
					}else{
						aArray[0] = a;
						bArray[1] = b;
					}
				}
			}
			if((new String(aArray)).equals(new String(bArray))){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
}
