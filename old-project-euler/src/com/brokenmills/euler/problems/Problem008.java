package com.brokenmills.euler.problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Find the greatest product of five consecutive digits in the 1000-digit number. (See
 * "Problem008.txt")
 * 
 * @author vlad.moraru
 */
public class Problem008 implements ProblemInterface {

  /**
   * @see eulerproject.run.ProblemInterface#run(java.lang.String[])
   */
  public void run(String[] args) {
    String number = "";
    String fileName = "res/Problem008.txt";
    File sourceFile = new File(fileName);
    try {
      Scanner scn = new Scanner(sourceFile);
      while (scn.hasNext()) {
        number = number + scn.next();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    double sum = 1;
    for (int i = 0; i < 5; i++) {
      sum *= Integer.parseInt(String.valueOf(number.charAt(i)));
    }

    for (int j = 1; j < number.length() - 4; j++) {
      double auxSum = 1;
      for (int i = 0; i < 5; i++) {
        auxSum *= Integer.parseInt(String.valueOf(number.charAt(j + i)));
      }
      if (auxSum > sum) {
        sum = auxSum;
      }
    }
    System.out.println(sum);
  }

}
