/*
	 File: Lesson 1.5: Characters
	 Author: Angie
	 Date Created: February 18, 2026
	 Date Last Modified: February 19, 2026
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
		
		char b; 
		String word;
		

		System.out.print("Input a word: ");
		word = input.nextLine();
		//word
		//0123 (REMEMBER IT STARTS AT 0)

		b = word.charAt(2);
		input.nextLine(); //clear scanner

		System.out.println(b);

		}

	public static void q3() {
		//Write question 3 code here
		/*Ask the user to "Input a word: ". Output "The second character user 
		entered was: " followed by the second character of the word 
		they entered. */

		Scanner input = new Scanner(System.in);

		String word;
		char c;

		System.out.print("Input a word: ");
		word = input.nextLine();

		c = word.charAt(1);
		System.out.print("The second character user entered was: " + c);
		input.nextLine(); //clear scanner

	}

	public static void q4() {
		//Write question 4 code here
		/*Ask the user to "Input a number: ", save it as an integer. 
		Output "Your number plus 1 is: " Followed by their number increased by one. 
		Do not alter the variable the input was saved in. */

		Scanner input = new Scanner(System.in);

		int number;
		System.out.print("Input a number: ");
		number = input.nextInt();
		System.out.println("Your number plus 1 is: " + (number + 1));
	
		input.nextLine(); //clear scanner


	}

	public static void q5() {
		//Write question 5 code here
		/*
		5. Ask the user to "Input a letter: ", save it as a string, then save it as a character.
	 	Ask the user to "Input another letter: ", save it as a string, then save it as a character.
	 	Output the result of the characters _added_ together (not concatenated).
	*/

		Scanner input = new Scanner(System.in);

		String letter;
		System.out.print("Input a letter: ");
		letter = input.nextLine();
		input.nextLine(); //clear scanner

		
		char d;
		d = letter.charAt( 0);

		String anotherLetter;
		System.out.print("Input another letter: ");
		anotherLetter = input.nextLine();
		
		char e;
		e = anotherLetter.charAt(0);

		System.out.print(d + e);
		input.nextLine(); //clear scanner



	 }

}
