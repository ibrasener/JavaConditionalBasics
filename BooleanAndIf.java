import java.util.Scanner;
public class BooleanAndIf {

  public static void main(String[] args) {
		
	// TODO Auto-generated method stub
		/* boolean b=1<2; // because this expression is given true or false.
		if (b){
			System.out.println("a");
			//a 
		System.out.println(b);	
		//true
		*/
	  
	Scanner input= new Scanner(System.in);
	System.out.print("Enter an integer: ");	
	int number= input.nextInt();
	
	if (number %2==0) 
		System.out.println(number +" is a even");
	
	else 
		System.out.println(number + " is a odd");	
	// You can add braces but its up to you	
			
	// Scanner input = new Scanner(System.in);	
	 System.out.print("Please enter the score: ");
	 int score = input.nextInt();
	 
	 if (score >= 90.0) 
		 System.out.print("A");
	 else
		  if (score >= 80.0)
			  System.out.print("B"); else
				  if (score >= 70.0) 
					  System.out.println("C");
				  else
					  if (score >= 60.0)
						  System.out.println("D"); 
					  else 
						  System.out.println("F");
	 
	 //TODO 2
	 System.out.println("Please type the point: ");
	 double point= input.nextDouble();
	 if (point>=90)
		 System.out.println("A");
	 else if (point >=80)
		 System.out.println("B");
	 else if (point >=70)
		 System.out.println("C");
	 else if (point >= 60)
		 System.out.println("D");
	 else 
		 System.out.println("AN");
	 
	 
	//+++++++++++++++++++++++++++++++++++++++++++
	boolean even = number %2==0;
	//is same like 
	if (number % 2==0)
		even =true;
	else 
		even = false;	
	// Its mean output yapilirsa number true yada false verir
	}
		
}


