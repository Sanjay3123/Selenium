package week1.day1;

public class Factorial {

	public static void main(String[] args) {

		// Declare your input as 5
		int i, fact = 1, number = 5;
		{
			System.out.println("i ---- fact");
		}
		// Declare an integer variable fact as 1

		// Iterate from 1 to your input (tip: using loop concept)
		for (i = 1; i <= number; i++)

		// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to
		// the 'fact' variable)
		{
			fact = fact * i;

			// Print factorial (fact)
			System.out.println(i + "    " + fact);

			// End of loop
		}

		System.out.println("Factorial number of " + number + "=" + fact);

	}

}
