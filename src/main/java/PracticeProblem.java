/*
	 File: Lesson 1.5: Characters
	 Author: Angie
	 Date Created: February 18, 2026
	 Date Last Modified: February 18, 2026
	*/

	import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		//Create a character variable with the value 'a'. Output it.

		char a;
		a = 'a';
		System.out.println(a);

	}

	public static void q2() {
		//Write question 2 code here
		/*Ask the user to "Input a word: ". Select the 3rd letter of the word and 
		output it. Remember to use the 3rd letter, not index 3.
		*/

		Scanner input = new Scanner(System.in);
		
		char letter; 
		String word;
		

		System.out.print("Input a word: ");
		word = input.nextLine();
		//word
		//0123 (REMEMBER IT STARTS AT 0)

		letter = word.charAt(2);
		input.nextLine(); //clear scanner

		System.out.println(letter);

		}

	public static void q3() {
		//Write question 3 code here
		/*Ask the user to "Input a word: ". Output "The second character user 
		entered was: " followed by the second character of the word 
		they entered. */

		Scanner input = new Scanner(System.in);

		String word;
		char secondLetter;

		System.out.print("Input a word: ");
		word = input.nextLine();
		input.nextLine(); //clear scanner

		secondLetter = word.charAt(1);
		System.out.print("The second character user entered was: " + secondLetter);

	}

	public static void q4() {
		//Write question 4 code here
		/*Ask the user to "Input a number: ", save it as an integer. 
		Output "Your number plus 1 is: " Followed by their number increased by one. 
		Do not alter the variable the input was saved in. */
	}

	public static void q5() {
		//Write question 5 code here
		/*
		5. Ask the user to "Input a letter: ", save it as a string, then save it as a character.
	 	Ask the user to "Input another letter: ", save it as a string, then save it as a character.
	 	Output the result of the characters _added_ together (not concatenated).
	*/

	 }

}
