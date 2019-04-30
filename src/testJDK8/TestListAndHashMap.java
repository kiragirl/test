/**
* @author:liyiming
* @date:2018年1月9日
* Description:
**/
package testJDK8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;


/**
 * 	Title: TestListAndHashMap
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年1月9日
 **/
public class TestListAndHashMap{
	public static void main(String[] args) {
		List<OB1> list = new ArrayList<OB1>();
		Random random = new Random();
		String kk = "";
		for(int i=0;i<10000;i++){
			OB1 ob = new OB1();
			String ss = String.valueOf(random.nextInt(100000000));
			ob.setId(ss);
			ob.setContent(ss);
			list.add(ob);
			if(i==50000){
				kk=ss;
			}
		}
		System.out.println(System.currentTimeMillis());
		Map<String,String> hashMap= new HashMap<String,String>(100000);
		hashMap = list.stream().collect(Collectors.toMap(OB1::getId,OB1::getContent)); 
		/*for(OB1 ob:list){
			hashMap.put(ob.getId(), ob.getContent());
		}*/
		System.out.println(System.currentTimeMillis());
		System.out.println("--------------------------");
		System.out.println(System.currentTimeMillis());
		for(OB1 ob:list){
			if(ob.getId().equals(kk)){
				System.out.println(ob.getId());
			}
		}
		System.out.println(System.currentTimeMillis());
		System.out.println("--------------------------");
		System.out.println(System.currentTimeMillis());
		System.out.println(hashMap.get(kk));
		System.out.println(System.currentTimeMillis());
	}
}
class OB1{
	private String id;
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}