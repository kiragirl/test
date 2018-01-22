package test;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}
	static void test(){
		Calendar c = Calendar.getInstance();
		System.out.println(new Date(c.getTimeInMillis()));

		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		System.out.println(new Date(c.getTimeInMillis()));
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH), 23, 59, 59);
		System.out.println(new Date(c.getTimeInMillis()));
		
		int num = 0;
		Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date());
			num = calendar.get(Calendar.MINUTE);
			System.out.println(num);
	}
}
