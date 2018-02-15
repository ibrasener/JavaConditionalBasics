import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The letter: ");
		char letter = input.nextLine().toUpperCase().charAt(0);
		
		if(Character.isLetter(letter)) {
			switch(letter) {
			case 'A':
			case 'E':
			case 'I':
			case 'U':
			case 'O': System.out.println(letter+" is a vowel");
			break;
			default:System.out.println(letter+" is a consonant");
			}
				
		}
		else {
			System.out.println(letter+" is an invalid");
		}

	}

}
