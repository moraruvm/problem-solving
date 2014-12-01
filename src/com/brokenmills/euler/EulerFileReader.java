package com.brokenmills.euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EulerFileReader {

	public int[][] readMatrix(String problemFile) throws FileNotFoundException {
		File f = new File(problemFile);
		Scanner fileReader = new Scanner(f);
		int rows = 0;
		int columns = 0;
		while (fileReader.hasNextLine()) {
			++rows;
			String line = fileReader.nextLine();
			Scanner colReader = new Scanner(line);
			if (columns == 0) {
				while (colReader.hasNextInt()) {
					++columns;
					colReader.nextInt();
				}
			}
			colReader.close();
		}
		fileReader.close();

		int[][] mat = new int[rows][columns];
		fileReader = new Scanner(f);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				int x = fileReader.nextInt();
				mat[i][j] = x;
			}
		}
		fileReader.close();

		return mat;
	}
}
