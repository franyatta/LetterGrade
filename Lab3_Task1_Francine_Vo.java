/*
 * Lab3_Task1_Francine_Vo.java
 * Francine Vo
 * 01253035
 * 09/16/2023
 */
import java.util.Scanner;

public class Lab3_Task1_Francine_Vo {

	public static void main(String[] args) {
		// Declare Variables: Character Letter Grade
		char letter_grade;

		// Prompt user for letter grade
		System.out.print("Enter your letter grade: ");
		Scanner input = new Scanner(System.in);
		letter_grade = input.next().charAt(0);
		input.close();

		// Convert letter grade to upper-case
		letter_grade = Character.toUpperCase(letter_grade);

		// Use switch statement to determine message for letter grade
		switch (Character.toUpperCase(letter_grade)) {
			// A. FRANTASTIC!
			case 'A' :
				System.out.println("FRANTASTIC!");
				break;
			// B. good stuff
			case 'B' :
				System.out.println("good stuff");
				break;
			// C. Cs get Degrees
			case 'C' :
				System.out.println("Cs get degrees");
				break;
			// D. or F. uh-oh
			case 'D' :
			case 'F' :
				System.out.println("STUDY HARDER");
				break;
			// non valids
			default :
				System.out.println("Not a real grade.");
		}
	}

}
