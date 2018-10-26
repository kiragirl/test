package leetcode.medium.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 * @author yiming.li
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
	示例 1:
	输入:
	[
	 [ 1, 2, 3 ],
	 [ 4, 5, 6 ],
	 [ 7, 8, 9 ]
	]
	输出: [1,2,3,6,9,8,7,4,5]
	示例 2:
	输入:
	[
	  [1, 2, 3, 4],
	  [5, 6, 7, 8],
	  [9,10,11,12]
	]
	输出: [1,2,3,4,8,12,11,10,9,5,6,7]
	
	[
	  [1, 2, 3, 4],
	  [5, 6, 7, 8],
	  [9,10,11,12]
	  13,14,15,16
	  17,18,19,20
	]
	
	[[1,11],
	 [2,12],
	 [3,13],
	 [4,14],
	 [5,15],
	 [6,16],
	 [7,17],
	 [8,18],
	 [9,19],
	 [10,20]]
	
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		//int[][] matrix = new int[][]{{1, 2, 3},{5, 6, 7},{9,10,11},{12,13,14},{15,16,17},{18,19,20}};
		int[][] matrix = new int[][]{{1,11},{2,12},{3,13},{4,14},{5,15},{6,16},{7,17},{8,18},{9,19},{10,20}};
		//int[][] matrix = new int[][]{{1, 2, 3, 4},{5, 6, 7, 8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		
		//int[][] matrix = new int[][]{{1},{5},{9},{13},{17}};
		//[[1],[2],[3],[4],[5],[6],[7],[8],[9],[10]]
		SpiralMatrix spiralMatrix = new SpiralMatrix();
		List<Integer> list = spiralMatrix.spiralOrder(matrix);
		for(int a:list){
			System.out.print(a);
			System.out.print(",");
		}
	}
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();
		if (matrix.length==0) {
			return list;
		}
		spiralOrderRecursion(matrix,0,list);
		return list;
    }
	
	public void spiralOrderRecursion(int[][] matrix,int beginRow,List<Integer> list){
		if(beginRow >= matrix[0].length/2+matrix[0].length%2){
			return;
		}
		for(int i=beginRow;i<matrix.length-beginRow;i++){
			int[] internalArray = matrix[i];
			if(i == beginRow){
				int j=beginRow;
				while(j<internalArray.length-beginRow){
					list.add(internalArray[j]);
					j++;
				}
			}else if(i > beginRow && i<matrix.length-beginRow-1){
				list.add(internalArray[internalArray.length-beginRow-1]);
			}else{
				int k = internalArray.length-beginRow-1;
				while(k>=beginRow){
					list.add(internalArray[k]);
					k--;
				}
			}
		}
		for (int i = matrix.length-beginRow-2; i > beginRow; i--) {
			int[] internalArray = matrix[i];
			for (int j=internalArray.length-beginRow-1; j > beginRow;) {
				list.add(internalArray[beginRow]);
				break;
			}
		}
		spiralOrderRecursion(matrix,beginRow+1,list);
	}
}
