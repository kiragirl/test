/**
* @author:liyiming
* @date:2018年6月22日
* Description:
**/
package leetcode.easy;

/**
 * Title: GuessGame Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2018年6月22日
 **/
public class GuessGame{

	private int a = 10;

	/**
	 * 
	 */
	public GuessGame() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @author:liyiming
	 * @date:2018年6月22日
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		GuessGame g = new GuessGame();
		g.guessNumber(2126753390);
		long a = System.currentTimeMillis();
		g.guessNumber2(2126753390);
		System.out.println(System.currentTimeMillis()-a);
	}

	public int guess(int n) {
		if (n > this.a)
			return -1;
		if (n < this.a)
			return 1;
		return 0;
	}

	public int guessNumber(int n) {
		long a = System.currentTimeMillis();
		int max = n;
		int mid = n;
		int k = guess(mid);
		while (k != 0) {
			if (k == -1) {
				max = mid;
				mid = mid / 2;
			}
			if (k == 1) {
				mid = (max + mid) / 2;
			}
			k = guess(mid);
		}
		System.out.println(System.currentTimeMillis() - a);
		return mid;
	}

	public int guessNumber2(int n) {

		int low = 1;
		int high = n;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int res = guess(mid);
			if (res == 0)
				return mid;
			else if (res < 0)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}
