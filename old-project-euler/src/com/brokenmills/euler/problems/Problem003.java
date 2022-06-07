package com.brokenmills.euler.problems;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author vlad.moraru
 */
public class Problem003 implements ProblemInterface {

  /**
   * @see euler.run.ProblemInterface#run(java.lang.String[])
   */
  public void run(String[] args) {
    long n = 600851475143l;
    long term = 1;
    while (n != 1) {
      term += 2;
      while (n % term == 0) {
        n = n / term;
      }
    }
    System.out.println(term);
  }
}
