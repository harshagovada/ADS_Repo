/**
 * 
 */
package com.ctci.as.pkg;

/**
 * @author Harsha Govada
 *
 *         From an MxN matrix, if an element is identified to be a 0, set the
 *         entire row and column elements to 0.
 */
public class ZeroMatrix {
	public static void main(String[] args) {
		int m = 5, n = 4;
		int[][] matrix = new int[m][n];
		int count = -1;
		// Initializing the matrix
		for (int j = n - 1; j >= 0; j--) {
			for (int i = m - 1; i >= 0; i--) {
				matrix[i][j] = ++count;
			}
		}
		matrix = setZeros(matrix);
	}

	private static int[][] setZeros(int[][] matrix) {
		// creating boolean array with the size of row and column to set to true
		// whenever there is a 0 encounter
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		// Setting true to every [m][n]th position in the matrix where 0 is encountered
		// once set to true entire row/column will be set to 0 later
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < column.length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}

		// Replacing zeros for the row, where ever true is encountered in boolean 
		// row array
		for (int i = 0; i < row.length; i++) {
			if (row[i]) {
				for (int j = 0; j < column.length; j++) {
					matrix[i][j] = 0;
				}
				break;
			}
		}
		// Replacing zeros for the column, where ever true is encountered in boolean
		// column array
		for (int j = 0; j < column.length; j++) {
			if (column[j]) {
				for (int i = 0; i < row.length; i++) {
					matrix[i][j] = 0;
				}
				break;
			}
		}
		return matrix;
	}

}
