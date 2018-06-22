/**
* @author:liyiming
* @date:2018年6月22日
* Description:
**/
package leetcode.easy;

/**
 * Title: SegmentsNumber Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月22日
 **/
public class SegmentsNumber{

	/**
	 * @author:liyiming
	 * @date:2018年6月22日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		SegmentsNumber sn = new SegmentsNumber();
		//String s ="Hello, my name is John";
		String s =", , , ,        a, eaefa";
		System.out.println(sn.countSegments(s));
	}

	public int countSegments(String s) {
		String[] ss = s.split(" ");
		int count = 0;
		for(String a:ss) {
			if(!a.equals(""))
				count++;
		}
		return count;
	}
}
