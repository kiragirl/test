/**
* @author:liyiming
* @date:2017年7月25日
* Description:
**/
package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * 	Title: TestIterator
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2017年7月25日
 **/
public abstract class TestIterator{

	/**
	 * @author:liyiming
	 * @date:2017年7月25日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

	public static void test(){
		List<User> list = new ArrayList<User>();
		list.add(new User("1","2"));
		list.add(new User("1","2"));
		list.add(new User("1","2"));
		list.add(new User("1","2"));
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(new Integer(1000));
		list2.add(new Integer(2000));
		list2.add(new Integer(3000));
		list2.add(new Integer(4000));
		Iterator<User> iterator = list.iterator();
		while(iterator.hasNext()){
			User a = iterator.next();
			Iterator<Integer> iterator2 = list2.iterator();
			while(iterator2.hasNext()){
				Integer b = iterator2.next();
				System.out.println(a+":"+b);
				a.setA("100");
				break;
			}
		}
		System.out.println(list2.size());
		for(User a:list){
			System.out.println(a.getA());
		}
	}
}
class User{
	private String a;
	private String b;
	/**
	 * @param string
	 * @param string2
	 */
	public User(String string, String string2) {
		this.a=a;
		this.b=b;
	}
	
	public String getA() {
		return a;
	}
	
	public String getB() {
		return b;
	}
	
	public void setA(String a) {
		this.a = a;
	}
	
	public void setB(String b) {
		this.b = b;
	}
}
