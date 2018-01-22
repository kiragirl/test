import java.util.Date;


public class DateToLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dtl();
	}
	public static void dtl(){
		Date d1 = new Date();
		//Long l = 1459153058000L;
		d1 = DateUtil.StringToDate("2015-12-01", "yyyy-MM-dd");
		System.out.println(d1.getTime());
		Date d2 = new Date();
		System.out.println(d2.getTime());
		Date d23 = new Date(1459153058000L);
		System.out.println(DateUtil.DateToString(d23, "yyyy-MM-dd"));
		Date d24 = new Date(1467101858000L);
		System.out.println(DateUtil.DateToString(d24, "yyyy-MM-dd"));
		Date d25 = new Date(1451376867000L);
		System.out.println(DateUtil.DateToString(d25, "yyyy-MM-dd"));
		System.out.println("13941174802".substring(7,"13941174802".length()));
	}
}
