/**
* @author:liyiming
* @date:2018年7月11日
* Description:
**/
package algorithm;

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
		String str = "abcd";
		sp.permute(str);
	}

	public void permute(String str) {
		char[] strc = str.toCharArray();
		permute(strc,0,str.length());
	}

	private void permute(char[] str, int low, int high) {

	}
}
