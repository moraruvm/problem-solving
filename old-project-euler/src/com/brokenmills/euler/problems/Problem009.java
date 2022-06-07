package com.brokenmills.euler.problems;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a2 + b2 = c2
 * 
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.
 * 
 * 
 * @author vlad.moraru
 */
public class Problem009 implements ProblemInterface {

  /**
   * @see eulerproject.run.ProblemInterface#run(java.lang.String[])
   */
  public void run(String[] args) {
    // TODO
    double sum = 1000;
    for (int a = 2; a < 500; a++) {
      for (int b = 2; b < 500; b++) {
        double c = a * a + b * b;
        if (Math.sqrt(c) % 1 == 0) {
          c = Math.sqrt(c);
          if (a + b + c == sum) {
            double product = a * b * c;
            System.out.println(product);
          }
        }
      }
    }
  }
}
