/**
* @author:liyiming
* @date:2017年12月29日
* Description:
**/
package testJDK8.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * 	Title: CollectingResults
 *	Description:
 *	Company:pusense
 * 	@author ：lyiming
 * 	@date ：2017年12月29日
 **/
public class CollectingResults{

	/**
	 * @author:liyiming
	 * @date:2017年12月29日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stream.iterate(0, n->n+1).limit(10).forEach(n->{System.out.println(n);});
		Stream.iterate(0, n->n+1).limit(10).forEach(System.out::println);
		Stream.generate(Math::random).limit(10).collect(Collectors.toList());
		Stream.iterate(0, n->n+1).limit(10).toArray();
		//Iterator<Integer> iter = Stream.iterate(0, n->n+1).;
	}

}
