package com.brokenmills.euler.problems;

/**
 * he sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 * @author vlad.moraru
 */
public class Problem010 implements ProblemInterface {

  /**
   * @see eulerproject.run.ProblemInterface#run(java.lang.String[])
   */
  public void run(String[] args) {
    //
    int size = 2000000;// 2 million
    boolean[] primes = new boolean[size];
    long sum = 0;

    for (int i = 2; i < size; i++) {
      primes[i] = true;
    }

    for (int i = 2; i * i < size; i++) {
      if (primes[i]) {
        for (int j = i; i * j < size; j++) {
          primes[i * j] = false;
        }
      }
    }

    for (int i = 2; i < size; i++) {
      if (primes[i]) {
        sum += i;
      }
    }
    System.out.println(sum);

  }

}
