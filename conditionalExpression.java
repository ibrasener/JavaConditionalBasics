import java.util.Scanner;

public class conditionalExpression {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		// you dont need to ask the user 
		// because it doesnt shows on the screen but you can typied
	
		//System.out.print(x>y && y>z ?"sorted":"not sorted");

		
		double x=input.nextDouble();
		double y=input.nextDouble();
		double z=input.nextDouble();
		
		System.out.print(x>y && y>z ?"sorted":"not sorted");
		
		
	}

}
