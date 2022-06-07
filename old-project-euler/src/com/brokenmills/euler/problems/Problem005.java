package com.brokenmills.euler.problems;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any
 * remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * 
 * @author vlad.moraru
 */
public class Problem005 implements ProblemInterface {

  /**
   * @see euler.run.ProblemInterface#run(java.lang.String[])
   */
  public void run(String[] args) {
    long small = 1;
    // for (int i = 2; i < 21; i++) {
    // small *= i;
    // }

    boolean found = false;
    long n = small;

    do {
      if (divisible(n)) {
        System.out.println(n);
        found = true;
      }
      n++;
    } while (!found);

  }

  private boolean divisible(long n) {
    for (int i = 20; i > 1; i--) {
      if (n % i != 0) {
        return false;
      }
    }
    return true;
  }

}
