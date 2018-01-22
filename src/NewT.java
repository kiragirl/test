import java.util.Date;


public class NewT implements Runnable {

	   private static NewT instance;  
	   private NewT (){}  
	  
	    public static NewT getInstance() {  
	    if (instance == null) {  
	        instance = new NewT();  
	    }  
	    return instance;  
	    }
	public void run() {
		// TODO Auto-generated method stub
		Sytest Sytest1 = Sytest.getInstance();
		Sytest1.sy();
		//this.sy();
	}
	public void sy(){
		synchronized(this){
			System.out.println(new Date()+":"+this.hashCode()+":"+Thread.currentThread().getName());
			//Thread.sleep(5000);
			  for (int i = 0; i < 10; i++) {  
	              System.out.println(Thread.currentThread().getName() + " synchronized loop " + i);  
	         }  
			System.out.println(new Date()+":"+this.hashCode()+":"+Thread.currentThread().getName());
		}
	}

}
