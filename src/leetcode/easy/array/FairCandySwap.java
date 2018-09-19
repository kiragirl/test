package leetcode.easy.array;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

	public static void main(String[] args) {
		int[] A = new int[] { 1, 1 };
		int[] B = new int[] { 2, 2 };
		FairCandySwap fairCandySwap = new FairCandySwap();
		fairCandySwap.fairCandySwap(A, B);
	}

	public int[] fairCandySwap(int[] A, int[] B) {
		int[] C = new int[2];
		int sumA = 0;
		int sumB = 0;
		for (int i = 0; i < A.length; i++) {
			sumA += A[i];
		}
		for (int i = 0; i < B.length; i++) {
			sumB += B[i];
		}
		int k = sumA - sumB;
		Set<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			hashSet.add(2*A[i]-k);
		}
		for(int i = 0; i < B.length; i++){
			if(hashSet.contains(2*B[i])){
				C = new int[]{(2*B[i]+k)/2,B[i]};
				return C;
			}
		}
		return C;
	}
}
