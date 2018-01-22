/**
 * @author:liyiming
 * @date:2017年8月17日
 * Description:
 **/
package test;

import java.util.Arrays;

/**
 * Title: QuikSort Description: Company:pusense
 * 
 * @author ：lyiming
 * @date ：2017年8月17日
 **/
public class QuikSort{
	public static void main(String[] args)
	{
		Integer i=null;
		a a = new a();
		if(a.getAa() != null){
			System.out.println("qwew");
		}
		System.out.println("qwew1");
		QuikSort quikSort = new QuikSort();
		int arr[] = {7,8,1,5,4,3,9,54,2,578,25,36,14,47,58,69,36,26,85,95,15,96,47,12};
		System.out.println(arr.length);
		//quikSort.sort(arr, 0, arr.length-1);
	}
	public void sort(int arr[], int low, int high) {
		int l = low;
		int h = high;
		int povit = arr[low];

		while (l < h) {
			while (l < h && arr[h] >= povit)
				h--;
			if (l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				l++;
			}

			while (l < h && arr[l] <= povit)
				l++;

			if (l < h) {
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				h--;
			}
		}
		//Arrays.asList(arr).stream().forEach(s -> System.out.println(s));
		for(int a:arr){
			System.out.print(a);
			System.out.print(" ");
		}
		//System.out.println(arr.toString());
		System.out.print("l=" + (l + 1) + "h=" + (h + 1) + "povit=" + povit
				+ "\n");
		if (l > low)
			sort(arr, low, l - 1);
		if (h < high)
			sort(arr, l + 1, high);
	}
}
class a {
	private Integer aa;

	public Integer getAa() {
		return aa;
	}

	public void setAa(Integer aa) {
		this.aa = aa;
	}
}
