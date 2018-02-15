import java.util.Scanner;
public class switchh {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int day = input.nextInt();
		switch (day) { 
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: System.out.println("Weekday"); break; 
			case 0:
			case 6: System.out.println("Weekend"); }

	}

}
