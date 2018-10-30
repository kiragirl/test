package leetcode.easy.array;

/**
 * 66. 加一
 * @author yiming.li
 *  给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
	最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
	你可以假设除了整数 0 之外，这个整数不会以零开头。
	示例 1:
	输入: [1,2,3]
	输出: [1,2,4]
	解释: 输入数组表示数字 123。
	示例 2:
	输入: [4,3,2,1]
	输出: [4,3,2,2]
	解释: 输入数组表示数字 4321。
 */
public class PlusOne {

	public static void main(String[] args) {
		int[] nums = new int[]{9,9};
		PlusOne plusOne = new PlusOne();
		plusOne.plusOne(nums);
	}

	public int[] plusOne(int[] digits) {
		int[] nums = new int[digits.length+1];
		for(int i=digits.length-1;i>=0;i--){
			if(digits[i]<9){
				digits[i] = digits[i]+1;
				break;
			}else{
				digits[i] = 0;
			}
		}
		if(digits[0]==0){
			nums[0] = 1;
			for(int j=1;j<nums.length-1;j++){
				nums[j] = digits[j-1];
			}
		}
		return nums[0]>=1?nums:digits;
	}
}
