/**
* @author:liyiming
* @date:2018年6月29日
* Description:
**/
package leetcode.easy;

import java.util.ArrayList;

/**
 * Title: MinimumIndexSumofTwoLists Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月29日
 **/
public class MinimumIndexSumofTwoLists{

	/**
	 * @author:liyiming
	 * @date:2018年6月29日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		String [] list1 = new String[] {"Shogun", "Hungry Hunter Steakhouse","Tapioca Express", "Burger King", "KFC"};
		String [] list2 = new String[] {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
		MinimumIndexSumofTwoLists mi = new MinimumIndexSumofTwoLists();
		for(String s:mi.findRestaurant(list1, list2)) {
			System.out.println(s);
		}
		
	}

	public String[] findRestaurant(String[] list1, String[] list2) {
		ArrayList<String> list=new ArrayList<String>();
		int index = list1.length + list2.length - 2;
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if (list1[i].equals(list2[j]) && (i + j) <= index) {
					if (i + j < index) {
						list.clear();
						list.add(list1[i]);
					} else if (i + j == index) {
						list.add(list1[i]);
					}
					index = i + j;
				}
			}
		}
		String ss[] = new String[list.size()];
		return list.toArray(ss);
	}
}
