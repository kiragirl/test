/**
* @author:liyiming
* @date:2018年6月27日
* Description:
**/
package leetcode.easy;

/**
 * Title: StudentAttendanceRecordI Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月27日
 **/
public class StudentAttendanceRecordI{

	/**
	 * @author:liyiming
	 * @date:2018年6月27日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		StudentAttendanceRecordI sar = new StudentAttendanceRecordI();
		String s = "PPALLLP";
		System.out.println(sar.checkRecord(s));
	}

	public boolean checkRecord(String s) {
		char[] a = s.toCharArray();
		int k = 0;
		int p = 0;
		for (char b : a) {
			if (b == 'A') {
				k++;
				p = 0;
			} else if ('L' == b) {
				p++;
			} else {
				p = 0;
			}
			
			if (k >= 2) {
				return false;
			}
			if (p > 2) {
				return false;
			}
		}
		return true;
	}
}
