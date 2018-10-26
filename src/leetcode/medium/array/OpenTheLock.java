package leetcode.medium.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * 752. 打开转盘锁
 * 
 * @author yiming.li 你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5',
 *         '6', '7', '8', '9' 。每个拨轮可以自由旋转：例如把 '9' 变为 '0'，'0' 变为 '9'
 *         。每次旋转都只能旋转一个拨轮的一位数字。 锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。 列表 deadends
 *         包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。 字符串 target
 *         代表可以解锁的数字，你需要给出最小的旋转次数，如果无论如何不能解锁，返回 -1。
 * 
 *         示例 1: 输入：deadends = ["0201","0101","0102","1212","2002"], target =
 *         "0202" 输出：6 解释： 可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" ->
 *         "1201" -> "1202" -> "0202"。 注意 "0000" -> "0001" -> "0002" -> "0102"
 *         -> "0202" 这样的序列是不能解锁的， 因为当拨动到 "0102" 时这个锁就会被锁定。 示例 2: 输入: deadends =
 *         ["8888"], target = "0009" 输出：1 解释： 把最后一位反向旋转一次即可 "0000" -> "0009"。 示例
 *         3: 输入: deadends =
 *         ["8887","8889","8878","8898","8788","8988","7888","9888"], target =
 *         "8888" 输出：-1 解释： 无法旋转到目标数字且不被锁定。 示例 4: 输入: deadends = ["0000"],
 *         target = "8888" 输出：-1
 * 
 * 
 *         提示： 死亡列表 deadends 的长度范围为 [1, 500]。 目标数字 target不会在 deadends 之中。 每个
 *         deadends 和 target 中的字符串的数字会在 10,000 个可能的情况 '0000'到 '9999' 中产生。
 */
public class OpenTheLock {

	public static void main(String[] args) {
		OpenTheLock otl = new OpenTheLock();
		
		/*String[] deadends = new String[] { "0201", "0101", "0102", "1212", "2002" };
		String target = "0202";*/
		
		String[] deadends = new String[] { "8887","8889","8878","8898","8788","8988","7888","9888" };
		String target = "8888";
		
		System.out.println(otl.openLock(deadends, target));
	}

	/**
	 * 如何判断是否存在解？ 如果deadends
	 * 中的数的每一位的集合i到j，target每一位的值k，如果对于每一位都存在i<k<j并且i到j的集合中都含有k，那么不存在解。
	 * 例如举例3，第一位到第四位deadends中都包含了7，8和9，而target是8，这样无论怎么转动都无法避开deadends，
	 * 这种情况是无法存在解的。
	 * BFS
	 * @param deadends
	 * @param target
	 * @return
	 */
	public int openLock(String[] deadends, String target) {
        Queue<String> q = new LinkedList<>();
        Set<String> deads = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
 
        int depth = 0;
        String marker = "*";
        q.addAll(Arrays.asList("0000", "*"));
        while(!q.isEmpty()) {
            String node = q.poll();
            if(node.equals(target))
                return depth;
            if(visited.contains(node) || deads.contains(node))
                continue;
            if(node.equals(marker) && q.isEmpty())
                return -1;
            if(node.equals(marker)) {
                q.add(marker);
                depth += 1;
            } else {
                visited.add(node);
                q.addAll(getSuccessors(node));
            }
        }
        return depth;
    }
 
    private static List<String> getSuccessors(String str) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            res.add(str.substring(0, i) + (str.charAt(i) == '0' ? 9 :  str.charAt(i) - '0' - 1) + str.substring(i+1));
            res.add(str.substring(0, i) + (str.charAt(i) == '9' ? 0 :  str.charAt(i) - '0' + 1) + str.substring(i+1));
        }
        return res;
    }
}
