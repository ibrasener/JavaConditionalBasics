import java.util.Scanner;

public class ISBNcode {

	public static void main(String[] args) {
/*(Business: check ISBN-10) An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. 
 The last digit, d10, is a checksum, which is calculated from the other nine digits using the following formula:
		
(d1 *1+d2 *2+d3 *3+d4 *4+d5 *5+ d6 *6+d7 *7+d8 *8+d9 *9)%11
If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
 Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros).
	 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your ISBN(9 digits): ");
		String ISBN_digits=input.next().trim();
		
		if (ISBN_digits.length()==9) {
			int d1=Integer.parseInt(ISBN_digits.substring(0, 1));
			System.out.print(d1);
			int d2 = Integer.parseInt(ISBN_digits.substring(1, 2));
			int d3 = Integer.parseInt(ISBN_digits.substring(2, 3));
			int d4 = Integer.parseInt(ISBN_digits.substring(3, 4));
			int d5 = Integer.parseInt(ISBN_digits.substring(4, 5));
			int d6 = Integer.parseInt(ISBN_digits.substring(5, 6));
			int d7 = Integer.parseInt(ISBN_digits.substring(6, 7));
			int d8 = Integer.parseInt(ISBN_digits.substring(7, 8));
			int d9 = Integer.parseInt(ISBN_digits.substring(8));

			// Compute d10
			int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
					 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

			// Display the 10-digit ISBN
			System.out.println(
				"The ISBN-10 number is " + ISBN_digits + ((d10 == 10) ? "X" : d10));

			
		}
		
		
	}

}
