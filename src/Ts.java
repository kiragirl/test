import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Ts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		String strDate = "2014-11-26 09:14:54";
		Date date = new Date();
		try {
			 date=sdf.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(((new Date()).getTime() - date.getTime()) / 1000);
		
		System.out.println(Math.random()*1000);
        System.out.println(new Date(1491545794546L));
	/*	 Calendar cal = Calendar.getInstance();
	        cal.setTime(new Date());
	        System.out.println(cal.getTime());
	        cal.set(Calendar.HOUR_OF_DAY, 0);
	        cal.set(Calendar.MINUTE, 0);
	        cal.set(Calendar.SECOND, 0);
	        cal.set(Calendar.MILLISECOND, 0);
	       // cal.add(Calendar.DAY_OF_MONTH, 1);
	        System.out.println(cal.getTime());*/
	}

}
