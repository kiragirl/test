package testJDK8;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Company: pusense <br/>
 * Copyright: Copyright (c)2014 <br/>
 * Description:
 * 
 * @author: wunan
 * @version: 1.0 Create at: 2014-11-11 13:54:32
 * 
 *           Modification History: <br/>
 *           Date Author Version Description
 *           ------------------------------------------------------------------
 *           2014-11-11 wunan 1.0 userid生成类 第三方支付获取 和 密码加密调用盐值
 * 
 */
public class MyUserIdIdentety{
	/**
	 * liyiming 20171011
	 */
	private final static char[] digits = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
			'u', 'v', 'w', 'x', 'y', 'z'};
	
	public static void main(String[] args) {
		System.out.println(referrerNo());
	}

	public static String generateSequenceNo() {
		String userIdIdentety = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmssSSS");
		userIdIdentety += sdf.format(date);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*ArrayList<Character> list = new ArrayList<Character>();
		for (char c = 'a'; c <= 'z'; c++) {
			list.add(c);
		}
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 26);
			userIdIdentety += list.get(num);
		}*/
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 26);
			userIdIdentety += digits[num];
		}
		return userIdIdentety;
	}

	public static synchronized String referrerNo() {
		String userIdIdentety = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmssSSS");
		// userIdIdentety += sdf.format(date);
		ArrayList list = new ArrayList();
		for (char c = 'A'; c <= 'O'; c++) {
			list.add(c);
		}
		// for (int b = 0; b <= 9; b++) {
		// list.add(b);
		// }
		for (int i = 0; i < 15; i++) {
			int num = Integer.parseInt(sdf.format(date).substring(i, i + 1));
			userIdIdentety += list.get(num);
		}
		return userIdIdentety + sdf.format(date).substring(12, 15);
	}
}
