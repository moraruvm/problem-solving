package com.brokenmills.euler.problems;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of
 * two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * 
 * @author vlad.moraru
 */
public class Problem004 implements ProblemInterface {

  /**
   * @see euler.run.ProblemInterface#run(java.lang.String[])
   */
  public void run(String[] args) {
    long max = 0;
    for (int i = 999; i > 100; i--) {
      for (int j = i; j > 100; j--) {
        long tot = i * j;
        if (isPalindrome(tot) && tot > max) {
          max = tot;
        }
      }
    }
    System.out.println(max);
  }

  private boolean isPalindrome(long x) {
    long aux = x;
    long reverse = 0;
    while (aux != 0) {
      long digit = aux % 10;
      reverse = 10 * reverse + digit;
      aux = aux / 10;
    }
    if (x == reverse) {
      return true;
    }
    return false;
  }

}
