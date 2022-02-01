import java.util.Scanner;
public class App {
    public static void main(String[] args){
//will calculate average test score ut of 3 tests
		// create a Scanner object to get input from the keyboard
		Scanner input = new Scanner (System.in);

		// declare variables 
		int test1, test2, test3; // variable that will store first test score
		final int NUM_TESTS = 3;
		double average; 
		
		
		// Get the Input
		System.out.print("Enter the score on the first test: "); // get first test score
		test1 = input.nextInt(); // read in the next integer
		System.out.print("Enter the score on the second test: "); // get second test score
		test2 = input.nextInt();
		System.out.print("Enter the score on the third test: ");
		test3 = input.nextInt();
		// Calculate the average
		average = (test1 + test2 + test3) / (double) NUM_TESTS; // add all scores first then divide by 3 to get average

		// Display Results
		System.out.println("Your first test score: " + test1); // prints what first test score is
		System.out.println("Your second test score: " + test2);
		System.out.println("Your third test score: " + test3);
		System.out.println("Your average score is: " + average); // prints average score
    }
}
