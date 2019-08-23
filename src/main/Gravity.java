/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;


// uncomment the above line to use input in your program.

import java.util.Scanner;

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
		Scanner scanner = new Scanner(System.in);
		//Taking time input
		double time = scanner.nextDouble();
		double g = 9.8;
		double speed = g * time;
		double a = ((double)1)/2;
		double distance = a * g * (time * time);
		System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + " seconds after the release is " + distance);

	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
