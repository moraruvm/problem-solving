package com.brokenmills.euler.problems;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is
 * 13.
 * 
 * What is the 10 001st prime number?
 * 
 * @author vlad.moraru
 */
public class Problem007 implements ProblemInterface {

  /**
   * @see eulerproject.run.ProblemInterface#run(java.lang.String[])
   */
  public void run(String[] args) {
    double n = 1;
    int count = 2;
    while (count <= 10001) {
      n += 2;
      if (isPrime(n)) {
        System.out.println(n + " " + count);
        count++;
      }
    }
  }

  private boolean isPrime(double n) {
    if (n % 2 == 0) {
      return false;
    }
    double div = 3;
    boolean prime = true;
    while (div <= Math.abs(Math.sqrt(n)) && prime) {
      if (n % div == 0) {
        prime = false;
      }
      div += 2;
    }
    return prime;
  }
}
