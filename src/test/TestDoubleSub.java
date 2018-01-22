/**
 * @author:liyiming
 * @date:2017年4月27日
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
 * @author ：lyiming
 * @date ：2017年4月27日
 **/
public class TestDoubleSub{

	// private ThreadLocal<T>
	/**
	 * @author:liyiming
	 * @date:2017年4月27日
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
		// 向TreeSet中添加四个Integer对象
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		nums.add(2);
		// 输出集合元素，看到集合元素已经处于排序状态
		System.out.println(nums);
		// 输出集合里的第一个元素
		System.out.println(nums.first());
		// 输出集合里的最后一个元素
		System.out.println(nums.last());
		// 返回小于4的子集，不包含4
		System.out.println(nums.headSet(4));
		// 返回大于5的子集，如果Set中包含5，子集中还包含5
		System.out.println(nums.tailSet(5));
		// 返回大于等于-3，小于4的子集。
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

	public static void test啥是BMP代码点() {
		int a = -10;
		System.out.println(Character.isBmpCodePoint(a));
		System.out.println(a >>> 16);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(a);
		System.out.println("test啥是BMP代码点结束");

	}

	public static void testUTF8toGBK() throws UnsupportedEncodingException {
		String aa = "哈哈哈";
		System.out.println(aa.getBytes().length);
		System.out.println(aa.getBytes("GBK").length);
	}

	public static void test位移() {
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

		System.out.println("test位移结束");
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
		 * @date:2017年9月28日
		 * @Description:
		 */
		@Override
		public void run() {
			// TODO Auto-generated method stub

		}

	}
}
