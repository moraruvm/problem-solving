package com.brokenmills.euler.problems;

import com.brokenmills.euler.Timer;

/**
 * What is the value of the first triangle number to have over five hundred
 * divisors?
 * 
 * @author Vlad
 * @link https://projecteuler.net/problem=12
 * 
 */
public class Problem012 implements ProblemInterface {

	@Override
	public void run(String[] args) throws Exception {
		int divs = 0;
		long sum = 0;
		long idx = 1;

		Timer timer = new Timer();
		timer.start();
		while (divs <= 500) {
			sum += idx++;
			divs = noFactors(sum);
		}
		long end = System.nanoTime();
		timer.stop();
	}

	private int noFactors(long n) {
		int factors = 1;
		int power = 0;
		long fn = n;
		while (fn % 2 == 0) {
			fn = fn / 2;
			power++;
		}
		factors *= power + 1;

		for (int i = 3; i < Math.round(Math.sqrt(n)) && fn != 1; i += 2) {
			power = 0;
			while (fn % i == 0) {
				fn = fn / i;
				power++;
			}
			factors *= power + 1;
		}

		if (fn != 1) {
			factors = 2;
		}

		return factors;
	}

}
