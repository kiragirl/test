package test;

public class TestXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[]{1,3,2,1,3,4,2,4,5};
		int k = test[0];
		for(int i=0;i<test.length;i++){
			if(i!=0){
				k = k^test[i];
				System.out.println(k);
			}
			
		}
	}

}
