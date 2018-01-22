package testJDK8;

import java.lang.ref.WeakReference;

public class TestReference {

	public static void main(String[] args) {
		String ss = "hello";
		WeakReference<String> sr = new WeakReference<String>(
				new String("hello"));
		WeakReference<String> sr2 = new WeakReference<String>(ss);
		
		Integer ii = 127;
		Integer ii2 = 128;
		WeakReference<Integer> sir = new WeakReference<Integer>(
				new Integer(128));
		WeakReference<Integer> sir2 = new WeakReference<Integer>(
				new Integer(127));
		System.gc(); // 通知JVM的gc进行垃圾回收
		// 对象只有弱引用关联会被回收
		System.out.println(sr.get());
		System.out.println(ss);
		System.out.println(sr2.get());
		System.out.println(sir.get());
		System.out.println(sir2.get());
		
		String a = "A";
		String aa = "A";
		String b = "B";
		String bb = "B";
		String c = "C";
		String cc = "C";
		System.out.println(a==aa);
		System.out.println(a.toCharArray()[0]<b.toCharArray()[0]);
		System.out.println(a.toCharArray().length);
	}
	public void testsss(){
		
	}
}
