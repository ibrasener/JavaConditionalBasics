import java.util.Scanner;


public class StudentsMajorandStatus {

	public static void main(String[] args) {
		
		//M: Mathematics
		//C: Computer Science
		//I: Information Technology
		Scanner input=new Scanner(System.in);
		System.out.print("Enter two characters: ");
		String twoCharacters=input.next().toUpperCase().trim();
		char major=(char)twoCharacters.charAt(0);
		char years=(char)twoCharacters.charAt(1);
		
		// I declared
		
		if(Character.isLetter(twoCharacters.charAt(0))
				&&(Character.isDigit(twoCharacters.charAt(1)))){
			
		String lesson="";
		switch(major) {
		case 'M': lesson= "Math "; break;
		case 'I': lesson= "Info Tech "; break;
		case 'C': lesson= "Computer Science "; break;
		}
		String year="";
		switch(years) {
		case '1': year= "freshman "; break;
		case '2': year=  "sophomore "; break;
		case '3': year= "junior "; break;
		case '4': year= "senior ";

		}
		System.out.print(lesson+year);
		}
		else {
			System.out.print("Invalid");

		}
	}

}
	
