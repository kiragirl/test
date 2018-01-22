package testJDK8;

public class TestIntEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 100;
		Integer b = 100;
		Integer c = 200;
		Integer d = 200;
		Integer e = new Integer(100);
		Integer f = new Integer(100);
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(e==f);
	}

}
