/**
* @author:liyiming
* @date:2018年7月11日
* Description:
**/
package algorithm;

import java.util.ArrayList;import java.util.Arrays;
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
		String str = "bcd";
		Long l = System.currentTimeMillis();
		sp.permute(str);
		//sp.permuteByLoop(str);
		System.out.println(System.currentTimeMillis()-l);
	}

	public void permute(String str) {
		char[] strc = str.toCharArray();
		char[] strs = new char[] {strc[0]};
		for(int i=1;i<strc.length;i++) {
			List<char[]> list = permute2(strs, strc[i]);
		}
		
		//permute(strc, 0, str.length());
	}

	private void permute(char[] str, int low, int high) {


	}
	
	//
	private List<char[]> permute2(char[] str,char s) {
		/*for() {
			
		}*/
		List<char[]> list = new ArrayList<>();
		int length = str.length+1;
		for(int i=0;i<length;i++) {
			char[] strs = new char[length];
			strs[i]=s;
			int k=0;
			for(int j=0;j<length;j++) {
				if(j!=i) {
					strs[j]=str[k];
					k++;
				}
			}
			list.add(strs);
		}
		System.out.println(list);
		return list;
	}
	/**
	 * 字符排序（不含有相同的字符） 通过循环的方式
	 * @author:liyiming
	 * @date:2018年7月11日
	 * @Description:
	 * @param str
	 */
	public void permuteByLoop(String str) {
		String strc = str + str.substring(0, str.length() - 1);
		System.out.println(strc);
		List<String> set = new ArrayList<String>();
		for (int j = 0; j < strc.length(); j++) {
			String first = String.valueOf(strc.charAt(j));
			for (int i = j+1; i < str.length()+j && j<str.length(); i++) {
				String cur = String.valueOf(strc.charAt(i));
					set.add(first + cur);
			}
/*			System.out.println("一："+set);
			Iterator<String> iterator = set.iterator();
			HashSet<String> setSub = new HashSet<String>();
			while(iterator.hasNext()) {
				String s = iterator.next();
				if(!s.contains(first)) {
					iterator.remove();
					setSub.add(s+first);
					setSub.add(first+s);
				}
			}
			set.addAll(setSub);*/
			System.out.println("二："+set);
		}
		//System.out.println(set);
	} 
}
