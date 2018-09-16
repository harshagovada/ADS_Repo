/**
 * 
 */
package com.cci.as.pkg;

/**
 * @author Harsha Govada
 *
 *         Implementation to rotate an NxN matrix image by 90 degrees
 */
public class RotateMatrix {
	public static void main(String[] args) {
		int n = 4;
		int[][] matrix = new int[n][n];
		int count = 0;
		// Initializing the array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = ++count;
			}
		}
		// Works for only 4x4 matrix, used only for testing
		for (int i = 0; i < n; i++) {
			int j = 0;
			System.out.println(matrix[i][j] + " " + matrix[i][++j] + " " + matrix[i][++j] + " " + matrix[i][++j]);
		}
		rotate(matrix, n);
	}

	// We are swapping each side of a layer to it adjacent left side.
	private static void rotate(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; ++layer) { // looping with respect to each layer
			int first = layer; // Initializing the first layer
			int last = n - 1 - layer; // Initializing the last layer
			for (int i = first; i < last; ++i) {
				int offset = i - first; // setting the offset to limit elements at layer level
				int top = matrix[first][i]; // storing the element at first,i th element in a buffer
				matrix[first][i] = matrix[last - offset][first]; // left to top
				matrix[last - offset][first] = matrix[last][last - offset]; // bottom to left
				matrix[last][last - offset] = matrix[i][last]; // right to bottom
				matrix[i][last] = top; // top to right
			}
		}
		// Works for only 4x4 matrix, used only for testing
		for (int i = 0; i < n; i++) {
			int j = 0;
			System.out.println(matrix[i][j] + " " + matrix[i][++j] + " " + matrix[i][++j] + " " + matrix[i][++j]);
		}
	}
}
