package com.brokenmills.euler.problems;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the
 * multiples of 3 or 5 below 1000.
 * 
 * 
 * @author vlad.moraru
 */
public class Problem001 implements ProblemInterface {

	/**
	 * @see euler.run.ProblemInterface#run(java.lang.String[])
	 */
	public void run(String[] args) {
		long initTime = System.nanoTime();
		this.solution1();
		long finishTime = System.nanoTime();
		System.out.println("It took " + (finishTime - initTime) / 1000000 + " milliseconds");
	}

	private void solution1() {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0) {
				sum += i;
			} else if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum : " + sum);
	}

}
