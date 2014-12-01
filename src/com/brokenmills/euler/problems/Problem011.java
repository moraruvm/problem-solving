package com.brokenmills.euler.problems;

import com.brokenmills.euler.EulerFileReader;
import com.brokenmills.euler.Timer;
import com.brokenmills.euler.TimerInterface;

/**
 * In the 20×20 grid below, four numbers along a diagonal line have been marked
 * in red.
 * 
 * 08 02 (...) 67 48 The product of these numbers is 26 × 63 × 78 × 14 =
 * 1788696.
 * 
 * What is the greatest product of four a djacent numbers in the same direction
 * (up, down, left, right, or diagonally) in the 20×20 grid?
 * 
 * @author Vlad
 * @link https://projecteuler.net/problem=11
 * 
 */
public class Problem011 implements ProblemInterface {

	private static final int PRODUCT_FACTORS = 4;
	private static final TimerInterface timer = Timer.getTimer();
	private static int cols = 0;
	private static int rows = 0;
	private static int[][] mat;

	@Override
	public void run(String[] args) throws Exception {
		EulerFileReader reader = new EulerFileReader();
		mat = reader.readMatrix("inputFiles/p11/p11.txt");
		rows = mat.length;
		cols = mat[0].length;

		// print matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.printf("%3d", mat[i][j]);
			}
			System.out.println();
		}

		timer.start();
		long maxProduct = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				long product = max_multiply(i, j);
				if (product > maxProduct) {
					maxProduct = product;
				}
			}
		}
		System.out.println("Max product: " + maxProduct);
		timer.stop();
	}

	private static long max_multiply(int i, int j) {
		long maxLong = Math.max(0, multiply(i, j, 0, 1));
		maxLong = Math.max(maxLong, multiply(i, j, 1, -1));
		maxLong = Math.max(maxLong, multiply(i, j, 0, -1));
		maxLong = Math.max(maxLong, multiply(i, j, -1, -1));
		return maxLong;
	}

	private static long multiply(int i, int j, int x, int y) {
		int maxX = i + x * PRODUCT_FACTORS;
		int maxY = j + y * PRODUCT_FACTORS;
		if (maxX < 0 || maxX > rows) {
			return 0;
		}
		if (maxY < 0 || maxY > cols) {
			return 0;
		}

		long product = 1;
		for (int k = 0; k < PRODUCT_FACTORS; k++) {
			int ki = i + k * x;
			int kj = j + k * y;
			product *= mat[ki][kj];
		}

		return product;
	}

}
