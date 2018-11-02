package leetcode.medium.dynamicProgramming;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

/**
 * 375. 猜数字大小 II
 * @author yiming.li
 *我们正在玩一个猜数游戏，游戏规则如下：

	我从 1 到 n 之间选择一个数字，你来猜我选了哪个数字。
	
	每次你猜错了，我都会告诉你，我选的数字比你的大了或者小了。
	
	然而，当你猜了数字 x 并且猜错了的时候，你需要支付金额为 x 的现金。直到你猜到我选的数字，你才算赢得了这个游戏。
	
	示例:
	
	n = 10, 我选择了8.
	
	第一轮: 你猜我选择的数字是5，我会告诉你，我的数字更大一些，然后你需要支付5块。
	第二轮: 你猜是7，我告诉你，我的数字更大一些，你支付7块。
	第三轮: 你猜是9，我告诉你，我的数字更小一些，你支付9块。
	
	游戏结束。8 就是我选的数字。
	
	你最终要支付 5 + 7 + 9 = 21 块钱。
	给定 n ≥ 1，计算你至少需要拥有多少现金才能确保你能赢得这个游戏。
 */
public class LC375_GuessNumberHigherOrLowerII {

	public static void main(String[] args) {
		LC375_GuessNumberHigherOrLowerII lc375_GuessNumberHigherOrLowerII = new LC375_GuessNumberHigherOrLowerII();
		int n = 6;
/*		for(int i=1;i<=10;i++){
			System.out.println(i+":"+lc375_GuessNumberHigherOrLowerII.getMoneyAmount(i));
		}*/
		System.out.println(lc375_GuessNumberHigherOrLowerII.getMoneyAmount(n));
	}
	
	/**
	 * 没有数学规律啊，只能用dp啊
	 * @param n
	 * @return
	 */
	public int getMoneyAmount(int n) {
		int[][] ans = new int[n+1][n+1];
		return DP(ans,1,n);
	}
	public int DP(int[][] ans,int from,int to){
		if (from>=to) {
			return 0;
		}
		if(ans[from][to]>0){
			return ans[from][to];
		}
		ans[from][to] = Integer.MAX_VALUE;
		for(int i=from;i<=to;i++){
			int left = DP(ans, from, i-1);
			int right = DP(ans, i+1, to);
			int tmp = i+Math.max(left, right);
			ans[from][to] = Math.min(ans[from][to], tmp);
		}
		return ans[from][to];
	}
}
