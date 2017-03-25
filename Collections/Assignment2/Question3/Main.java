package Collections.Assignment2.Question3; /*********************************************************************************
* (Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented *
* using composition. Define a new stack class that extends ArrayList.            *
* Write a test program that prompts the user to enter five strings and displays them in       *
* reverse order.                                                                 *
*********************************************************************************/
import java.util.Scanner;

public class Main {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create a MyStack
		MyStack stack = new MyStack();

		// Prompt the user to enter five strings
		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) {
			stack.push(input.next());	
		}

		// Display in reverse order
		System.out.println("Stack: " + stack.toString());
	}
}