/**
* @author:liyiming
* @date:2017年12月4日
* Description:
**/
package testJDK8;


/**
 * 	Title: StringReplace
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2017年12月4日
 **/
public class StringReplace{

	/**
	 * @author:liyiming
	 * @date:2017年12月4日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		String ss = "qweqwwqewqe#{kkk},asdasd{lll}";
		ss =ss.replace("#{kkk}", "哈哈");
		ss =ss.replace("#{mm}", "哈哈");
		System.out.println(ss);
	}

}
