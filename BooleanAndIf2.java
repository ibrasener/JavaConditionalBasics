/*import java.util.Scanner;
public class BooleanAndIf2 {	
	public static void main(String[]args) {
		int number1=(int)(Math.random()*10);
	System.out.print(number1);	*/
	
	
	public class BooleanAndIf2 {
		public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in); 
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		System.out.println("(x < y && y < z) is " + (x < y && y < z)); 
		System.out.println("(x < y || y < z) is " + (x < y || y < z)); 
		System.out.println("!(x < y) is " + !(x < y)); 
		System.out.println("(x + y < z) is " + (x + y < z));
		System.out.println("(x + y > z) is " + (x + y > z));
		}
		

	}


