package test;

public class TestXOR {
	private int a;
	 public static final String DEPARTMENT = "开发人员";
	private int b = a+10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[]{1,3,2,1,3,4,2,4,5};
		int a;
		int k = test[0];
		for(int i=0;i<test.length;i++){
			if(i!=0){
				k = k^test[i];
				System.out.println(k);
			}
			
		}
	}
	public static void a() {}
}
