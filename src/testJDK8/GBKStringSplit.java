/**
* @author:liyiming
* @date:2017年12月4日
* Description:
**/
package testJDK8;

import java.io.UnsupportedEncodingException;


/**
 * 	Title: GBKStringSplit
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2017年12月4日
 **/
public class GBKStringSplit{

	/**
	 * @author:liyiming
	 * @date:2017年12月4日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		String aa = "/user/myCenterAccount;jsessionid=6DA567AF86E6CB27396D4FE158D8C529";
		if(aa.indexOf("jsessionid")!=-1){
			System.out.println(aa.split(";")[1]);
		}
		
		String ss = "阿斯顿阿斯顿阿斯顿112312阿德阿达1";
		try {
			System.out.println(ss.getBytes("GBK").length);
			int len = ss.getBytes("GBK").length;
			if(len > 32){
				String kk = new String (ss.getBytes("GBK"),0,32,"GBK");
				char a = kk.charAt(kk.length()-1);
				char b = ss.charAt(kk.length()-1);
				if(a==b){
					System.out.println(kk);	
				}else{
					System.out.println(new String(ss.getBytes("GBK"),0,30,"GBK"));	
				}
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
