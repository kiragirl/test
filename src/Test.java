import java.util.ArrayList;
import java.util.List;


/**
 * @author:liyiming
 * @date:2017年7月5日
 * Description:
 **/

/**
 * 	Title: Test
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2017年7月5日
 **/
public class Test{
	 public static void main(String[] args) {
	        P b = new B();
	        System.out.println(b.a);
		 /*Test test = new Test();
		 System.out.println(test.testTryCatchFinally().a);*/
	    }
	    static class P {
	        public int a = 11;
	        public P() {
	            a = 22;
	            diplay();
	        }
	        public void diplay() {
	            System.out.println("I am in P, value is " + a);
	        }
	    }
	    static class B extends P {
	        int a = 33;
	        public B() {
	            a = 44;
	            diplay();
	        }
	        public void diplay() {
	            System.out.println("I am in B, value is " + a);
	        }
	}
	    class C{
	    	int a;
	    	void set (int a){
	    		this.a = a;
	    	}
	    }
	    public C testTryCatchFinally(){
	    	int a = 0;
	    	Integer aa = 0;
	    	String  ss = "";
	    	C c = new C();
	    	List<String> list = new ArrayList<String>();
	    	try{
	    		c.set(10);
	    		a= 10;
	    		aa = new Integer(1000);
	    		ss = new String ("123123");
	    		list.add(ss);
	    		return c ;
	    	}catch(Exception e){
	    		return c;
	    	}finally{
	    		a = 20;
	    		aa= new Integer(2000);
	    		list.add(ss);
	    		ss = "1111";
	    		c.set(20);
	    		//return a;
	    		//System.out.println(ss);
	    	}
	    	//return list.size();
	    }
}
