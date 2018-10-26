/**
 * @author:liyiming
 * @date:2017骞�4鏈�27鏃�
 * Description:
 **/
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.FileFilter;
import java.io.UnsupportedEncodingException;
import java.time.*;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * Title: TestDoubleSub Description: Company:pusense
 * 
 * @author 锛歭yiming
 * @date 锛�2017骞�4鏈�27鏃�
 **/
public class TestDoubleSub{

	// private ThreadLocal<T>
	/**
	 * @author:liyiming
	 * @date:2017骞�4鏈�27鏃�
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		TestDoubleSub TestDoubleSub = new TestDoubleSub();
		TestDoubleSub.testInterface();
		/*
		 * try {
		 * 
		 * testUTF8toGBK(); } catch (UnsupportedEncodingException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}

	static void testHashSet() {
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		nums.add(2);
		System.out.println(nums);
	}

	static void testTreeSet() {
		TreeSet<Integer> nums = new TreeSet<Integer>();
		// 鍚慣reeSet涓坊鍔犲洓涓狪nteger瀵硅薄
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		nums.add(2);
		// 杈撳嚭闆嗗悎鍏冪礌锛岀湅鍒伴泦鍚堝厓绱犲凡缁忓浜庢帓搴忕姸鎬�
		System.out.println(nums);
		// 杈撳嚭闆嗗悎閲岀殑绗竴涓厓绱�
		System.out.println(nums.first());
		// 杈撳嚭闆嗗悎閲岀殑鏈�鍚庝竴涓厓绱�
		System.out.println(nums.last());
		// 杩斿洖灏忎簬4鐨勫瓙闆嗭紝涓嶅寘鍚�4
		System.out.println(nums.headSet(4));
		// 杩斿洖澶т簬5鐨勫瓙闆嗭紝濡傛灉Set涓寘鍚�5锛屽瓙闆嗕腑杩樺寘鍚�5
		System.out.println(nums.tailSet(5));
		// 杩斿洖澶т簬绛変簬-3锛屽皬浜�4鐨勫瓙闆嗐��
		System.out.println(nums.subSet(-3, 4));
	}

	static void testSetEquals() {
		HashSet<Integer> hs = new HashSet<Integer>();
		Integer sb1 = new Integer(1000);
		Integer sb2 = new Integer(1000);
		hs.add(sb1);
		hs.add(sb2);
		System.out.println(hs.size());
	}

	public static void testStringCodePointAt() {
		String aa = "testStringCodePointAt";
		System.out.println(aa.codePointAt(11));
	}

	public static void test() {
		int a = -10;
		System.out.println(Character.isBmpCodePoint(a));
		System.out.println(a >>> 16);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(a);
		System.out.println("test鍟ユ槸BMP浠ｇ爜鐐圭粨鏉�");

	}

	public static void testUTF8toGBK() throws UnsupportedEncodingException {
		String aa = "鍝堝搱鍝�";
		System.out.println(aa.getBytes().length);
		System.out.println(aa.getBytes("GBK").length);
	}

	public static void test浣嶇Щ() {
		int a = 10;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		a = a >> 1;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		a = a << 2;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		a = a >>> 2;
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));

		System.out.println("test浣嶇Щ缁撴潫");
	}

	public void testInterface() {
		//List<Person> people = new ArrayList<Person>();
		int[] aa = new int[10];
		Runnable r2 = () -> { System.out.println(toString()); };
		/*IntFunction<int[]> arrayMaker = int[]::new;*/
		IntFunction<int[]> arrayMaker = (a)->{
			return new int[a];
		};
		
		int[] array = arrayMaker.apply(10);
		System.out.println();
	}

	public String toString() {
		return "Hello, world";
	}

	class Person{

		Person(String name) {
			this.name = name;
		}

		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	public void testInterface2(TestInterface<Integer> TestInterface) {

	}

	public Runnable toDoLater() {
		return () -> {
			System.out.println("later");
		};
	}

	public Runnable toDoLater2() {
		return new Runnable(){

			@Override
			public void run() {
				System.out.println("later");
			}

		};
	}

	public void testInterface3(TestAbstractClass TestInterface) {

	}

	class RunnableTest implements Runnable{

		/**
		 * @author:liyiming
		 * @date:2017骞�9鏈�28鏃�
		 * @Description:
		 */
		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}
}
