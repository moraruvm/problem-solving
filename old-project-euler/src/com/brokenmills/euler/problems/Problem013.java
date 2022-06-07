package com.brokenmills.euler.problems;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Work out the first ten digits of the sum of the following one-hundred
 * 50-digit numbers.
 * 
 * @author Vlad
 * @link https://projecteuler.net/problem=13
 */
public class Problem013 implements ProblemInterface {

	public static final int NUMBERS = 100;
	public static final int LENGTH = 50;
	public static final int[] digits = new int[100];

	@Override
	public void run(String[] args) throws Exception {
		Scanner scn = new Scanner(new File("inputFiles/p13/p13.txt"));
		String[] input = new String[NUMBERS];
		int i = 0;

		while (scn.hasNextLine() && i < NUMBERS) {
			input[i++] = scn.nextLine();
		}
		System.out.println(input[NUMBERS - 1]);

		// String[] numbers = Arrays.copyOf(input, input.length);
		for (int j = 0; j < input.length; j++) {

		}
	}

	private AddingResult addUpLine(String[] input, long remainder, int digit) {
		int k = LENGTH - digit;
		for (int i = 0; i < NUMBERS; i++) {
			char d = input[i].charAt(k);
		}
		// TODO unfinished business
		return null;
	}

	private class AddingResult {
		protected byte digit;
		protected long remainder;
	}

}
