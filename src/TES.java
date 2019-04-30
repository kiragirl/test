import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;


public class TES {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double v1=3.0,v2=10000;
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		//System.out.println(b1.divide(b2, 4,BigDecimal.).doubleValue());
		DecimalFormat   dfd   =   new   DecimalFormat("###,###.####");  
		String   strValue   =   dfd.format(b1.divide(b2, 5, BigDecimal.ROUND_HALF_UP).doubleValue());
		System.out.println(strValue);
		System.out.println(3.0/10000);
		// TODO Auto-generated method stub
/*String a = "123";
String b = "123";
System.out.println(a.equals(b));
a=b;
System.out.println(a==b);*/
/*		String regexp = "[^'\"%!_&$*！＆＊（）＾％＄＃＠｛｝｜＜＞？：＂＼｀<>/?{}()]*";
		String string = "abc12";
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(string);
		if (!matcher.matches()) {
			System.out.println (matcher.matches());
		}
		System.out.println (string.matches (regexp));*/
		//int i = 0;
		Hashtable zidata = new Hashtable();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		String date = df.format(new Date());// new Date()为获取当前系统时间
		Date d = new Date();
		try {
			d = df.parse("2015-07-22 00:00:00.000");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GregorianCalendar gc=new GregorianCalendar();
		gc.setTime(d);
		gc.add(2, 1);
		gc.add(5, -1);
		Date d1 = gc.getTime();
		String d2 = df.format(d1);
		System.out.println(d2);
		/*
		Bean bean1 = new Bean();
		bean1.setAaa(1);
		bean1.setBbb(3);
		Bean bean2 = new Bean();
		bean2.setAaa(1);
		bean2.setBbb(new Integer(1));
		Bean2 bean22 = new Bean2();
		bean22.setCcc(new Integer(2));
		System.out.println(bean1.getAaa()==bean2.getAaa());
		System.out.println("1".equals(bean1.getAaa()));
		System.out.println(bean1.getBbb().equals(bean2.getBbb()));
		System.out.println(bean1.getBbb()==bean2.getBbb());
		System.out.println(bean2.getBbb()==bean22.getCcc());
		System.out.println(bean2.getBbb().equals(bean22.getCcc()));*/
		/*1425963936752
		1425963936757
		2015-03-10 13:05:36 752
		2015-03-10 13:05:36 757*/
		
		int i = (int)(Math.random()*1);
		System.out.println(i);
		 i = (int)(Math.random()*4);
		 System.out.println(i);
		 i = (int)(Math.random()*4);
		 System.out.println(i);
		 i = (int)(Math.random()*4);
		 System.out.println(i);
		 i = (int)(Math.random()*4);
		 System.out.println(i);
		 
	/*	 String str="Hi,%#%";  
		    //str=String.format("Hi,%#%", "王力");  
		    System.out.println(str);  
		    System.out.println(str.replace("#", "123"));
		    //str=String.format("Hi,#s", "王南","王力","王张");
		 System.out.println(str); 
		long al = 1438642800000L;
		Date dat=new Date(al);  
		GregorianCalendar gc = new GregorianCalendar();   
		gc.setTime(dat);  
		String dates = "2015-02-27 00:00:00";
		
		Date date = new Date();
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");  
		String sb=format.format(gc.getTime());  
		System.out.println(sb); 
		try {
			date = format.parse(dates);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date.getTime());*/
		//System.out.println(sb); 
	}
}
