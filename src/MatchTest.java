import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void match(){
		int[] a = {1,1,1,2,2,2,4,3,4,3,5,6,7,5,7,8,9};	
		int[] b = {10,6,7,8,9};	
		List<HashMap<String, Integer>> list01 = new ArrayList<HashMap<String, Integer>>();
		Map<String, Integer> mapA = new HashMap<String, Integer>();
		mapA.put("01", 1);
		mapA.put("02", 2);
		mapA.put("03", 3);
		mapA.put("04", 4);
		mapA.put("05", 5);
		mapA.put("06", 6);
		mapA.put("07", 7);
		mapA.put("08", 8);
		mapA.put("09", 9);
		mapA.put("10", 3);
		mapA.put("11", 4);
		
		Map<String, Integer> mapB = new HashMap<String, Integer>();
		mapB.put("01", 9);
		mapB.put("02", 8);
		mapB.put("03", 7);
		mapB.put("04", 10);
	}
}
