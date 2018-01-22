package testJDK8;

public class Pa {
	Boolean flag;
	public void test(){
		System.out.println("父类");
		
	}
	public void test2(){
		System.out.println("父类test2");
		test();
	}
}
