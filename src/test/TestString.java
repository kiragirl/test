package test;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestString {

	public static void main(String[] args) {
		System.out.println(profit(0.194,0.1932));
		Integer ai = new Integer(100);
		Integer bi = new Integer(100);
		System.out.println(ai==bi);
		StringBuffer hql = new StringBuffer();
		System.out.println(hql.length());
		StringBuffer hql2 = new StringBuffer("123123");
		System.out.println(hql2.length());
		Double a_double = 10D;
		Double b_double = 10D;
		System.out.println(a_double.doubleValue() == b_double.doubleValue());
		Integer aa = 10;
		Integer bb = new Integer(10);
		System.out.println(aa != bb);
		double a = 0D;
		double a1 = -10D;
		System.out.println(TestString.sub(a, a1));
		System.out.println(add(a,a1));
		Date date = new Date(1498060800000L);
		System.out.println(date);
		Random rd = new Random(1);
		for(int i=0;i<5;i++){
			System.out.println(rd.nextInt(10));
		}
		Random rds = new Random(1);
		for(int i=0;i<5;i++){
			System.out.println(rds.nextInt(10));
		}
		System.out.println(Math.random());
		System.out.println("****************************");
		BigDecimal b = new BigDecimal(Double.toString(105.5/50));
		BigDecimal one = new BigDecimal("1");
		System.out.println(50*(b.divide(one, 0, BigDecimal.ROUND_DOWN).intValue()));
/*		Double a1 = 10.0D;
		Double a2 = 3.0D;
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		System.out.println(a.intValue()==b.intValue());
		if(a1%a2!=0){
			System.out.println(a1%a2);
		}*/
		String ss = "Mozilla/5.0 (Linux; Android 5.1; HUAWEI TIT-CL10 Build/HUAWEITIT-CL10; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/43.0.2357.121 Mobile Safari/537.36 baidubrowser/5.6.4.236 (Baidu; P1 5.1)";
		System.out.println(ss.length());
		// TODO Auto-generated method stub
		//testSplit();
		testMap();
		Map<String,String> map = new HashMap<String, String>();
		map.put("de", null);
		System.out.println(map.get("de"));
		//testcharString();
		//testSubMobileNumber();
		//testGetAgeFormIdCard();
	/*	String ss = "我爱中国";
		System.out.println(ss.trim().length());
		System.out.println(ss.toCharArray().length);
		Calendar c= Calendar.getInstance();
		Date now = new Date();
		c.setTime(now);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		c.add(Calendar.MONTH, 1);
		System.out.println(c.getTime());
		System.out.println(ss.substring(3,6));
		System.out.println(ss.subSequence(3, 6));
		try {
			String aa = new String(ss.getBytes("GBK"), "GBK");
			System.out.println(ss.getBytes("GBK").length);
			System.out.println(aa.length());
			System.out.println(new String(ss.getBytes("GBK"), "GBK").getBytes().length);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}
	public static double profit(double v1,double v2){
		double profit = 0;
		profit = v1-v2-(v1*0.001+v2*0.001);
		return profit;
	}
	public static double sub(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();
	}
	public static double add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2).doubleValue();
	}
	
	public static void testMap(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("1","1");
		map.put("2","2");
		map.put("3","3");
		map.put("4","4");
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.putAll(map);
		map2.put("5", "5");
		map.put("6", "6");
		
		System.out.println(map.toString());
		System.out.println(map2.toString());
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		for (Map.Entry<String, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	public static  void testGetAgeFormIdCard(){
		String idcard = "211481198905157210";
		idcard.substring(6, 14);
		System.out.println(idcard.substring(6, 14));
	}
	public static void testSubMobileNumber(){
		System.out.println("13478567271".substring(0, 7));
	}
	
	public static void testcharString(){
		String str = "你叫神马？我叫Tesson.";
		try {
			System.out.println(str.getBytes("GBK").length);
			System.out.println(str.getBytes().length);
			int n = 0;
			StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char  item =  str.charAt(i);
            if(String.valueOf(item).getBytes("GBK").length==2){
            	if(n+2>12)
            		break;
            	else
            		n = n+2;
            }else{
            	if(n+1>12)
            		break;
            	else
            		n = n+1;
            }
            sb.append(item);
        }
        System.out.println(sb.toString().getBytes("GBK").length);
        System.out.println(sb.toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testSplit(){
		String aa = "123 123   1231 123";
		System.out.println(aa.split("\\s+").length);
	}
}
