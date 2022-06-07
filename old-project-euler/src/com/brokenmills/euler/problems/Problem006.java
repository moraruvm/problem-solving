package com.brokenmills.euler.problems;

/**
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * @author Vlad
 */
public class Problem006 implements ProblemInterface {

	@Override
	public void run(String[] args) {
		long n = 100;
		long sqSum = n * (n + 1) * (2 * n + 1) / 6;
		long sumSq = n * (n + 1) / 2;
		sumSq *= sumSq;
		System.out.println(sumSq - sqSum);
	}
}