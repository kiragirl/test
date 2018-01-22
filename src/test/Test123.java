package test;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test123 {

	
	public static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM--dd HH:mm:ss.SSS");
    public static final BigInteger EndPoint = new BigInteger("115132219018763992565095597973971522402");
    private static final BigInteger Poison = new BigInteger("-1");
    private static class CompareThread extends Thread{
        private BlockingQueue<BigInteger> numbers;
        public CompareThread(BlockingQueue<BigInteger> queue){
            numbers=queue;
        }
        public void run(){
            BigInteger number = BigInteger.ZERO;
            try {
                while((number=numbers.take())!=Poison){
                    if(isNarcissisticNumber(number)){
                        System.out.println(SDF.format(new Date()) + "\t" + number);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static final BigInteger[][] Powers = new BigInteger[40][10];
    static{
        for(int i=0;i<40;i++){
            for(int j=0;j<10;j++){
                Powers[i][j] = BigInteger.valueOf(j).pow(i);
            }
        }
    }
    public static boolean isNarcissisticNumber(final BigInteger number) {
        BigInteger sum = BigInteger.ZERO; // 各位数字的N次方的和
        char[] digitArray = number.toString(10).toCharArray(); // 各位数字的数组
        for (char digit : digitArray) {
            sum = sum.add(Powers[digitArray.length][digit-'0']);
        }
        return sum.compareTo(number)==0;
    }
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<BigInteger> queue = new LinkedBlockingQueue<BigInteger>(1000);
        CompareThread[] pool = new CompareThread[Runtime.getRuntime().availableProcessors()];
        System.out.println(Runtime.getRuntime().availableProcessors());
        for(int i=0;i<pool.length;i++){
            pool[i]= new CompareThread(queue);
            pool[i].setPriority(Thread.MIN_PRIORITY);
            pool[i].start();
        }
        System.out.println("水仙花数列表");
       /* for(BigInteger number = BigInteger.ZERO;number.compareTo(EndPoint)<=0;number=number.add(BigInteger.ONE)){
            queue.put(number);
        }*/
    }
}
