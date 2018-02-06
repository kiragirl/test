/**
* @author:liyiming
* @date:2018年2月5日
* Description:
**/
package designpattern.structuralpattern.filter;

import java.util.List;


/**
 * 	Title: Criteria
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2018年2月5日
 **/
public interface Criteria{
	 public List<Person> meetCriteria(List<Person> persons);
}
