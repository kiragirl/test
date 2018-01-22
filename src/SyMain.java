
public class SyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewT NewT1 =  NewT.getInstance();
		NewT NewT2 = NewT.getInstance();
		Thread th1 = new Thread(NewT1,"A");
		Thread th2 = new Thread(NewT2,"B");
		th1.start();
		th2.start();
	//	Sytest1.sy();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
