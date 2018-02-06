/**
 * @author:liyiming
 * @date:2018年2月5日
 * Description:
 **/
package designpattern.structuralpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: CriteriaMale Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年2月5日
 **/
public class CriteriaMale implements Criteria{

	/**
	 * @author:liyiming
	 * @date:2018年2月5日
	 * @Description:
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
