package week1.day1;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
		// the series)

		int firstNumber = 0, secondNumber = 1, thirdNumber, count = 8;

		// Print first number

		System.out.print(firstNumber + " " + secondNumber);

		// Iterate from 1 to the range
		for (int i = 2; i <= count; i++)

		// add first and second number assign to sum
		{
			thirdNumber = firstNumber + secondNumber;

			// Assign second number to the first number

			firstNumber = secondNumber;

// Assign sum to the second number
			secondNumber = thirdNumber;

// print sum
			System.out.print(" " + thirdNumber);
		}
	}

}
