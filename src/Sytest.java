import java.util.Date;


public class Sytest {
	  private Sytest() {}  
	    //已经自行实例化   
	    private static final Sytest single = new Sytest();  
	    //静态工厂方法   
	    public static Sytest getInstance() {  
	        return single;  
	    }  
	public  synchronized void sy(){
		//synchronized(this){
		System.out.println(this.toString()+":"+new Date()+":"+this.hashCode()+":"+Thread.currentThread().getName());
		//Thread.sleep(5000);
		  for (int i = 0; i < 10; i++) {  
              System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);  
         }  
		System.out.println(this.toString()+":"+new Date()+":"+this.hashCode()+":"+Thread.currentThread().getName());
	}
	//}
}
