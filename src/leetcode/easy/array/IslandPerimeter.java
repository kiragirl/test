package leetcode.easy.array;

/**
 * 463. Island Perimeter
 * 
 * @author yiming.li
 * @description You are given a map in form of a two-dimensional integer grid
 *              where 1 represents land and 0 represents water. Grid cells are
 *              connected horizontally/vertically (not diagonally). The grid is
 *              completely surrounded by water, and there is exactly one island
 *              (i.e., one or more connected land cells). The island doesn't
 *              have "lakes" (water inside that isn't connected to the water
 *              around the island). One cell is a square with side length 1. The
 *              grid is rectangular, width and height don't exceed 100.
 *              Determine the perimeter of the island. Example: 
 *              [[0,1,0,0],
 *               [1,1,1,0], 
 *               [0,1,0,0], 
 *               [1,1,0,0]] 
 *              Answer: 16 Explanation: The
 *              perimeter is the 16 yellow stripes in the image below:
 * 
 */
public class IslandPerimeter {
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] nums = new int[][] { { 0, 1, 1, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		IslandPerimeter islandPerimeter = new IslandPerimeter();
		System.out.println(islandPerimeter.islandPerimeter(nums));
	}

	public int islandPerimeter(int[][] grid) {
		int count = 0;
		int n = grid.length;
		for (int i = 0; i < n; i++) {
			int[] a = grid[i];
			int m = a.length;
			for (int j = 0; j < m; j++) {
				int b = a[j];
				if (b == 1) {

					if (j == 0) {
						count++;
					} else if (a[j - 1] == 0) {
						count++;
					}

					if (i == 0) {
						count++;
					} else if (grid[i - 1][j] == 0) {
						count++;
					}

					if (j == m - 1) {
						count++;
					} else if (a[j + 1] == 0) {
						count++;
					}

					if (i == n - 1) {
						count++;
					} else if (grid[i + 1][j] == 0) {
						count++;
					}
				}
			}
		}
		return count;
	}
}