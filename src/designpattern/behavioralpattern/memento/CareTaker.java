/**
* @author:liyiming
* @date:2018年2月6日
* Description:
**/
package designpattern.behavioralpattern.memento;

import java.util.ArrayList;
import java.util.List;


/**
 * 	Title: CareTaker
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月6日
 **/
public class CareTaker{
	 private List<Memento> mementoList = new ArrayList<Memento>();

	   public void add(Memento state){
	      mementoList.add(state);
	   }

	   public Memento get(int index){
	      return mementoList.get(index);
	   }
}
