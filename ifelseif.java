import java.util.Scanner;
public class ifelseif {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Where do you live(H-house, A-apartment, D-dormitory)?");
		char house= input.next().toUpperCase().charAt(0);
		
		System.out.print("On average, how many hours per day are you home? ");
		int hours= input.nextInt();
	
			if (house == 'H') {
				if (hours>= 18 )
					System.out.print("You should get a A");
				else if (10 <= hours && hours< 18)
					System.out.print("You should get a B");
			}
			else if (house == 'A') {
				
				if (hours>= 10)
					System.out.print("You should get a C");
			}
			else if (house == 'D') {
			
				if (hours>= 6 ) 
					System.out.print("You should get a D");	
				}


	}

}
