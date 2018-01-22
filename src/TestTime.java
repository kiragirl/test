import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TestTime {
/**
 * @param args
 */
public static void main(String[] args) {
 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	Date d = null;
	try {
		d = format.parse("1986-09-15 21:00:00");
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	TimeZone tz = TimeZone.getTimeZone("Asia/Shanghai");//时区
	Locale lc = new Locale("Chinese");//语言环境
	Calendar c = Calendar.getInstance(tz,lc);
	
	//Calendar c = Calendar.getInstance();
	c.setTime(d);
	c.add(Calendar.HOUR_OF_DAY,2);
	System.out.println(c.getTime());
	
	//Calendar c2 = Calendar.getInstance();
	c.setTime(d);
	c.add(Calendar.HOUR_OF_DAY,3);
	System.out.println(c.getTime());
	
/*	Calendar c = Calendar.getInstance();
	for(int i=0;i<10;i++){
	c.setTime(d);
	c.add(Calendar.HOUR_OF_DAY, i);
	Timestamp ts = new Timestamp(c.getTimeInMillis());
	d=ts;
	System.out.println(c.getTime());
	}*/
	}
}