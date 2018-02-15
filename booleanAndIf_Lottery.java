import java.util.Scanner;
public class booleanAndIf_Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter your guess (two digits): ");
		int guess = input.nextInt();
		
		int PrizeNum = (int)(Math.random()*100); //*100 because I multiply with 
		int digitPrize1= PrizeNum / 10;
		int digitPrize2= PrizeNum % 10;
		//two digit number
		int digit1= (int) guess / 10;
		int digit2= (int) guess % 10;
		
		System.out.println("The lottery number is "+ PrizeNum);
		
		if (guess==PrizeNum) 
			System.out.println("Congratilations, You won the award which is $10,000.");
		else if (digit1 == digitPrize2 && digit2==digitPrize1 )
			System.out.println("Match all digits: you win $3,000");
		else if (digit1 == digitPrize1 
				|| digit1 == digitPrize2
				|| digit2 == digitPrize1 
				|| digit2 == digitPrize2) 
			System.out.println("Match one digit: you win $1,000");
		else	
			System.out.println("Try again :( ");
	}

}
