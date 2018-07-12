/**
* @author:liyiming
* @date:2018年7月11日
* Description:
**/
package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @Title: StringPermute
 * @Description:
 * @Company:pusense
 * @author ：liyiming
 * @date ：2018年7月11日
 **/
public class StringPermute{

	/**
	 * @author:liyiming
	 * @date:2018年7月11日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		StringPermute sp = new StringPermute();
		String str = "abcda";
		Long l = System.currentTimeMillis();
		sp.permuteByLoop(str);
		// sp.permuteByLoop(str);
		System.out.println(System.currentTimeMillis() - l);
		Long l2 = System.currentTimeMillis();
		sp.permute(str);
		// sp.permuteByLoop(str);
		System.out.println(System.currentTimeMillis() - l2);
	}

	public void permute(String str) {
		char[] ch = str.toCharArray();
		permute(ch, 0, ch.length - 1);
	}

	private void permute(char[] str, int low, int high) {
		int length = str.length;
		if (low == high) {
			String s = "";
			for (int i = 0; i < length; i++) {
				s += str[i];
			}
			System.out.println(s);
		}
		for (int i = low; i < length; i++) {
			swap(str, i, low);
			permute(str, low + 1, high);
			swap(str, i, low);
		}
	}

	public void swap(char[] str, int m, int n) {
		char temp = str[m];
		str[m] = str[n];
		str[n] = temp;
	}

	//
	private List<char[]> permute2(List<char[]> list, char s) {
		List<char[]> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			int length = list.get(i).length + 1;
			char[] str = list.get(i);
			for (int j = 0; j < length; j++) {
				char[] strs = new char[length];
				strs[j] = s;
				int k = 0;
				for (int m = 0; m < length; m++) {
					if (m != j) {
						strs[m] = str[k];
						k++;
					}
				}
				list2.add(strs);
			}
		}
		// System.out.println(list2);
		return list2;
	}

	/**
	 * 字符排序 通过循环的方式
	 * 
	 * @author:liyiming
	 * @date:2018年7月11日
	 * @Description:
	 * @param str
	 */
	public void permuteByLoop(String str) {
		char[] strc = str.toCharArray();
		char[] strs = new char[]{strc[0]};
		List<char[]> list = new ArrayList<>();
		list.add(strs);
		for (int i = 1; i < strc.length; i++) {
			list = permute2(list, strc[i]);
		}
		for (char[] c : list) {
			System.out.print(new String(c));
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("一共组合：" + list.size());
	}
}
