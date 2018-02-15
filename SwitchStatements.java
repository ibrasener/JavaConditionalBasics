import java.util.Scanner;
public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year =input.nextInt();
	
		String message= "Chinese new year is  ";
		switch(year%4) {
			case 0: 
				message = message+"OX";
				break;
			case 1:
				message= message+"Rat";		
			case 2:
				message= message +"Dog";
				break;
			case 3:
				message= message+ "Cat";
				break;
			default:
				message="Öyle bişi yok";
				break;
				
	   }
		System.out.println(message);
	}
 }
